package visitor.practica.ejercicio;



public class Sublime implements IEditor {

    private String caracteres="";
    private String nombre="";


    public Sublime(){

    }

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void agregar(IPlugIn plugin) {
        plugin.guardar(this);
    }

    @Override
    public void crear(String nombre) {
        this.setNombre(nombre);
        System.out.println("Documento creado con el nombre: "+this.getNombre());
    }

    @Override
    public void editar(String contenido) {
        this.setCaracteres(this.getCaracteres()+contenido);
        System.out.println("Editando con el contenido: "+ contenido);
    }

    @Override
    public void eliminar() {
        System.out.println("Se eliminó el docuemnto "+this.getNombre());
    }
}
