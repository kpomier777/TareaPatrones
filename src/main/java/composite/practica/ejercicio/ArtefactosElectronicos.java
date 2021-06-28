package composite.practica.ejercicio;

abstract class ArtefactosElectronicos {
    private int precio;
    private String tipo;

    public ArtefactosElectronicos(int precio){
        this.precio =precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract  int totalPrecio();
    public abstract  void add(ArtefactosElectronicos component);
    public abstract  void remove(ArtefactosElectronicos component);
    public abstract  void getChild(int position);

}
