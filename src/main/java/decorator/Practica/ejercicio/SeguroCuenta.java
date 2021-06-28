package decorator.Practica.ejercicio;

public class SeguroCuenta extends Decorator {

    private int valorDescontar =15;
    public SeguroCuenta(Cuenta componente){
        super(componente);
    }

    public void operation(CuentaBasic cuentaBasic){
        super.operation(cuentaBasic);
        System.out.println("Este servicio le descontara el "+ valorDescontar+"% de su monto actual");
        cuentaBasic.setMonto(cuentaBasic.getMonto()-(valorDescontar*cuentaBasic.getMonto()/100));
        System.out.println("El monto de su cuenta actual es: "+cuentaBasic.getMonto());
    }

}
