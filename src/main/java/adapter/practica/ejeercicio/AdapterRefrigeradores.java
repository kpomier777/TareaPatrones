package adapter.practica.ejeercicio;

public class AdapterRefrigeradores implements IEmpresaArtefactos1 {

    Refrigeradores refrigeradores;
    private int edad;

    public AdapterRefrigeradores(Refrigeradores refrigeradores) {
        this.refrigeradores = refrigeradores;
    }


    @Override
    public int precio() {
        return this.refrigeradores.costo();
    }

    @Override
    public int tiempoVida() {
        return refrigeradores.tiempoGarantia();
    }
}
