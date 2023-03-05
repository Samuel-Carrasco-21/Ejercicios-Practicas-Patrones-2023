package practicaSegundoParcial.Ejercicio4;

public class OneUsuario extends Usuario{

    public OneUsuario(IMediator mediator) {
        super(mediator);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void messageReceived(String msg, Usuario usuario) {
        System.out.println("\n--- MENSAJE NUEVO ---");
        System.out.println("De: ");
        usuario.showInfo();
        System.out.println("Contenido:\n"+msg);
    }

    @Override
    public void sendOneUser(String msg, Usuario usuario) {
        this.mediator.sendOneUser(msg, usuario);
    }

    @Override
    public void sendAllGroup(String message, String grupo) {
        this.mediator.sendAllGroup(message, grupo, this);
    }
    
}
