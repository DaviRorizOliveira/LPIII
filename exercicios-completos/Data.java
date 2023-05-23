public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int dia, int mes, int ano) {
        if (!verificarData(dia, mes, ano)) {
            day = 0;
            month = 0;
            year = 0;
        } else {
            day = dia;
            month = mes;
            year = ano;
        }
    }

    public Data() {
        day = 1;
        month = 1;
        year = 1970;
    }

    public Data(Data antigo) {
        day = antigo.day;
        month = antigo.month;
        year = antigo.year;
    }

    private boolean verificarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        } else if (dia < 1 || dia > 31) {
            return false;
        } else if (mes == 2) {
            if (dia > 29) {
                return false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        }
        return true;
    }

    public int getDia() {
        return day;
    }

    public int getMes() {
        return month;
    }

    public int getAno() {
        return year;
    }

    public void setDia(int dia) {
        this.day = dia;
    }

    public void setMes(int mes) {
        this.month = mes;
    }

    public void setAno(int ano) {
        this.year = ano;
    }

    public void imprimirData() {
        System.out.printf("%02d/%02d/%04d%n", day, month, year);
    }

    public void imprimirDataExtenso() {
        String[] nomeMes = {
                "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        System.out.printf("%d de %s de %d.%n", day, nomeMes[month - 1], year);
    }

    public boolean isPrevious(Data outraData) {
        if (year < outraData.getAno()) {
            return true;
        } else if (year == outraData.getAno() && month < outraData.getMes()) {
            return true;
        } else if (year == outraData.getAno() && month == outraData.getMes() && day < outraData.getDia()) {
            return true;
        }
        return false;
    }

    public int howManyDays(Data outraData) {
        int data_01 = day + (month - 1) * 30 + (year - 1) * 365;
        int data_02 = outraData.getDia() + (outraData.getMes() - 1) * 30 + (outraData.getAno() - 1) * 365;
        int days = data_02 - data_01;
        return days;
    }

    public int howManyDays(int dia, int mes, int ano) {
        int data_01 = day + (month - 1) * 30 + (year - 1) * 365;
        int data_02 = dia + (mes - 1) * 30 + (ano - 1) * 365;
        int days = data_02 - data_01;
        return days;
    }
}