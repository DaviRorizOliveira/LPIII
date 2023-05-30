public class Hora {
    private int hora;
    private int min;
    private int seg;

    private boolean validateTime(int hora, int min, int seg) {
        return validateHour(hora) && validateMinOrSec(min) && validateMinOrSec(seg);
    }

    private boolean validateHour(int hora) {
        if ((hora > 0) && (hora < 25))
            return true;
        else
            return false;
    }

    private boolean validateMinOrSec(int param) {
        if ((param > 0) && (param < 61))
            return true;
        else
            return false;
    }

    public void setTime(int hora, int min, int seg) {
        if (validateTime(hora, min, seg)) {
            this.hora = hora;
            this.min = min;
            this.seg = seg;
        } else {
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }
    }

    public String getTime() {
        String res = this.hora + ":" + this.min + ":" + this.seg;
        return res;
    }

    public void prnTime() {
        System.out.println(getTime());
    }

    public boolean isAm() {
        return hora < 12;
    }

    public int cron(Hora outraHora) {
        int segundos;
        if (outraHora.hora < hora || (outraHora.hora == hora && outraHora.min < min)
                || (outraHora.hora == hora && outraHora.min == min && outraHora.seg < seg)) {
            segundos = (24 - hora + outraHora.hora) * 3600 + (60 - min + outraHora.min) * 60 + 60 - seg + outraHora.seg;
        } else {
            segundos = (outraHora.hora - hora) * 3600 + (outraHora.min - min) * 60 + outraHora.seg - seg;
        }
        return segundos;
    }

    public void addSeconds(int seconds) {
        int valor = hora * 3600 + min * 60 + seg;
        valor += seconds;
        if (valor < 0) {
            valor += 24 * 3600;
        }
        hora = (valor / 3600) % 24;
        min = (valor / 60) % 60;
        seg = valor % 60;
    }
}