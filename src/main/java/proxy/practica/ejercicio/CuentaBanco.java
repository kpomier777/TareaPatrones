package proxy.practica.ejercicio;

public class CuentaBanco implements ICuentaBanco {

    TargetaDebito targetaDebito;
    private int montoGuardado;

    public int getMontoGuardado() {
        return montoGuardado;
    }

    public void setMontoGuardado(int montoGuardado) {
        this.montoGuardado = montoGuardado;
    }

    public CuentaBanco(TargetaDebito targetaDebito, int montoGuardado) {
        this.targetaDebito = targetaDebito;
        this.montoGuardado = montoGuardado;
    }


    @Override
    public void realizarCompra() {
        System.out.println("Procesando... compra con el monto de "+ this.targetaDebito.getMontoCompra() +" Bs. su saldo es "+ this.getMontoGuardado()+" Bs.");
    }
}
