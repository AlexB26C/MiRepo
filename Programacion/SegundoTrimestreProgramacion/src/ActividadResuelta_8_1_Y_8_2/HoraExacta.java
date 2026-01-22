package ActividadResuelta_8_1_Y_8_2;

public class HoraExacta extends Hora {

    int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    boolean setSegundos(int segundos) {
        boolean validos;
        if (segundos <= 59 && segundos >= 0) {
            this.segundos = segundos;
            validos = true;
        } else {
            validos = false;
        }
        return validos;
    }

    @Override
    public void inc() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        String horaExacta = super.toString();
        horaExacta = horaExacta + ":" + segundos;

        return horaExacta;
    }

}
