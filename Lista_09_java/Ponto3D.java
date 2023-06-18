package Lista_09_java;

public class Ponto3D extends Ponto2D {
    private double z;

    public Ponto3D() {
        super();
        z = 0;
    }

    public Ponto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Ponto3D(Ponto2D ponto2D, double z) {
        super(ponto2D.getX(), ponto2D.getY());
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    public boolean inAxisZ() {
        return isOrigin();
    }

    public double distance(double x, double y, double z) {
        double deltaX = getX() - x;
        double deltaY = getY() - y;
        double deltaZ = this.z - z;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }

    public double distance(Ponto3D antigo) {
        return distance(antigo.getX(), antigo.getY(), antigo.getZ());
    }
}
