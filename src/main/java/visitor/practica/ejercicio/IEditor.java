package visitor.practica.ejercicio;


public interface IEditor {
    void agregar(IPlugIn plugin);
    void crear(String nombre);
    void editar(String contenido);
    void eliminar();
}
