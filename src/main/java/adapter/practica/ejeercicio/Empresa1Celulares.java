package adapter.practica.ejeercicio;

public class Empresa1Celulares implements IEmpresaArtefactos1 {
    private int vida=5;
    private int precio=1000;

    @Override
    public int precio() {
        System.out.println("El precio del celular es: "+ precio +" bs.");
        return precio;
    }

    @Override
    public int tiempoVida() {
        System.out.println("El tiempo de vida del celular es: "+ vida +" años");
        return vida;
    }
}
