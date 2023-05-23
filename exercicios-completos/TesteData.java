public class TesteData {
    public static void main(String[] args) {
        Data data01 = new Data();
        Data data02 = new Data(16, 6, 1996);
        Data data03 = new Data(9, 3, 2004);
        Data data04 = new Data(data03);
        int teste;

        data01.imprimirData();
        data01.imprimirDataExtenso();
        System.out.println(data01.isPrevious(data02));

        data02.imprimirData();
        data02.imprimirDataExtenso();
        teste = data02.howManyDays(data03);
        System.out.println(teste);

        data03.imprimirData();
        data03.imprimirDataExtenso();

        data04.imprimirData();
        data04.imprimirDataExtenso();
    }
}
