package visitor.practica.practica;


public interface IAppHealth {

    void visitar(Computadora computadora);
    void visitar(Celular celular);
    void visitar(Televisor televisor);
}
