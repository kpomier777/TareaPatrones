package adapter.practica.practica;

public class AdapterWeb implements IEmpresaArtefactos1 {

    Web web;


    public AdapterWeb(Web web) {
        this.web = web;
    }


    @Override
    public int login() {
        return web.iniciarSesion();
    }

    @Override
    public int logout() {
        return web.cerrarSesion();
    }

    @Override
    public int reportes() {
        return web.generacionDedatos();
    }
}
