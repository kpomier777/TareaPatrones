package bridge.practica.ejercicio2;

public class EnviarTierra implements IMetodo {
    @Override
    public void sumar(int monto) {
        System.out.println(" tiene el precio de envio de: " +(monto+(5*monto/100))+" por Tierra");
    }
}


