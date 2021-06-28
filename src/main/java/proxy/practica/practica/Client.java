package proxy.practica.practica;

public class Client {
    public static void main (String [] args){
        // create proxy
        AppWeb web= new AppWeb("kevin","123", 1);
        Cluster cluster=new Cluster(web,"kevin","123");
        Proxy proxy = new Proxy(web,cluster);
        web.setIdUsuario(1);
        web.setUser("kevin");
        web.setPwd("123");
        proxy.ingresar();


        web.setIdUsuario(12);
        web.setUser("kev");
        web.setPwd("12");
        proxy.ingresar();

        web.setIdUsuario(24);
        web.setUser("kevin");
        web.setPwd("123");
        proxy.ingresar();

    }
}
