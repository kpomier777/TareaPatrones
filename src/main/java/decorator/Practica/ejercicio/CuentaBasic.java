package decorator.Practica.ejercicio;

public class CuentaBasic implements Cuenta {
    public int monto;
    public String nombrePropietario;

    public CuentaBasic(int monto, String nombrePropietario) {
        this.monto = monto;
        this.nombrePropietario = nombrePropietario;
    }

    public int getMonto() {
        if (monto<=0){
            return 0;
        }
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void operation(CuentaBasic cuentaBasic){
        System.out.println("Cuenta basica con el monto de: "+ monto + " y con el propietario: "+nombrePropietario);
    }
}
