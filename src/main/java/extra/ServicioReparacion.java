package extra;


import java.text.DecimalFormat;
import java.util.Random;

public class ServicioReparacion implements IServicioTecnico {


    private int precio=100;
    public ServicioReparacion() {

    }


    Random rand = new Random();
    int upperbound = 101;
    int int_random = rand.nextInt(upperbound);

    DecimalFormat df = new DecimalFormat("#.00");
    @Override
    public void visitar(PC computadora) {
        System.out.println("Utilizar herramientas para computadoras");
        if(computadora.getTamano()=="Mediano"){
            System.out.println("El servicio tiene un costo de "+(precio+20));
        }
    }

    @Override
    public void visitar(Laptop celular) {
        System.out.println("Utilizar herramientas para celulares");
        if(celular.getTamano()=="Pequeño"){
            System.out.println("El servicio tiene un costo de "+(precio+10));
        }
    }

    @Override
    public void visitar(Tablet televisor) {
        System.out.println("Utilizar herramientas para televisores");
        if(televisor.getTamano()=="Grande"){
            System.out.println("El servicio tiene un costo de "+(precio+50));
        }
    }


}
