package visitor.practica.practica;


import java.text.DecimalFormat;
import java.util.Random;

public class AppCheckHealth implements IAppHealth {


    public AppCheckHealth() {

    }


    Random rand = new Random();
    int upperbound = 101;
    int int_random = rand.nextInt(upperbound);

    DecimalFormat df = new DecimalFormat("#.00");
    @Override
    public void visitar(Computadora computadora) {
        if(int_random%2==0){
            System.out.println("La computadora necesita un mantenimiento preventivo");
        }else{
            System.out.println("La computadora necesita un mantenimiento correctivo");
        }
    }

    @Override
    public void visitar(Celular celular) {
        System.out.println("Caracteristicas celular: "+celular.getMarca()+ " de sistema operativo "+ celular.getSistemaOperativo());
        System.out.println("El celular necesita un mantenimiento preventivo");
    }

    @Override
    public void visitar(Televisor televisor) {
        System.out.println("Caracteristicas televisor: "+televisor.getMarca()+ " de sistema operativo "+ televisor.getSistemaOperativo());
    }


}
