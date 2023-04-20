package LP3.Lista_03;

public class LampadaMercado {
    private String marca; // Marca da lâmpada
    private int watts; // Potência em Watts
    private double valor; // Preço da lâmpada

    public LampadaMercado(String marca, int watts, double valor) {
        this.marca = marca;
        this.watts = watts;
        this.valor = valor;
    }

    // Início das operações get
    public String getMarca() {
        return marca;
    }

    public int getWatts() {
        return watts;
    }

    public double getValor() {
        return valor;
    }

    // Início das operações de validação
    private boolean validaInt(int num) {
        if (num > 0)
            return true;
        else
            return false;
    }

    private boolean validaDouble(double num) {
        if (num > 0)
            return true;
        else
            return false;
    }

    // Início das operações set
    public void setMarca(String text) {
        this.marca = text;
    }

    public void setWatts(int num) {
        if (validaInt(num)) {
            this.watts = num;
        } else {
            System.out.println("Invalid number!!");
            this.watts = 0;
        }
    }

    public void setValor(double num) {
        if (validaDouble(num)) {
            this.valor = num;
        } else {
            System.out.println("Invalid number!!");
            this.valor = 0;
        }
    }

    // Operação que faz o print das informações
    public void printaInformacoes() {
        System.out.println("Marca da lâmpada: " + marca);
        System.out.println("Potência da lâmpada: " + watts + "W");
        System.out.println("Preço da lâmpada: R$" + valor);
    }
}