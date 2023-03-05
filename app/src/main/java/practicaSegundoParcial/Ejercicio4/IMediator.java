package practicaSegundoParcial.Ejercicio4;

public interface IMediator {
    void sendOneUser(String message, Usuario Usuario);
    void sendAllGroup(String message, String grupo, Usuario usuario);
}
