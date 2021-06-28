package bridge.practica.ejercicio2;

public class EmpresaSRL implements IEmpresas {

    private IMetodo metodo;
    private int precio =400;
    private String nombrePaquete;

    public EmpresaSRL(IMetodo metodo) {
        this.metodo = metodo;
    }

    @Override
    public void cotizarPaquete(String nombrePaquete, int precio) {
        System.out.print("El paquete: "+nombrePaquete);
        metodo.sumar(precio);
    }
}



