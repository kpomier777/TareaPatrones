package adapter.practica.practica;

public class Empresa1Android implements IEmpresaArtefactos1 {

    private String user="Kevin";
    private String pwd="123";
    private int likes =40;
    @Override
    public int login() {
        System.out.println("Login con usuario "+user+" y pasword "+pwd+" en app para Android");
        return 0;
    }

    @Override
    public int logout() {
        System.out.println("Logout con usuario "+user+" en app para Android");
        return 0;
    }

    @Override
    public int reportes() {
        System.out.println("Reportes de "+likes+" likes en app para Android");
        return 0;
    }
}
