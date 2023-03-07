package practicaSegundoParcial.Ejercicio6;

import java.util.Scanner;

public class Desarrollador extends Usuario{

    public Desarrollador(IMediator mediator) {
        super(mediator);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void sendOneUser(String msg, Usuario usuario) {
        this.mediator.sendOneUser(msg, usuario);
    }

    public void subiendoCodigo(String tipoMensaje, 
        String cambios, 
        ProyectoGitHub proyectoGitHub) throws Exception{

        if(tipoMensaje.toLowerCase().equals("personal")){

            int codigo = Integer.parseInt(pedirDato("CI Usuario"));
            proyectoGitHub.realizarCambios(cambios);

            sendOneUser("Subiendo nuevo Codigo a GitHub",
            this.mediator.infUsuario(codigo));
        }else{
            proyectoGitHub.realizarCambios(cambios);
            sendAllGroup("Subiendo nuevo Codigo a GitHub");
        }
    }

    public void tareaBacklog(String tipoMensaje,
        String tareaBacklog, 
        ProyectoGitHub proyectoGitHub) throws Exception{
            
        if(proyectoGitHub.removeTareaBacklog(tareaBacklog.toLowerCase())){
            
            if(tipoMensaje.toLowerCase().equals("personal")){

                int codigo = Integer.parseInt(pedirDato("CI Usuario"));
                sendOneUser("Tomando la tarea "+tareaBacklog+" del backlog",
                this.mediator.infUsuario(codigo));

            }else{
                sendAllGroup("Tomando una tarea del backlog");
            }
        }else{
            throw new Exception("Tarea no encontrada");
        }
    }

    @Override
    public void sendAllGroup(String message) {
        this.mediator.sendAllGroup(message, this); 
    }

    @Override
    public void messageReceived(String msg, Usuario usuario) {
        System.out.println("\n--- MENSAJE NUEVO ---");
        System.out.println("Para:");
        usuario.showInfo();
        System.out.println("Contenido:\n"+msg);
    }

    public String pedirDato(String dato){
        System.out.print("Digite el dato para "+dato.toLowerCase()+": ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        return input;
    }
    
}
