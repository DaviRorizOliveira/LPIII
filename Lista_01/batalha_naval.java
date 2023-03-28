
// Nome: Davi Roriz Oliveira
// Matrícula: 202210342
import java.util.Scanner;

public class batalha_naval {
    public static final int TAM = 5; // Define o valor TAM como o tamanho do tabuleiro (5X5) e a quantidade de navios
                                     // de cada jogador

    public static void main(String[] args) {
        char[][] tabuleiro_1 = new char[TAM][TAM]; // Tabuleiro do jogador 1
        char[][] tabuleiro_2 = new char[TAM][TAM]; // Tabuleiro do jogador 2
        int parada = 0; // Variável auxiliar para o fim do jogo
        int player = 0; // Variável auxiliar para saber quem ganhou o jogo

        System.out.println("=== Bem vindo a Batalha Naval!! ==="); // Mensagem de início de jogo
        map_build(tabuleiro_1, 1); // Faz a construção do mapa do jogador 1
        personal_map_print(tabuleiro_1, 1); // Printa o mapa do jogador 1
        map_build(tabuleiro_2, 2); // Faz a construção do mapa do jogador 2
        personal_map_print(tabuleiro_2, 2); // Printa o mapa do jogador 2
        while (parada == 0 && player == 0) { // Laço while que faz a alternância de turnos até o fim do jogo
            turn(tabuleiro_2, 1); // Turno do jogador 1
            opponent_map_print(tabuleiro_2); // Printa o mapa do oponente após a jogada
            if (teste(tabuleiro_2) == 0) { // Faz um teste para ver se os navios do jogador 2 foram todos derrubados, em
                                           // caso positivo, a parada é ativada e encerra o jogo
                parada++;
                player++; // Incrementa a variável para mostar o ganhador
            }
            if (parada == 0 && player == 0) {
                turn(tabuleiro_1, 2); // Turno do jogador 2
                opponent_map_print(tabuleiro_1); // Printa o mapa do oponente após a jogada
                if (teste(tabuleiro_1) == 0) { // Faz um teste para ver se os navios do jogador 1 foram todos
                                               // derrubados, em caso positivo, a parada é ativada e encerra o jogo
                    parada++;
                    player = player + 2; // Incrementa a variável para mostar o ganhador
                }
            }
        }
        System.out.println("O jogador " + player + " venceu o jogo!!"); // Mensagem da vitória
    }

    public static void map_build(char[][] mapa, int player) { // Faz a construção dos mapas iniciais de cada jogador
        int x, y; // Variáveis para saber as coordenadas dos navios
        Scanner scanner = new Scanner(System.in);
        for (int a = 0; a < TAM; a++) { // Inicializa o mapa com -
            for (int b = 0; b < TAM; b++) {
                mapa[a][b] = '-';
            }
        }
        System.out.println("Jogador " + player + ", insira as coordenadas de seus navios!!");
        System.out.println("Os valores devem estar entre 0 e 5!!");
        System.out.println();
        for (int aux = 0; aux < TAM; aux++) { // Inicia a leitura dasposições dos navios
            System.out.print("Coordenada X do Navio[" + (aux + 1) + "]: ");
            x = scanner.nextInt();
            System.out.print("Coordenada Y do Navio[" + (aux + 1) + "]: ");
            y = scanner.nextInt();
            while (x < 0 || y < 0 || x > TAM - 1 || y > TAM - 1) { // Caso o jogador insira uma coordenada inválida, ele
                                                                   // mostra uma mensagem de erro e pede para ele
                                                                   // inserir as coordenadas novamente
                System.out.println("Coordenadas invalidas, insira novas coordenadas!!");
                System.out.print("Coordenada X do Navio[" + (aux + 1) + "]: ");
                x = scanner.nextInt();
                System.out.print("Coordenada Y do Navio[" + (aux + 1) + "]: ");
                y = scanner.nextInt();
            }
            while (mapa[x][y] == '@') { // Caso o jogador insira um local onde já há um navio, ele mostra uma mensagem
                                        // de erro e pede para ele inserir as coordenadas novamente
                System.out.println("Voce ja tem um navio aqui, insira novas coordenadas!!");
                System.out.print("Coordenada X do Navio[" + (aux + 1) + "]: ");
                x = scanner.nextInt();
                System.out.print("Coordenada Y do Navio[" + (aux + 1) + "]: ");
                y = scanner.nextInt();
            }
            mapa[x][y] = '@'; // Após a confirmação dascoordenadas ele substitui o local por @
        }
        System.out.println();
        System.out.println("Navios posicionados, vamos a guerra!!");
        System.out.println();
    }

    public static void personal_map_print(char[][] mapa, int player) { // Printa o mapa do jogador, mostrando a
                                                                       // localização de seus navios
        System.out.println("Mapa pessoal do jogador " + player + ":");
        for (int a = 0; a < TAM; a++) {
            for (int b = 0; b < TAM; b++) {
                System.out.print(mapa[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void opponent_map_print(char[][] mapa) { // Printa o mapa de seu oponente, ocultando o posicionamento
                                                           // dos navios adversários
        System.out.println("Mapa do seu oponente:");
        for (int a = 0; a < TAM; a++) {
            for (int b = 0; b < TAM; b++) {
                if (mapa[a][b] == '@') {
                    System.out.print("- ");
                } else {
                    System.out.print(mapa[a][b] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void turn(char[][] mapa, int player) { // Faz a jogada dos turnos
        int x, y; // Variáveis auxiliares para guardar as coordenadas do ataque
        Scanner scanner = new Scanner(System.in);
        System.out.println("Turno do jogador " + player);
        System.out.println("Insira a coordenada X de onde deseja atacar:");
        x = scanner.nextInt();
        System.out.println("Insira a coordenada Y de onde deseja atacar:");
        y = scanner.nextInt();
        while (x < 0 || y < 0 || x > TAM - 1 || y > TAM - 1) { // Caso o jogador insira uma coordenada inválida, ele
                                                               // mostra uma mensagem de erro e pede para ele inserir as
                                                               // coordenadas novamente
            System.out.println("Coordenadas invalidas, insira novas coordenadas!!");
            System.out.print("Coordenada X: ");
            x = scanner.nextInt();
            System.out.print("Coordenada Y: ");
            y = scanner.nextInt();
        }
        if (mapa[x][y] == '-') { // Caso não haja nada no local, ele subistitui por O
            mapa[x][y] = 'O';
            System.out.println("Nada foi atingido!!");
        }
        if (mapa[x][y] == '@') { // Caso haja um navio no local, ele afunda o navio e substitui por X
            mapa[x][y] = 'X';
            System.out.println("Um navio foi derrubado!!");
        }
    }

    public static int teste(char[][] mapa) { // Testa os mapas dos jogadores para saber se ainda há navios restantes, em
                                             // caso positivo, ele retorna 1, em caso negativo, ele retorna 0 e ativa a
                                             // parada do laço while
        for (int a = 0; a < TAM; a++) {
            for (int b = 0; b < TAM; b++) {
                if (mapa[a][b] == '@')
                    return 1;
            }
        }
        return 0;
    }
}