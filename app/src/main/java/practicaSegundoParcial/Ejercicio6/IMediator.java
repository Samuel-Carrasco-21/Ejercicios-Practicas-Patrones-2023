package practicaSegundoParcial.Ejercicio6;

public interface IMediator {
    void sendOneUser(String message, Usuario Usuario);
    void sendAllGroup(String message, Usuario usuario);
    Usuario infUsuario(int codigo) throws Exception;
}
