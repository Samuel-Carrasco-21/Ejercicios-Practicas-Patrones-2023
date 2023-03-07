package practicaSegundoParcial.Ejercicio7;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void montoEconomico(int amount, Cliente cliente);
}
