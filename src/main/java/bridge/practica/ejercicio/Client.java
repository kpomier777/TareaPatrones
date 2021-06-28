package bridge.practica.ejercicio;

public class Client {
    public static void main(String[] args) {

        Arquitecturax64 arquitecturax64 = new Arquitecturax64();
        Arquitecturax86 arquitecturax86 = new Arquitecturax86();
        Windows windows = new Windows(arquitecturax64);
        windows.crearPlataforma();
        Windows windows2 = new Windows(arquitecturax86);
        windows2.crearPlataforma();


        Linux linux = new Linux(arquitecturax86);
        linux.crearPlataforma();
        Linux linux2 = new Linux(arquitecturax64);
        linux2.crearPlataforma();


    }
}
