package EmpresaFerroviaria.Maquinaria;

import EmpresaFerroviaria.Personal.Mecanico;

public class Locomotora {
    String Matricula;
    int PotenciaMotor;
    String AnioFabricacion;
    Mecanico mec;

    public Locomotora(String Matricula, int PotenciaMotor, String AnioFabricacion, Mecanico mec) {
        this.Matricula = Matricula;
        this.PotenciaMotor = PotenciaMotor;
        this.AnioFabricacion = AnioFabricacion;
        this.mec = mec;
    }
}
