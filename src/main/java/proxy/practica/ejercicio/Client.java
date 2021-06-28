package proxy.practica.ejercicio;

public class Client {
    public static void main (String [] args){
        // create proxy
        TargetaDebito tarjetaBisa= new TargetaDebito();
        CuentaBanco cuentaBisa=new CuentaBanco(tarjetaBisa,100);
        Proxy proxy = new Proxy(tarjetaBisa,cuentaBisa);

        tarjetaBisa.setTipoMonedaAlComprar(Moneda.BOLIVIANO);
        tarjetaBisa.setMontoCompra(10);
        proxy.realizarCompra();

        tarjetaBisa.setTipoMonedaAlComprar(Moneda.DOLAR);
        tarjetaBisa.setMontoCompra(2);
        proxy.realizarCompra();

        tarjetaBisa.setTipoMonedaAlComprar(Moneda.EURO);
        tarjetaBisa.setMontoCompra(2);

        proxy.realizarCompra();

        tarjetaBisa.setTipoMonedaAlComprar(Moneda.BOLIVIANO);
        tarjetaBisa.setMontoCompra(70);

        proxy.realizarCompra();


    }
}
