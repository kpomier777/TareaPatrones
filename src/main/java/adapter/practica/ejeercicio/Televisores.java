package adapter.practica.ejeercicio;

public class Televisores implements IEmpresaArtefactos2 {

    private int vida=10;
    private int precio=9000;

    @Override
    public int costo() {
        System.out.println("El costo del televisor es: "+ precio +" bs.");
        return precio;
    }

    @Override
    public int tiempoGarantia() {
        System.out.println("El tiempo de garantia del televisor es: "+ vida +" años");
        return vida;
    }
}
