package bridge.practica.ejercicio2;

public class Client {
    public static void main(String[] args) {



        EnviarAire aire = new EnviarAire();
        EnviarTierra tierra = new EnviarTierra();
        EnviarMar mar = new EnviarMar();

        EmpresaSRL empresaSRL1 = new EmpresaSRL(aire);
        EmpresaSRL empresaSRL2 = new EmpresaSRL(tierra);
        EmpresaSRL empresaSRL3 = new EmpresaSRL(mar);

        EmpresaSA empresaSA1 = new EmpresaSA(aire);
        EmpresaSA empresaSA2 = new EmpresaSA(tierra);
        EmpresaSA empresaSA3 = new EmpresaSA(mar);



        empresaSRL1.cotizarPaquete("Paquete 1",50);
        empresaSRL2.cotizarPaquete("Paquete 2",50);
        empresaSRL3.cotizarPaquete("Paquete 3",50);

        empresaSA1.cotizarPaquete("Paquete 1",100);
        empresaSA2.cotizarPaquete("Paquete 2",100);
        empresaSA3.cotizarPaquete("Paquete 3",100);


    }
}
