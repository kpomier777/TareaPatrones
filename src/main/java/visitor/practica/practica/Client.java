package visitor.practica.practica;


public class Client {

    public static void main(String []sss){

        Computadora computadora= new Computadora();
        Celular celular= new Celular();
        Televisor televisor= new Televisor();

        AppCheckHealth appCheckHealth = new AppCheckHealth();

        computadora.recibir(appCheckHealth);
        celular.recibir(appCheckHealth);
        televisor.recibir(appCheckHealth);








    }

}
