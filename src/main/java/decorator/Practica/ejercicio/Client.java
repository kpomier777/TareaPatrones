package decorator.Practica.ejercicio;

public class Client {
    public static void main(String[] args) {
        CuentaBasic cuentaBasic= new CuentaBasic(3300,"Kevin");
        Cuenta cuenta = cuentaBasic;
        cuenta = new BancaInternet(cuenta);
        cuenta = new PromocionCuenta(cuenta);
        cuenta = new SeguroCuenta(cuenta);

        cuenta.operation(cuentaBasic);
    }
}
