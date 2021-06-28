package visitor.practica.ejercicio;

public class Client {

    public static void main(String []sss){

        Notepad notepad= new Notepad();
        notepad.crear("Documento 1");
        notepad.editar("Incio del ");
        notepad.editar("documento");
        Word word= new Word();
        word.crear("Documento 2");
        word.editar("Editarando ");
        word.editar("un nuevo docuemtno");
        Sublime sublime= new Sublime();
        sublime.crear("Documento 3");
        sublime.editar("Editando otro ");
        sublime.editar("documento");

        Plugin1 plugin1 = new Plugin1();

        notepad.agregar(plugin1);
        word.agregar(plugin1);
        sublime.agregar(plugin1);
        notepad.eliminar();
        word.eliminar();
        sublime.eliminar();

    }

}
