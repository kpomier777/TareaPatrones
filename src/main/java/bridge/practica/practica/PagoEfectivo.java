package bridge.practica.practica;

public class PagoEfectivo implements IMetodo {


    @Override
    public void descontar(int monto) {
        System.out.println(" tiene el precio instalación de: " +monto+"Bs. con pago efectivo");
    }
}
