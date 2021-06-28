package extra;


public class PC implements IArtefactosElectronicos {

    private String marca="Asus";
    private String sistemaOperativo="Windows";
    private String tamano="Grande";
    public PC(){

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
        System.out.println("Tecnico visita PC "+getMarca()+ " con sistema operativo "+getSistemaOperativo());
        appHealth.visitar(this);

    }
}
