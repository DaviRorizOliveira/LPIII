// Nome: Davi Roriz Oliveira
// Matrícula: 202210342

// Este é um exemplo sobre a precedência de operadores em java, e a utilização de parênteses
public class operadores {
    public static void main(String[] args) {
        int a = 5, b = 1, c = 2;
        // Com o uso parênteses, a soma será realizada primeiro, e após isso, a
        // multiplicação, tendo como resultado 12
        int resultado_01 = (a + b) * c;
        // Sem o uso parênteses, a multiplicação será realizada primeiro, e após isso, a
        // soma, tendo como resultado 7
        int resultado_02 = a + b * c;
        System.out.println("Resultado sem parênteses será: " + resultado_01);
        System.out.println("Resultado com parênteses será: " + resultado_02);
    }
}
