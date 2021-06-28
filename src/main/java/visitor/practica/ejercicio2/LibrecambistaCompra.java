package visitor.practica.ejercicio2;




import java.text.DecimalFormat;

public class LibrecambistaCompra implements ILibrecambista {
    private int capital;

    public LibrecambistaCompra(int capital) {
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
        System.out.println("Convirtiendo "+capital+" Dolares a "+bolivia.getMoneda());
        System.out.println("Total: "+df.format(capital*6.86) +" "+bolivia.getMoneda());
    }

    @Override
    public void visitar(Argentina argentina) {
        System.out.println("Argentina> recibir librecambista");
        System.out.println("Convirtiendo Dolar a "+argentina.getMoneda());
        System.out.println("Total: "+df.format(capital*95.35) +" "+argentina.getMoneda());
    }

    @Override
    public void visitar(Brasil brasil) {
        System.out.println("Brasil> recibir librecambista");
        System.out.println("Convirtiendo Dolar a "+brasil.getMoneda());
        System.out.println("Total: "+df.format(capital*5.0639) +" "+brasil.getMoneda());
    }

    @Override
    public void visitar(Italia italia) {
        System.out.println("Italia> recibir librecambista");
        System.out.println("Convirtiendo Dolar a "+italia.getMoneda());
        System.out.println("Total: "+df.format(capital*1.1909) +" "+italia.getMoneda());
    }
}
