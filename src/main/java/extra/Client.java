package extra;


public class Client {

    public static void main(String []sss){

        PC computadora= new PC();
        Laptop celular= new Laptop();
        Tablet televisor= new Tablet();

        ServicioReparacion appCheckHealth = new ServicioReparacion();

        computadora.recibir(appCheckHealth);
        celular.recibir(appCheckHealth);
        televisor.recibir(appCheckHealth);








    }

}
