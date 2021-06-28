package adapter.practica.practica;

public class Web implements IEmpresaArtefactos2 {

    private String user="Kevin";
    private String pwd="123";
    private int likes =12;

    @Override
    public int iniciarSesion() {
        System.out.println("Iniciar sesion con usuario "+user+" con pasword "+pwd+" en app de escritorio");
        return 0;
    }

    @Override
    public int cerrarSesion() {
        System.out.println("Cerrar sesion con usuario "+user+" en app de escritorio");
        return 0;
    }

    @Override
    public int generacionDedatos() {
        System.out.println("Reportes de "+likes+" likes en app de escritorio");
        return 0;
    }
}
