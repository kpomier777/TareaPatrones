package decorator.Practica.practica;

public class PersonajeBasico implements Juego {

    public String nombre;
    public int nivel;
    public String armas;
    public int porcentajeArmadura;
    public int puntosAtaque;
    public int puntosDefensa;
    public int puntosRegeneracionVida;

    public PersonajeBasico(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public int getPorcentajeArmadura() {
        return porcentajeArmadura;
    }

    public void setPorcentajeArmadura(int porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getPuntosRegeneracionVida() {
        return puntosRegeneracionVida;
    }

    public void setPuntosRegeneracionVida(int puntosRegeneracionVida) {
        this.puntosRegeneracionVida = puntosRegeneracionVida;
    }

    public void operation(PersonajeBasico cuentaBasic){
        setArmas("Ninguna");
        setPorcentajeArmadura(1);
        setPuntosAtaque(1);
        setPuntosDefensa(1);
        setPuntosRegeneracionVida(1);
        System.out.println("Personaje creado con: ");
        System.out.println("Nombre: "+getNombre());
        System.out.println("NIvel: "+getNivel());
        System.out.println("Armas: "+getArmas());
        System.out.println("Porcentaje de armadura: "+getPorcentajeArmadura()+"%");
        System.out.println("Puntos de ataque: "+getPuntosAtaque());
        System.out.println("Puntos de defenza: "+getPuntosDefensa());
        System.out.println("Puntos de regenración de vida: "+getPuntosRegeneracionVida());
    }
}
