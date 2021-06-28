package decorator.Practica.ejercicio;

public class BancaInternet extends Decorator {
    private boolean internet;

    public BancaInternet(Cuenta componente){
        super(componente);
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public void operation(CuentaBasic cuentaBasic){
        super.operation(cuentaBasic);
        verificarDisponibilidad(cuentaBasic);
        if (internet){
            System.out.println(cuentaBasic.getNombrePropietario()+" usted cumple con los requisitos para poder tener una banca por internet");
        }else {
            System.out.println(cuentaBasic.getNombrePropietario()+" no se le puede dar el servicio de banca por internet");
        }
    }

    private void verificarDisponibilidad(CuentaBasic cuentaBasic) {
        if (cuentaBasic.getMonto() >= 3000){
            this.setInternet(true);
        }else {
            this.setInternet(false);
        }


    }


}
