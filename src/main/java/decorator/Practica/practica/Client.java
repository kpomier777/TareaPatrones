package decorator.Practica.practica;

public class Client {
    public static void main(String[] args) {
        PersonajeBasico personajebasico= new PersonajeBasico("Kevin",1);
        Juego juego = personajebasico;
        juego = new PersonajeConArma(juego);
        juego = new PersonajeConEscudo(juego);
        juego = new PesonajeConCuracion(juego);

        juego.operation(personajebasico);
    }
}
