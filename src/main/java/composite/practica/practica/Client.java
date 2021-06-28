package composite.practica.practica;

public class Client {
    public static void main (String [] args){
        Archivo archivo1 = new Archivo(20);
        Archivo archivo2 = new Archivo(30);


        archivo1.setTipo("Archivo inscripciones");
        archivo2.setTipo("Archivo notas");

        Archivo archivo3 = new Archivo(60);
        Archivo archivo4 = new Archivo(70);


        archivo1.setTipo("Archivo examenes");
        archivo2.setTipo("Archivo tareas");


        AgrupadorArchivos folder = new AgrupadorArchivos();
        folder.setTipo("Folder 1");
        folder.add(archivo1);
        folder.add(archivo2);

        AgrupadorArchivos folder2 = new AgrupadorArchivos();
        folder2.setTipo("Folder 2");
        folder2.add(archivo3);
        folder2.add(archivo4);


        AgrupadorArchivos disco = new AgrupadorArchivos();
        disco.setTipo("Unidad de disco");
        disco.add(folder);
        disco.add(folder2);

        disco.totalPalabras();


    }

}
