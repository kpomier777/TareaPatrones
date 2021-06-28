package visitor.practica.ejercicio2;



public class Italia implements IPaises {

    private String moneda="BOB";
    private String continente="Europa";


    public Italia(){

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
        System.out.println("Librecambista visita "+getContinente()+" país Italia");
        librecambista.visitar(this);
    }
}
