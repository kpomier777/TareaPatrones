package decorator.Practica.practica;

public class Decorator implements Juego {
    private Juego componente;

    public Decorator(Juego componente){
        this.componente = componente;

    }

    public void operation(PersonajeBasico cuentaBasic){
        componente.operation(cuentaBasic);
    }
}
