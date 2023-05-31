import java.time.LocalTime;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora(int hora, int min, int seg) {
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

    public Hora(int hora, int min) {
        this(hora, min, 0);
        // this.hora = hora;
        // this.min = min;
        // this.seg = 0;
    }

    public Hora(int hora) {
        this(hora, 0, 0);
        // this.hora = hora;
        // this.min = 0;
        // this.seg = 0;
    }

    public Hora() {
        this(0, 0, 0);
        // this.hora = 0;
        // this.min = 0;
        // this.seg = 0;
    }

    public Hora(Hora antigo) {
        this(antigo.hora, antigo.min, antigo.seg);
    }

    private boolean validateTime(int hora, int min, int seg) {
        return validateHour(hora) && validateMinOrSec(min) && validateMinOrSec(seg);
    }

    private boolean validateHour(int hora) {
        if ((hora >= 0) && (hora < 25))
            return true;
        else
            return false;
    }

    private boolean validateMinOrSec(int minSeg) {
        if ((minSeg >= 0) && (minSeg < 60))
            return true;
        else
            return false;
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

    public void addTime(int seconds) {
        int num = hora * 3600 + min * 60 + seg;
        num += seconds;
        hora = (num / 3600) % 24;
        min = (num / 60) % 60;
        seg = num % 60;
    }

    public void addTime(int minutes, int seconds) {
        addTime(minutes * 60 + seconds);
    }

    public void addTime(int hours, int minutes, int seconds) {
        addTime(hours * 3600 + minutes * 60 + seconds);
    }

    public void addTime(Hora antigo) {
        addTime(antigo.hora, antigo.min, antigo.seg);
    }

    public static Hora diffTime(Hora t1, Hora t2) { // Método que calcula a diferença entre duas horas
        int aux01 = t1.hora * 3600 + t1.min * 60 + t1.seg;
        int aux02 = t2.hora * 3600 + t2.min * 60 + t2.seg;
        int aux03 = Math.abs(aux01 - aux02);

        int hour = aux03 / 3600;
        int minute = (aux03 % 3600) / 60;
        int second = aux03 % 60;

        return new Hora(hour, minute, second);
    }

    public static Hora diffTime(Hora t) { // Método que calcula a diferença entre a hora do parâmetro e a hora do
                                          // computador
        LocalTime currentTime = LocalTime.now();

        int aux01 = t.hora * 3600 + t.min * 60 + t.seg;
        int aux02 = currentTime.getHour() * 3600 + currentTime.getMinute() * 60 + currentTime.getSecond();
        int aux03 = Math.abs(aux01 - aux02);

        int hour = aux03 / 3600;
        int minute = (aux03 % 3600) / 60;
        int second = aux03 % 60;

        return new Hora(hour, minute, second);
    }

    public static boolean isAm(Hora t) { // Método para verificar se é anterior ao meio-dia
        return t.hora < 12;
    }
}