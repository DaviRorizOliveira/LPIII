# Nome: Davi Roriz Oliveira
# Matrícula: 202210342

TAM = 5

def map_build(mapa, player):
    TAM = len(mapa)
    x = 0
    y = 0
    #for a in range(TAM):
    #    for b in range(TAM):
    #        mapa[a][b] = '-'
    print(f"Jogador {player}, insira as coordenadas de seus navios!!")
    print("Os valores devem estar entre 0 e 5!!\n")
    for aux in range(TAM):
        print(f"Coordenada X do Navio[{aux + 1}]:", end = " ")
        x = int(input())
        print(f"Coordenada Y do Navio[{aux + 1}]:", end = " ")
        y = int(input())
        while x < 0 or y < 0 or x > TAM - 1 or y > TAM - 1:
            print("Coordenadas invalidas, insira novas coordenadas!!")
            print(f"Coordenada X do Navio[{aux + 1}]:", end = " ")
            x = int(input())
            print(f"Coordenada Y do Navio[{aux + 1}]:", end = " ")
            y = int(input())
        while mapa[x][y] == '@':
            print("Voce ja tem um navio aqui, insira novas coordenadas!!")
            print(f"Coordenada X do Navio[{aux + 1}]:", end = " ")
            x = int(input())
            print(f"Coordenada Y do Navio[{aux + 1}]:", end = " ")
            y = int(input())
        mapa[x][y] = '@'
    print("\nNavios posicionados, vamos a guerra!!\n")

def personal_map_print(mapa, player):
    print(f"Mapa pessoal do jogador {player}:")
    for a in range(TAM):
        for b in range(TAM):
            print(mapa[a][b], end = " ")
        print()
    print()

def opponent_map_print(mapa):
    print("Mapa do seu oponente:")
    for a in range(TAM):
        for b in range(TAM):
            if mapa[a][b] == '@':
                print("-", end = " ")
            else:
                print(mapa[a][b], end = " ")
        print()
    print()

def turn(mapa, player):
    x = 0
    y = 0
    print(f"Turno do jogador {player}")
    x = int(input("Insira a coordenada X de onde deseja atacar:"))
    y = int(input("Insira a coordenada Y de onde deseja atacar:"))
    while (x < 0) or (y < 0) or (x > TAM - 1) or (y > TAM - 1):
        print("Coordenadas inválidas, insira novas coordenadas!!")
        x = int(input("Coordenada X: "))
        y = int(input("Coordenada Y: "))
    if mapa[x][y] == '-':
        mapa[x][y] = 'O'
        print("Nada foi atingido!!")
    if mapa[x][y] == '@':
        mapa[x][y] = 'X'
        print("Um navio foi derrubado!!")

def teste(mapa):
    for a in range(TAM):
        for b in range(TAM):
            if mapa[a][b] == '@':
                return 1
    return 0

tabuleiro_1 = [['-' for _ in range(TAM)] for _ in range(TAM)]
tabuleiro_2 = [['-' for _ in range(TAM)] for _ in range(TAM)]
parada = 0
player = 0
print("=== Bem vindo a Batalha Naval!! ===")
map_build(tabuleiro_1, 1)
personal_map_print(tabuleiro_1, 1)
map_build(tabuleiro_2, 2)
personal_map_print(tabuleiro_2, 2)
while parada == 0 and player == 0:
    turn(tabuleiro_2, 1)
    opponent_map_print(tabuleiro_2)
    if teste(tabuleiro_2) == 0:
        parada += 1
        player += 1
    if parada == 0 and player == 0:
        turn(tabuleiro_1, 2)
        opponent_map_print(tabuleiro_1)
        if teste(tabuleiro_1) == 0:
            parada += 1
            player += 2
print(f"O jogador {player} venceu o jogo!!")
