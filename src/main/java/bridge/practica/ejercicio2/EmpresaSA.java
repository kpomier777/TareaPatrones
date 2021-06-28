package bridge.practica.ejercicio2;

public class EmpresaSA implements IEmpresas {

    private IMetodo metodo;
    private  int precio =5000;
    private String nombrePaquete;

    public EmpresaSA(IMetodo metodo) {
        this.metodo = metodo;
    }

    @Override
    public void cotizarPaquete(String nombrePaquete, int precio) {
        System.out.print("El paquete: "+nombrePaquete);
        metodo.sumar(precio);
    }

   }
