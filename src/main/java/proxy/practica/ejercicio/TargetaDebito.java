package proxy.practica.ejercicio;

public class TargetaDebito {

    private Moneda tipoMonedaAlComprar;
    private int montoCompra;

    public TargetaDebito() {
    }

    public Moneda getTipoMonedaAlComprar() {
        return tipoMonedaAlComprar;
    }

    public void setTipoMonedaAlComprar(Moneda tipoMonedaAlComprar) {
        this.tipoMonedaAlComprar = tipoMonedaAlComprar;
    }

    public int getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(int montoCompra) {
        this.montoCompra = montoCompra;
    }
}
