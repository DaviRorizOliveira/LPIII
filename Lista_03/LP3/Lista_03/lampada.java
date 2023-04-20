package LP3.Lista_03;

public class lampada {
    private boolean ligada; // Define a lâmpada como ligada ou desligada
    private boolean meiaLuz; // Define se a lâmpada está em meia-luz ou não
    private int luminosidade; // Define a luminosidade (brilho) da lâmpada

    public void Lampada() {
        this.ligada = false;
        this.meiaLuz = false;
        this.luminosidade = 0;
    }

    // Operação get
    public int getLuminosidade() {
        return luminosidade;
    }

    // Operações que definem a lâmpada como ligada / desligada / meia-luz
    public void acende() {
        this.ligada = true;
        this.meiaLuz = false;
        this.luminosidade = 100;
    }

    public void apaga() {
        this.ligada = false;
        this.meiaLuz = false;
        this.luminosidade = 0;
    }

    public void meiaLuz() {
        if (this.luminosidade > 0) {
            this.meiaLuz = true;
        } else {
            this.meiaLuz = false;
        }
    }

    // Operação que faz a validação do valor da luminosidade
    private boolean validaLuminosidade(int num) {
        if (num >= 0 && num <= 100)
            return true;
        else
            return false;
    }

    // Operações set
    public void setLuminosidade(int num) {
        if (validaLuminosidade(num)) {
            this.luminosidade = num;
        } else {
            System.out.println("Invalid number!!");
            this.luminosidade = 0;
        }
    }

    public void setEstado() {
        if (this.luminosidade == 0) {
            this.ligada = false;
            this.meiaLuz = false;
        } else if (this.luminosidade == 100) {
            this.ligada = true;
            this.meiaLuz = false;
        } else {
            this.ligada = true;
            this.meiaLuz = true;
        }
    }

    public void printaInformações() {
        if (this.ligada = false) {
            System.out.println("A lâmpada está desligada");
        } else if (this.ligada == true && this.meiaLuz == true) {
            System.out.println("A lâmpada está ligada e com 100% de seu brilho");
        } else {
            System.out.println("A lâmpada está em meia-luz e com " + this.luminosidade + "% de seu brilho");
        }
    }
}
