package visitor.practica.ejercicio2;



public class Bolivia implements IPaises {

    private String moneda="Bolivianos";
    private String continente="América";


    public Bolivia(){

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
        System.out.println("Librecambista visita "+getContinente()+" país Bolivia");
        librecambista.visitar(this);

    }
}
