package adapter.practica.ejeercicio;

public class AdapterTelevisores implements IEmpresaArtefactos1 {

    Televisores televisores;


    public AdapterTelevisores(Televisores televisores) {
        this.televisores = televisores;
    }


    @Override
    public int precio() {
        return this.televisores.costo();
    }

    @Override
    public int tiempoVida() {
        return televisores.tiempoGarantia();
    }

}
