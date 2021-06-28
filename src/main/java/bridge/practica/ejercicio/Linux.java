package bridge.practica.ejercicio;

public class Linux implements IPlataforma {

    private IArquitectura arquitectura;

    public Linux(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void crearPlataforma() {
        System.out.print("Creando Plataforma Linux");
        arquitectura.crearArquitectura();
    }

}
