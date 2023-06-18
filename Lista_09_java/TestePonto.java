package Lista_09_java;

public class TestePonto {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(3, 4);
        Ponto2D ponto3 = new Ponto2D(4, 0);
        Ponto2D ponto4 = new Ponto2D(ponto2);

        Ponto3D ponto5 = new Ponto3D(3, 5, 4);
        Ponto3D ponto6 = new Ponto3D(ponto3, 0);

        // Testes com o Ponto2D
        System.out.println(ponto1.toString());
        System.out.println(ponto2.toString());
        System.out.println(ponto3.toString());
        System.out.println(ponto4.toString());

        System.out.println("Está no eixo X? " + ponto2.inAxisX());
        System.out.println("Está no eixo Y? " + ponto2.inAxisY());
        System.out.println("Está em algum eixo? " + ponto2.inAxis());
        System.out.println("Está na origem? " + ponto2.isOrigin());

        System.out.println("Está no eixo X? " + ponto3.inAxisX());
        System.out.println("Está no eixo Y? " + ponto3.inAxisY());
        System.out.println("Está em algum eixo? " + ponto3.inAxis());
        System.out.println("Está na origem? " + ponto3.isOrigin());

        double distancia = ponto2.distance(7, 3);
        System.out.println("Distância até o ponto (7, 3): " + distancia);

        distancia = ponto2.distance(ponto1);
        System.out.println("Distância até o ponto1: " + distancia);

        // Testes com o Ponto3D
        System.out.println(ponto5.toString());
        System.out.println(ponto6.toString());

        System.out.println("Está no eixo Z? " + ponto5.inAxisZ());
        System.out.println("Está no eixo Z? " + ponto6.inAxisZ());

        distancia = ponto5.distance(ponto6);
        System.out.println("Distância até o ponto6: " + distancia);
    }
}
