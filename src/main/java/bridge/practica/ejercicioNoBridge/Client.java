package bridge.practica.ejercicioNoBridge;



public class Client {

    public static void main (String [] assff){

        Windows win = new Windows();
        win.crearPlataformax64();
        win.crearPlataformax86();
        Linux li = new Linux();
        li.crearPlataformax64();
        li.crearPlataformax86();


    }
}
