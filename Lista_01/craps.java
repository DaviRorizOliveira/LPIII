
// Nome: Davi Roriz Oliveira
// Matrícula: 202210342
import java.util.Random;

public class craps {
    public static void main(String[] args) {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1; // Valor que o dado 1 vai assumir
        int dado2 = random.nextInt(6) + 1; // Valor que o dado 2 vai assumir
        int ponto; // Ponto do jogador para ser usado caso seja necessário ir para a segunda etapa
        int parada = 0; // Variável auxiliar para parar o segundo estágio quando chegar ao 7 ou ao Ponto
        System.out.println("=== Primeiro Estágio ===");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Soma: " + (dado1 + dado2));
        if (dado1 + dado2 == 7 || dado1 + dado2 == 11) { // Teste para saber se o jogador ganhou na primeira etapa
            System.out.println("Você venceu!!");
        } else if (dado1 + dado2 == 2 || dado1 + dado2 == 3 || dado1 + dado2 == 12) { // Teste para saber se o jogador
                                                                                      // perdeu na primeira etapa
            System.out.println("Você perdeu!!");
        } else { // Caso não dê nenhum dos valores para a vitória ou derrota no primeiro estágio,
                 // ele parte para o segundo
            ponto = dado1 + dado2; // Cálculo para saber o Ponto que o jogador precisa alcançar na segunda etapa
            System.out.println("=== Segundo Estágio ===");
            while (parada == 0) {
                dado1 = random.nextInt(6) + 1; // Valor que o dado 1 vai assumir na segunda etapa
                dado2 = random.nextInt(6) + 1; // Valor que o dado 2 vai assumir na segunda etapa
                System.out.println("Dado 1: " + dado1);
                System.out.println("Dado 2: " + dado2);
                System.out.println("Soma: " + (dado1 + dado2));
                if (dado1 + dado2 == ponto) { // Teste para saber se o jogador ganhou na segunda etapa
                    System.out.println("Você venceu!!");
                    parada = 1; // Encerra a segunda etapa
                } else if (dado1 + dado2 == 7) { // Teste para saber se o jogador perdeu na segunda etapa
                    System.out.println("Você Perdeu!!");
                    parada = 1; // Encerra a segunda etapa
                }
            }
        }
    }
}