package composite.practica.ejercicio;

public class Computadora extends ArtefactosElectronicos {




    public Computadora(int precio) {
        super(precio);
    }
    @Override
    public int totalPrecio() {
        System.out.println(getTipo()+" precio total " + getPrecio()+" $.");
        return this.getPrecio();
    }

    @Override
    public void add(ArtefactosElectronicos component) {
        System.out.println("No aplicable");
    }

    @Override
    public void remove(ArtefactosElectronicos component) {
        System.out.println("No aplicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No aplicable");
    }
}
