public class Conta {
    private String nome;
    private float saldo;
    private boolean contaEspecial;

    // Construtor para conta especial
    public Conta(String nome, float saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.contaEspecial = true;
    }

    // Construtor para conta simples
    public Conta(String nome) {
        this.nome = nome;
        this.saldo = 0;
        this.contaEspecial = false;
    }

    // Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Método para fazer um depósito
    public void fazerDeposito(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    // Método para fazer a retirada de um valor
    public boolean fazerRetirada(float valor) {
        if (valor > 0) {
            if (contaEspecial || saldo >= valor) {
                saldo -= valor;
                System.out.println("Retirada realizada com sucesso");
                return true;
            } else {
                System.out.println("Saldo insuficiente para a retirada");
            }
        } else {
            System.out.println("Valor de retirada inválido");
        }
        return false;
    }

    public void mostrarDados() {
        System.out.println("Nome do correntista: " + nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Conta Especial: " + contaEspecial);
    }
}