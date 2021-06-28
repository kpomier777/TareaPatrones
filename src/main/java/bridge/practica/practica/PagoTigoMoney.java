package bridge.practica.practica;

public class PagoTigoMoney implements IMetodo {


    @Override
    public void descontar(int monto) {
        System.out.println(" tiene el precio instalación de: " +(monto-(2*monto/100))+"Bs. con pago mediante tigo money");
    }
}


