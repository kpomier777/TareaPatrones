package bridge.practica.practica;

public class PagoAplicacion implements IMetodo {


    @Override
    public void descontar(int monto) {
        System.out.println(" tiene el precio instalación de: " +(monto-(10*monto/100))+"Bs. con pago mediante la app");
    }
}
