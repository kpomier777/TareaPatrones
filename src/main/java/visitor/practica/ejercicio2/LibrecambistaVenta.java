package visitor.practica.ejercicio2;




import java.text.DecimalFormat;

public class LibrecambistaVenta implements ILibrecambista {

    private int capital;

    public LibrecambistaVenta(int capital) {
        this.capital = capital;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    DecimalFormat df = new DecimalFormat("#.00");
    @Override
    public void visitar(Bolivia bolivia) {
        System.out.println("Bolivia> recibir librecambista");
        System.out.println("Convirtiendo "+capital+" "+bolivia.getMoneda()+" a Dolares");
        System.out.println("Total: "+df.format(capital*6.97)  +" Dolares");

    }

    @Override
    public void visitar(Argentina argentina) {
        System.out.println("Argentina> recibir librecambista");
        System.out.println("Convirtiendo "+capital+" "+argentina.getMoneda()+" a Dolares");
        System.out.println("Total: "+df.format(capital*95.355)  +" Dolares");
    }

    @Override
    public void visitar(Brasil brasil) {
        System.out.println("Brasil> recibir librecambista");
        System.out.println("Convirtiendo "+capital+" "+brasil.getMoneda()+" a Dolares");
        System.out.println("Total: "+df.format(capital*5.0664)  +" Dolares");
    }

    @Override
    public void visitar(Italia italia) {
        System.out.println("Italia> recibir librecambista");
        System.out.println("Convirtiendo "+capital+" "+italia.getMoneda()+" a Dolares");
        System.out.println("Total: "+df.format(capital*1.1913)  +" Dolares");
    }
}
