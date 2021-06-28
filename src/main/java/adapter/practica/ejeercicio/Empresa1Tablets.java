package adapter.practica.ejeercicio;

public class Empresa1Tablets implements IEmpresaArtefactos1 {
    private int vida=10;
    private int precio=2000;

    @Override
    public int precio() {
        System.out.println("El precio de la tablet es: "+ precio +" bs.");
        return precio;
    }

    @Override
    public int tiempoVida() {
        System.out.println("El tiempo de vida de la tablet es: "+ vida +" años");
        return vida;
    }

}
