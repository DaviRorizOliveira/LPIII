# Nome: Davi Roriz Oliveira
# Matrícula: 202210342

import math

def calcula_media(vetor): # Função que faz o cálculo da média dos valores
    soma = 0
    for aux in range(len(vetor)):
        soma = soma + vetor[aux]
    return soma / len(vetor)
def desvio(vetor): # Função que faz o cálculo do desvio padrão dos valores
    media = calcula_media(vetor)
    result = 0
    for aux in range(len(vetor)):
        result = result + (vetor[aux] - media) * (vetor[aux] - media)
    return math.sqrt(result / len(vetor))

valor = [5, 5.2, 5.1, 5, 5.2] # Declaração de valores para teste de multímetro
for aux in range(len(valor)): # Laço for para printar cada elemento do vetor de valores
    print(f"Valor[{aux + 1}]: {valor[aux]}")
print(f"Média: {calcula_media(valor)}") # Print da média
print(f"Desvio padrão: {desvio(valor)}") # Print do desvio padrão
print()
if desvio(valor) > 0.1 * calcula_media(valor): # Teste para saber se o multímetro está funcionado
    print("O multímetro está com problemas!")
else:
    print("O multímetro está funcionando!")