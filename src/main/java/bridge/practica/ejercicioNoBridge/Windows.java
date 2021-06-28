package bridge.practica.ejercicioNoBridge;



public class Windows implements IPlataforma {



    public Windows(){

    }


    @Override
    public void crearPlataformax86() {
        System.out.println("Creando Windows7x86");
    }

    @Override
    public void crearPlataformax64() {
        System.out.println("Creando Windows7x64");
    }
}
