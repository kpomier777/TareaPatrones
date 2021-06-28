package composite.practica.ejercicio;

public class Client {
    public static void main (String [] args){
        Computadora computadora1 = new Computadora(100);
        Computadora computadora2 = new Computadora(100);
        Computadora computadora3 = new Computadora(100);
        Computadora computadora4 = new Computadora(100);

        computadora1.setTipo("Computadora gamer");
        computadora2.setTipo("Computadora grafica");
        computadora3.setTipo("Computadora portatil");
        computadora4.setTipo("Computadora de escritorio");


        AgrupadorElectronicos laboratorio1 = new AgrupadorElectronicos();
        laboratorio1.setTipo("Laboratorio 1");
        laboratorio1.add(computadora1);
        laboratorio1.add(computadora2);
        laboratorio1.add(computadora3);
        laboratorio1.add(computadora4);

        AgrupadorElectronicos laboratorio2 = new AgrupadorElectronicos();
        laboratorio2.setTipo("Laboratorio 2");
        laboratorio2.add(computadora1);
        laboratorio2.add(computadora2);
        laboratorio2.add(computadora3);
        laboratorio2.add(computadora4);

        AgrupadorElectronicos contenedor1 = new AgrupadorElectronicos();
        contenedor1.setTipo("Contenedor 1");
        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);

        contenedor1.totalPrecio();


    }

}
