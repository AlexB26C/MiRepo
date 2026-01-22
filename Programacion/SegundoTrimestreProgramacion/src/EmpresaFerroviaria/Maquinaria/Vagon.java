package EmpresaFerroviaria.Maquinaria;
class Vagon {
    int Identificacion;
    int CargaMaxima;
    int CargaActual;
    String TipoMercancia;

    public Vagon(int Identificacion, int CargaMaxima, int CargaActual, String TipoMercancia) {
        this.Identificacion = Identificacion;
        this.CargaMaxima = CargaMaxima;
        this.CargaActual = CargaActual;
        this.TipoMercancia = TipoMercancia;
    }
}