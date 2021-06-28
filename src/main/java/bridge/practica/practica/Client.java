package bridge.practica.practica;

public class Client {
    public static void main(String[] args) {



        PagoEfectivo efectivo = new PagoEfectivo();
        PagoAplicacion pagoAplicacion = new PagoAplicacion();
        PagoTigoMoney tigoMoney = new PagoTigoMoney();
        PagoTransferenciaBancaria transferenciaBancaria = new PagoTransferenciaBancaria();

        EmpInstalacionAgua empresa1 = new EmpInstalacionAgua(efectivo);
        EmpInstalacionAgua empresa2 = new EmpInstalacionAgua(pagoAplicacion);
        EmpInstalacionAgua empresa3 = new EmpInstalacionAgua(tigoMoney);
        EmpInstalacionAgua empresa4 = new EmpInstalacionAgua(transferenciaBancaria);

        EmpInstalacionElectrica empresaE1 = new EmpInstalacionElectrica(efectivo);
        EmpInstalacionElectrica empresaE2 = new EmpInstalacionElectrica(pagoAplicacion);
        EmpInstalacionElectrica empresaE3 = new EmpInstalacionElectrica(tigoMoney);
        EmpInstalacionElectrica empresaE4 = new EmpInstalacionElectrica(transferenciaBancaria);

        EmpInstalacionAlcantarillado empresaA1 = new EmpInstalacionAlcantarillado(efectivo);
        EmpInstalacionAlcantarillado empresaA2 = new EmpInstalacionAlcantarillado(pagoAplicacion);
        EmpInstalacionAlcantarillado empresaA3 = new EmpInstalacionAlcantarillado(tigoMoney);
        EmpInstalacionAlcantarillado empresaA4 = new EmpInstalacionAlcantarillado(transferenciaBancaria);



        empresa1.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",200);
        empresa2.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",200);
        empresa3.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",200);
        empresa4.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",200);

        empresaE1.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",300);
        empresaE2.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",300);
        empresaE3.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",300);
        empresaE4.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",300);

        empresaA1.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",400);
        empresaA2.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",400);
        empresaA3.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",400);
        empresaA4.precioDeInstalaicon("Kevin Pomier","Plaza Avaroa",400);




    }
}
