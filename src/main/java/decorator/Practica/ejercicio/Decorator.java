package decorator.Practica.ejercicio;

public class Decorator implements Cuenta {
    private Cuenta componente;

    public Decorator(Cuenta componente){
        this.componente = componente;

    }

    public void operation(CuentaBasic cuentaBasic){
        componente.operation(cuentaBasic);
    }
}
