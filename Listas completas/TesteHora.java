public class TesteHora {
    public static void main(String[] args) {
        Hora hora01 = new Hora(17, 42, 3);
        Hora hora02 = new Hora(9, 27);
        Hora hora03 = new Hora(10);
        Hora hora04 = new Hora();

        hora01.prnTime();
        hora02.prnTime();
        hora03.prnTime();
        hora04.prnTime();

        System.out.println(hora01.isAm());

        Hora teste01 = Hora.diffTime(hora01, hora02);
        teste01.prnTime();

        Hora teste02 = Hora.diffTime(hora03);
        teste02.prnTime();

        System.out.println(Hora.isAm(hora03));
    }
}