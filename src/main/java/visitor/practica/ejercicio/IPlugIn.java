package visitor.practica.ejercicio;




public interface IPlugIn {

    void guardar(Notepad notepad);
    void guardar(Sublime sublime);
    void guardar(Word word);
}
