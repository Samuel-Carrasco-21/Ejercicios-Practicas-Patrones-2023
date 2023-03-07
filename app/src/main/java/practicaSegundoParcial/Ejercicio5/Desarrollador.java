package practicaSegundoParcial.Ejercicio5;

public class Desarrollador extends UsuarioMC{

    public Desarrollador(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void messageReceived(String msg, Memento memento) {
        System.out.println("\n--- Nuevo Mensaje ---");
        System.out.println("Para:");
        this.showInfoUMC();
        System.out.println("--- Repositorio Actualizado ---");
        System.out.println("Codigo Commit: "+msg);
        memento.mostrarProyecto().showInfo();
        
    }
    
}
