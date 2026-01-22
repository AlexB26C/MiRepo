package ActividadResuelta_8_1_Y_8_2;

public class Hora {

    protected int hora;
    protected int minuto;

    Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    void inc() {
        minuto++;
        if (minuto > 59) {
            minuto = 0;
            hora++;
            if (hora > 23) {
                hora = 0;
            }
        }
    }

    boolean setMinuto(int minuto) {
        boolean valido;
        if (minuto <= 59 && minuto >= 0) {
            this.minuto = minuto;
            valido = true;
        } else {
            valido = false;
        }
        return valido;
    }

    boolean setHora(int hora) {
        boolean valida;
        if (hora <= 23 && hora >= 0) {
            this.hora = hora;
            valida = true;
        } else {
            valida = false;
        }
        return valida;
    }

    @Override
    public String toString() {
        String horaFinal;

        horaFinal = hora + ":" + minuto;
        return horaFinal;

    }

}
