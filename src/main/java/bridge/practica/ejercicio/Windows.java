package bridge.practica.ejercicio;

public class Windows implements IPlataforma {

    private IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void crearPlataforma() {
        System.out.print("Creando Plataforma Windows");
        arquitectura.crearArquitectura();
    }
}



