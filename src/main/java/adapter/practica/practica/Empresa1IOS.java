package adapter.practica.practica;

public class Empresa1IOS implements IEmpresaArtefactos1 {
    private String user="Kevin";
    private String pwd="123";
    private int likes =30;

    @Override
    public int login() {
        System.out.println("Login con usuario "+user+" y pasword "+pwd+" en app para IOS");
        return 0;
    }

    @Override
    public int logout() {
        System.out.println("Logout con usuario "+user+" en app para IOS");
        return 0;
    }

    @Override
    public int reportes() {
        System.out.println("Reportes de "+likes+" likes en app para IOS");
        return 0;
    }

}
