package practicaSegundoParcial.Ejercicio5;

public interface ISubject {
    void attach (IObserver observer);
    void deattach (IObserver observer);
    Memento checkoutCommit(String codeCommit);
}
