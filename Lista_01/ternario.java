
// Nome: Davi Roriz Oliveira
// Matrícula: 202210342
import java.util.Scanner;

// Este é um exemplo do uso do operador condicional em java, ele pede para o usuário inserir uma idade e o informa se com essa idade já é possível dirigir

public class ternario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.print("Digite uma idade: ");
        idade = scanner.nextInt();
        // Este é o operador ternário, a primeira instrução, a direita do operador de
        // atribuição, é a condição (idade >= 18). Também temos os operadores ? e : , o
        // primeiro diz respeito a instrução que será executada quando o teste
        // condicional for verdadeiro, já o segundo será utilizado quando o teste
        // condicional for falso. Quando verdadeiro, a variável recebe a mensagem do
        // operador ?, quando falso, a variável recebe a mensagem do operador :
        String mensagem = (idade >= 18) ? "Você tem idade para dirigir" : "Você não tem idade para dirigir";
        System.out.println(mensagem);
    }
}
