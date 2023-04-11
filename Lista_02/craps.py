# Nome: Davi Roriz Oliveira
# Matrícula: 202210342

import random

dado1 = random.randint(1, 6) # Primeira jogada do Dado 1, a função random vai selecionar um valor aleatório entre 1 e 6
dado2 = random.randint(1, 6) # Primeira jogada do Dado 2, a função random vai selecionar um valor aleatório entre 1 e 6
print("=== Primeiro Estágio ===")
print(f"Dado 1: {dado1}")
print(f"Dado 2: {dado2}")
print(f"Soma: {dado1 + dado2}")
if (dado1 + dado2 == 7) or (dado1 + dado2 == 11): # Faz o teste, se a soma dos valores dos dados der 7 ou 11, o jogador venceu o jogo na primeira rodada
    print("Você venceu!!")
elif (dado1 + dado2 == 2) or (dado1 + dado2 == 3) or (dado1 + dado2 == 12): # Caso o jogador não tenha vencido, ele testa para saber se a soma resulta em 2, 3 ou 12, se for um desses valores, o jogador perdeu na primeira rodada
    print("Você perdeu!!")
else:
    parada = 0
    ponto = dado1 + dado2
    print("=== Segundo Estágio ===")
    while parada == 0:
        dado1 = random.randint(1, 6)
        dado2 = random.randint(1, 6)
        print(f"Dado 1: {dado1}")
        print(f"Dado 2: {dado2}")
        print(f"Soma: {dado1 + dado2}")
        if (dado1 + dado2 == ponto):
            print("Você venceu!!")
            parada = 1
        elif (dado1 + dado2 == 7):
            print("Você perdeu!!")
            parada = 1
