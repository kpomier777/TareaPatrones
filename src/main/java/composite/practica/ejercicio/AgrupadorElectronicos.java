package composite.practica.ejercicio;

import java.util.ArrayList;
import java.util.List;


public class AgrupadorElectronicos extends ArtefactosElectronicos {

    private List<ArtefactosElectronicos> list = new ArrayList<>();
    private int totalPrecio =0;

    public AgrupadorElectronicos(int precio) {
        super(precio);
    }

    public AgrupadorElectronicos() {
        super(0);
    }

    @Override
    public int totalPrecio() {

        for (ArtefactosElectronicos componente:list ) {
            totalPrecio = totalPrecio +componente.totalPrecio();
        }
        System.out.println(getTipo()+" precio total " + totalPrecio +" $.");
        return totalPrecio;
    }

    @Override
    public void add(ArtefactosElectronicos component) {
        list.add(component);

    }

    @Override
    public void remove(ArtefactosElectronicos component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getPrecio());
    }
}
