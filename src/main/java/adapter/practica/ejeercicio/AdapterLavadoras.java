package adapter.practica.ejeercicio;

public class AdapterLavadoras implements IEmpresaArtefactos1 {

    Lavadoras lavadoras;
    private int edad;

    public AdapterLavadoras(Lavadoras lavadoras) {
        this.lavadoras = lavadoras;
    }


    @Override
    public int precio() {
        return this.lavadoras.costo();
    }

    @Override
    public int tiempoVida() {
        return lavadoras.tiempoGarantia();
    }
}
