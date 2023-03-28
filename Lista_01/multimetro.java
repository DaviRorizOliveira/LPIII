// Nome: Davi Roriz Oliveira
// Matrícula: 202210342
public class multimetro {
    public static void main(String[] args) {
        float[] valor = { 5, 5.2f, 5.1f, 5, 5.2f }; // Declaração de valores para teste de multímetro
        for (int a = 0; a < valor.length; a++) { // Laço for para printar cada elemento do vetor de valores
            System.out.println("Valor[" + (a + 1) + "]: " + valor[a]);
        }
        System.out.println("Média: " + calcula_media(valor)); // Print da média
        System.out.println("Desvio padrão: " + desvio(valor)); // Print do desvio padrão
        System.out.println();
        if (desvio(valor) > 0.1 * calcula_media(valor)) { // Teste para saber se o multímetro está funcionado
            System.out.println("O multimetro esta com problemas!");
        } else {
            System.out.println("O multimetro esta funcionando!");
        }
    }

    public static float calcula_media(float[] vetor) { // Faz a média dos valores do vetor de testes
        float soma = 0;
        for (int aux = 0; aux < vetor.length; aux++) {
            soma = soma + vetor[aux];
        }
        return soma / vetor.length;
    }

    public static float desvio(float[] vetor) { // Faz o desvio padrão dos valores do vetor de testes
        float media = calcula_media(vetor); // Faz a chamada da média para ser implementada na fórmula do desvio padrão
        float result = 0;
        for (int aux = 0; aux < vetor.length; aux++) {
            result = result + (vetor[aux] - media) * (vetor[aux] - media);
        }
        return (float) Math.sqrt(result / vetor.length);
    }
}