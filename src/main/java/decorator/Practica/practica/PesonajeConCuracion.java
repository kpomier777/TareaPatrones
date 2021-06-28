package decorator.Practica.practica;

public class PesonajeConCuracion extends Decorator {

    private int valorDescontar =15;
    public PesonajeConCuracion(Juego componente){
        super(componente);
    }

    public void operation(PersonajeBasico cuentaBasic){
        super.operation(cuentaBasic);
        if (cuentaBasic.getNivel()>=2){
            cuentaBasic.setPuntosRegeneracionVida(cuentaBasic.getPuntosRegeneracionVida()+80);
            System.out.println("Personaje con regeneracion de vida: ");
            System.out.println("Nombre: "+cuentaBasic.getNombre());
            System.out.println("NIvel: "+cuentaBasic.getNivel());
            System.out.println("Armas: "+cuentaBasic.getArmas());
            System.out.println("Porcentaje de armadura: "+cuentaBasic.getPorcentajeArmadura()+"%");
            System.out.println("Puntos de ataque: "+cuentaBasic.getPuntosAtaque());
            System.out.println("Puntos de defenza: "+cuentaBasic.getPuntosDefensa());
            System.out.println("Puntos de regenración de vida: "+cuentaBasic.getPuntosRegeneracionVida());
        }else {
            System.out.println("Este personaje todavia no puede recibir regeneracion de vida");
        }
    }

}
