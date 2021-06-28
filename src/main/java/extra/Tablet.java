package extra;


public class Tablet implements IArtefactosElectronicos {

    private String marca="LG";
    private String sistemaOperativo="Android";
    private String tamano="Pequeño";

    public Tablet(){

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
    public void recibir(IServicioTecnico librecambista) {
        System.out.println("Tecnico visita Tablet "+getMarca()+ " con sistema operativo "+getSistemaOperativo());
        librecambista.visitar(this);
    }
}
