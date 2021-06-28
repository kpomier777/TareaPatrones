package extra;


public class Laptop implements IArtefactosElectronicos {

    private String marca="Samsung";
    private String sistemaOperativo="Android";
    private String tamano="Mediano";


    public Laptop(){

    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
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
    public void recibir(IServicioTecnico appHealth) {
        System.out.println("Tecnico visita Laptop "+getMarca()+ " con sistema operativo "+getSistemaOperativo());
        appHealth.visitar(this);
    }
}
