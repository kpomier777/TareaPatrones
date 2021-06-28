package composite.practica.practica;

public class Archivo extends Documentos {


    public Archivo(int numeroPalabras) {
        super(numeroPalabras);
    }
    @Override
    public int totalPalabras() {
        System.out.println(getTipo()+" numero total de palabras " + getNumeroPalabras());
        return this.getNumeroPalabras();
    }

    @Override
    public void add(Documentos component) {
        System.out.println("No aplicable");
    }

    @Override
    public void remove(Documentos component) {
        System.out.println("No aplicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No aplicable");
    }
}
