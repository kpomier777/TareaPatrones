package decorator.Practica.ejercicio;

public class PromocionCuenta extends Decorator {

    private boolean ganador;

    public boolean getGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public PromocionCuenta(Cuenta cuenta){
        super(cuenta);
    }

    public void operation(CuentaBasic cuentaBasic){
        super.operation(cuentaBasic);
        hacerSorteo(cuentaBasic);
        if (ganador){
            System.out.println("Felicidades!!! "+ cuentaBasic.getNombrePropietario()+" ganó la promocion duplica tu cuenta");
            cuentaBasic.setMonto(cuentaBasic.getMonto()*2);
            System.out.println("El monto actual de tu cuenta es: "+cuentaBasic.getMonto());
            setGanador(false);
        }else {
            System.out.println("Lo lamentamos no gano el sorteo");
        }


    }

    private void hacerSorteo(CuentaBasic cuentaBasic) {
        int ran = (int) (Math.random()*5 + 1);
        if (ran % 2 ==0){
            this.setGanador(true);
            cuentaBasic.setMonto(cuentaBasic.getMonto()*2);
        }
    }


}
