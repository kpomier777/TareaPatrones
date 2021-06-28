package visitor.practica.ejercicio;


import java.util.Date;

public class Plugin1 implements IPlugIn {



    @Override
    public void guardar(Notepad notepad) {
        System.out.println("Notepad> Agregar plugin 1");
        System.out.println("Convirtiendo notepad a pdf");
        System.out.println("Documento "+notepad.getNombre()+" guardado");
        System.out.println("Contenido total: "+ notepad.getCaracteres());
        System.out.println("Guardando "+notepad.getCaracteres().length()+" cantidad de caracteres");
    }

    @Override
    public void guardar(Sublime sublime) {
        System.out.println("Sublime> Agregar plugin 1");
        System.out.println("Convirtiendo sublime a pdf");
        System.out.println("Documento "+sublime.getNombre()+" guardado");
        System.out.println("Contenido total: "+ sublime.getCaracteres());
        System.out.println("Guardando "+sublime.getCaracteres().length()+" cantidad de caracteres");
    }

    @Override
    public void guardar(Word word) {
        System.out.println("Word> Agregar plugin 1");
        System.out.println("Convirtiendo word a pdf");
        System.out.println("Documento "+word.getNombre()+" guardado");
        System.out.println("Contenido total: "+ word.getCaracteres());
        System.out.println("Guardando "+word.getCaracteres().length()+" cantidad de caracteres");
    }
}
