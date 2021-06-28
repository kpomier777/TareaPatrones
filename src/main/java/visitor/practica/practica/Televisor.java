package visitor.practica.practica;


public class Televisor implements IArtefactosElectronicos {

    private String marca="LG";
    private String sistemaOperativo="Android";


    public Televisor(){

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
    public void recibir(IAppHealth librecambista) {
        System.out.println("App health visita televisor "+getMarca()+ " con sistema operativo "+getSistemaOperativo());
        librecambista.visitar(this);
    }
}
