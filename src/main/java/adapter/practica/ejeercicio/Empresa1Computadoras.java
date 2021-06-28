package adapter.practica.ejeercicio;

public class Empresa1Computadoras implements IEmpresaArtefactos1 {
    private int vida=30;
    private int precio=10000;

    @Override
    public int precio() {
        System.out.println("El precio de la computadora es: "+ precio +" bs.");
        return precio;
    }

    @Override
    public int tiempoVida() {
        System.out.println("El tiempo de vida de la computadora es: "+ vida +" años");
        return vida;
    }

}
