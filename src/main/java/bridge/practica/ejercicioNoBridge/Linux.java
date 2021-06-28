package bridge.practica.ejercicioNoBridge;

public class Linux implements IPlataforma {



    public Linux(){

    }


    @Override
    public void crearPlataformax86() {
        System.out.println("Creando Linuxx86");
    }

    @Override
    public void crearPlataformax64() {
        System.out.println("Creando Linuxx64");
    }
}
