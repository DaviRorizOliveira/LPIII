public class TesteConta {
    public static void main(String[] args) {
        Conta teste = new Conta("Davi", 1000);
        teste.mostrarDados();

        teste.fazerDeposito(300);
        teste.mostrarDados();

        teste.fazerRetirada(500);
        teste.mostrarDados();

        teste.fazerRetirada(900);
        teste.mostrarDados();
    }
}