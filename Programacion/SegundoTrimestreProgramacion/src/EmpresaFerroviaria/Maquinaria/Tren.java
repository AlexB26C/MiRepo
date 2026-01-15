package EmpresaFerroviaria.Maquinaria;

import EmpresaFerroviaria.Personal.Maquinista;

public class Tren {

    Locomotora locomotora;
    Vagon vagones[];
    Maquinista maq;
    private int numeroVagones;
    
    public Tren(Locomotora L, Vagon[] vagon, Maquinista maq, int numeroVagones) {
        this.locomotora = locomotora;

        this.maq = maq;

        vagones = new Vagon[5];

        this.numeroVagones = 0;
    }
       
    public void meterVagones(int CargaMaxima, int CargaActual, String TipoMercancia){
        if (numeroVagones > 5){
            System.out.println("No se admiten mas vagones");
        } else {
            Vagon v = new Vagon(numeroVagones, CargaMaxima, CargaActual, TipoMercancia);
            vagones[numeroVagones] = v;
            numeroVagones++;
        }
    }


    

}
