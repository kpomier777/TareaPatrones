package visitor.practica.practica;


public class Computadora implements IArtefactosElectronicos {

    private String marca="Asus";
    private String sistemaOperativo="Windows";

    public Computadora(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void recibir(IAppHealth appHealth) {
        System.out.println("App health visita computadora "+getMarca()+ " con sistema operativo "+getSistemaOperativo());
        appHealth.visitar(this);

    }
}
