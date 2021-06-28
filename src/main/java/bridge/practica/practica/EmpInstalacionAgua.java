package bridge.practica.practica;

public class EmpInstalacionAgua implements IEmpresas {

    private IMetodo metodo;
    private int precio ;
    private String nombreCliente;
    private String direccion;

    public EmpInstalacionAgua(IMetodo metodo) {
        this.metodo = metodo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    @Override
    public void precioDeInstalaicon(String nombreCliente, String direccion, int precio) {
        setNombreCliente(nombreCliente);
        setDireccion(direccion);
        setPrecio(precio);
        System.out.print("El cliente: "+nombreCliente+ " con la direccion de: "+direccion+" por el servicio de agua");
        metodo.descontar(precio);
    }
}



