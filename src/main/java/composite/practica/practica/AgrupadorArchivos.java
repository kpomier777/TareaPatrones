package composite.practica.practica;

import java.util.ArrayList;
import java.util.List;


public class AgrupadorArchivos extends Documentos {

    private List<Documentos> list = new ArrayList<>();
    private int totalPalabras =0;

    public AgrupadorArchivos(int totalPalabras) {
        super(totalPalabras);
    }

    public AgrupadorArchivos() {
        super(0);
    }

    @Override
    public int totalPalabras() {

        for (Documentos componente:list ) {
            totalPalabras = totalPalabras +componente.totalPalabras();
        }
        System.out.println(getTipo()+" numero total de palabras " + totalPalabras );
        return totalPalabras;
    }

    @Override
    public void add(Documentos component) {
        list.add(component);

    }

    @Override
    public void remove(Documentos component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getNumeroPalabras());
    }
}
