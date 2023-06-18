package Lista_09_java;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() { // Construtor sem parâmetros
        this(0, 0);
    }

    public Ponto2D(double x, double y) { // Construtor com 2 parâmetros
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D antigo) { // Construtor que usa um ponto já existente
        this(antigo.x, antigo.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() { // Método toString
        return "(" + x + ", " + y + ")";
    }

    public boolean inAxisX() {
        return y == 0;
    }

    public boolean inAxisY() {
        return x == 0;
    }

    public boolean inAxis() {
        return inAxisX() || inAxisY();
    }

    public boolean isOrigin() {
        return x == 0 && y == 0;
    }

    public double distance(double x, double y) {
        double deltaX = this.x - x;
        double deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distance(Ponto2D antigo) {
        return distance(antigo.x, antigo.y);
    }
}