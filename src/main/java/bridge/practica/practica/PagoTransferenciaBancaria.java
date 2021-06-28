package bridge.practica.practica;

public class PagoTransferenciaBancaria implements IMetodo {

    @Override
    public void descontar(int monto) {
        System.out.println(" tiene el precio instalación de: " +(monto-(5*monto/100))+"Bs. con pago por transferencia bancaria");
    }
}
