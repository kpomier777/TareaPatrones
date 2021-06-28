package bridge.practica.ejercicio2;

public class EnviarMar implements IMetodo {
    @Override
    public void sumar(int monto) {
        System.out.println(" tiene el precio de envio de: " +(monto+(25*monto/100))+" por Mar");
    }
}
