package adapter.practica.practica;

public class Client {
    public static void main(String[] args) {

        Empresa1WindowsPhone windowsPhone = new Empresa1WindowsPhone();
        windowsPhone.login();
        windowsPhone.logout();
        windowsPhone.reportes();


        Empresa1IOS ios = new Empresa1IOS();
        ios.login();
        ios.logout();
        ios.reportes();

        Empresa1Android android = new Empresa1Android();
        android.login();
        android.logout();
        android.reportes();

        Web web= new Web();
        AdapterWeb adapterWeb= new AdapterWeb(web);
        adapterWeb.login();
        adapterWeb.logout();
        adapterWeb.reportes();


        Escritorio escritorio= new Escritorio();
        AdapterEscritorio adapterEscritorio = new AdapterEscritorio(escritorio);
        adapterEscritorio.login();
        adapterEscritorio.logout();
        adapterEscritorio.reportes();



    }
}
