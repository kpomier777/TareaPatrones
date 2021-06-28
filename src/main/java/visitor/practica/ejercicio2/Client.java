package visitor.practica.ejercicio2;



public class Client {

    public static void main(String []sss){

        Bolivia bolivia= new Bolivia();
        Argentina argentina= new Argentina();
        Brasil brasil= new Brasil();
        Italia italia= new Italia();

        LibrecambistaVenta librecambistaVenta = new LibrecambistaVenta(50);

        bolivia.recibir(librecambistaVenta);
        argentina.recibir(librecambistaVenta);
        brasil.recibir(librecambistaVenta);
        italia.recibir(librecambistaVenta);


        LibrecambistaCompra librecambistaCompra = new LibrecambistaCompra(50);

        bolivia.recibir(librecambistaCompra);
        argentina.recibir(librecambistaCompra);
        brasil.recibir(librecambistaCompra);
        italia.recibir(librecambistaCompra);




    }

}
