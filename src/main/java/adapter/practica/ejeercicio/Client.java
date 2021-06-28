package adapter.practica.ejeercicio;

public class Client {
    public static void main(String[] args) {

        Empresa1Tablets tablets = new Empresa1Tablets();
        tablets.precio();
        tablets.tiempoVida();


        Empresa1Computadoras computadoras = new Empresa1Computadoras();
        computadoras.precio();
        computadoras.tiempoVida();

        Empresa1Celulares celulares = new Empresa1Celulares();
        celulares.precio();
        celulares.tiempoVida();

        Lavadoras lavadoras= new Lavadoras();
        AdapterLavadoras adapterLavadoras= new AdapterLavadoras(lavadoras);
        adapterLavadoras.precio();
        adapterLavadoras.tiempoVida();


        Refrigeradores refrigeradores= new Refrigeradores();
        AdapterRefrigeradores adapterRefrigeradores = new AdapterRefrigeradores(refrigeradores);
        adapterRefrigeradores.precio();
        adapterRefrigeradores.tiempoVida();

        Televisores televisores= new Televisores();
        AdapterTelevisores adapterTelevisores = new AdapterTelevisores(televisores);
        adapterTelevisores.precio();
        adapterTelevisores.tiempoVida();


    }
}
