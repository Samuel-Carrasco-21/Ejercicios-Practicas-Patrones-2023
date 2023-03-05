package practicaSegundoParcial.Ejercicio2;

public interface IHandler {
    void setNext(IHandler iHandler);
    IHandler next();

    void ordenMilitar(String orden);

}
