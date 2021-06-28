package visitor.practica.ejercicio2;



public class Brasil implements IPaises {

    private String moneda="Euro";
    private String continente="América";


    public Brasil(){

    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }


    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public void recibir(ILibrecambista librecambista) {
        System.out.println("Librecambista visita "+getContinente()+" país Brasil");
        librecambista.visitar(this);
    }
}
