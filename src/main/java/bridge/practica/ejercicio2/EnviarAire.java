package bridge.practica.ejercicio2;

public class EnviarAire implements IMetodo {
    @Override
    public void sumar(int monto) {
        System.out.println(" tiene el precio de envio de: " +(monto+(10*monto/100))+" por Aire");
    }
}
