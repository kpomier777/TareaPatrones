package proxy.practica.practica;

public class Proxy implements ICluster {
    private AppWeb web;
    private Cluster cluster;

    public Proxy(AppWeb web, Cluster cluster) {
        this.web = web;
        this.cluster = cluster;
    }


    @Override
    public void ingresar() {
        cluster.ingresar();
        if (web.getUser()==cluster.getUserGuardado() && web.getPwd()==cluster.getPwdGuardado()){
            if (web.getIdUsuario()%2==0) {
                System.out.println("Usted será redirigido al servidor 2 ");
            }else {
                System.out.println("Usted será redirigido al servidor 1 ");
            }
        }else{
            System.out.println("Ingrese los datos correctos de login");
        }
    }
}
