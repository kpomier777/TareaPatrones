package adapter.practica.ejeercicio;

public class Lavadoras implements IEmpresaArtefactos2 {
    private int vida=50;
    private int precio=5000;

    @Override
    public int costo() {
        System.out.println("El costo de la lavadora es: "+ precio +" bs.");
        return precio;
    }

    @Override
    public int tiempoGarantia() {
        System.out.println("El tiempo de garantia de la lavadora es: "+ vida +" años");
        return vida;
    }
}
