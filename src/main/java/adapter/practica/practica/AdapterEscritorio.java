package adapter.practica.practica;

public class AdapterEscritorio implements IEmpresaArtefactos1 {

    Escritorio escritorio;


    public AdapterEscritorio(Escritorio escritorio) {
        this.escritorio = escritorio;
    }




    @Override
    public int login() {
        return escritorio.iniciarSesion();
    }

    @Override
    public int logout() {
        return escritorio.cerrarSesion();
    }

    @Override
    public int reportes() {
        return escritorio.generacionDedatos();
    }
}
