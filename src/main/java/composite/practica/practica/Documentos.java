package composite.practica.practica;

abstract class Documentos {
    private int numeroPalabras;
    private String tipo;

    public Documentos(int numeroPalabras){
        this.numeroPalabras =numeroPalabras;
    }

    public int getNumeroPalabras() {
        return numeroPalabras;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract  int totalPalabras();
    public abstract  void add(Documentos component);
    public abstract  void remove(Documentos component);
    public abstract  void getChild(int position);

}
