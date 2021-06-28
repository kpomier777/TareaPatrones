package visitor.practica.practica;


public class Celular implements IArtefactosElectronicos {

    private String marca="Samsung";
    private String sistemaOperativo="Android";


    public Celular(){

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
        System.out.println("App health visita celular "+getMarca()+ " con sistema operativo "+getSistemaOperativo());
        appHealth.visitar(this);
    }
}
