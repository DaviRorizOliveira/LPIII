# Nome: Davi Roriz Oliveira
# Matrícula: 202210342

import random

dado1 = random.randint(1, 6)
dado2 = random.randint(1, 6)
parada = 0
print("=== Primeiro Estágio ===")
print(f"Dado 1: {dado1}")
print(f"Dado 2: {dado2}")
print(f"Soma: {dado1 + dado2}")
if (dado1 + dado2 == 7) or (dado1 + dado2 == 11):
    print("Você venceu!!")
elif (dado1 + dado2 == 2) or (dado1 + dado2 == 3) or (dado1 + dado2 == 12):
    print("Você perdeu!!")
else:
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
