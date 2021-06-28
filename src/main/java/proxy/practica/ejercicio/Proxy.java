package proxy.practica.ejercicio;

public class Proxy implements ICuentaBanco {
    private TargetaDebito targetaDebito;
    private CuentaBanco cuentaBanco;

    public Proxy(TargetaDebito targetaDebito, CuentaBanco cuentaBanco) {
        this.targetaDebito = targetaDebito;
        this.cuentaBanco = cuentaBanco;
    }

    @Override
    public void realizarCompra() {
        if (targetaDebito.getTipoMonedaAlComprar() == Moneda.DOLAR ) {
            System.out.print("Usted ingreso el monto de "+targetaDebito.getMontoCompra()+ " Dolares ");
            targetaDebito.setMontoCompra(targetaDebito.getMontoCompra()*7);
            System.out.println("se lo convertirá a "+ targetaDebito.getMontoCompra()+ " Bs.");
            if (targetaDebito.getMontoCompra() <= cuentaBanco.getMontoGuardado() ){
                cuentaBanco.setMontoGuardado(cuentaBanco.getMontoGuardado()-targetaDebito.getMontoCompra());
                this.cuentaBanco.realizarCompra();
            }else{
                System.out.println("Usted excedió el monto guardo en el banco");
            }
        }else if (targetaDebito.getTipoMonedaAlComprar() == Moneda.EURO){
            System.out.print("Usted ingreso el monto de "+targetaDebito.getMontoCompra()+ " Euros ");
            targetaDebito.setMontoCompra(targetaDebito.getMontoCompra()*9);
            System.out.println("se lo convertirá a "+ targetaDebito.getMontoCompra()+ " Bs.");
            if (targetaDebito.getMontoCompra() <= cuentaBanco.getMontoGuardado()){
                cuentaBanco.setMontoGuardado(cuentaBanco.getMontoGuardado()-targetaDebito.getMontoCompra());
                this.cuentaBanco.realizarCompra();
            }else{
                System.out.println("Usted excedió el monto guardo en el banco");
            }
        }else if (targetaDebito.getTipoMonedaAlComprar() == Moneda.BOLIVIANO){
            System.out.println("Usted ingreso el monto de "+targetaDebito.getMontoCompra()+ " Bs. ");
            if (targetaDebito.getMontoCompra() <= cuentaBanco.getMontoGuardado()){
                cuentaBanco.setMontoGuardado(cuentaBanco.getMontoGuardado()-targetaDebito.getMontoCompra());
                this.cuentaBanco.realizarCompra();
            }else{
                System.out.println("Usted excedió el monto guardo en el banco");
            }
        }else {
            System.out.println(" No existe esta moneda en el mundo programado");
        }


    }
}
