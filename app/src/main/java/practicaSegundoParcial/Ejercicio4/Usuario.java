package practicaSegundoParcial.Ejercicio4;

public abstract class Usuario {
    protected IMediator mediator;

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    private int ci;
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }

    private String grupo;
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Usuario (IMediator mediator){
        this.mediator=mediator;
    }

    public void showInfo(){
        System.out.println("--- USUARIO ---");
        System.out.println("Nombre: "+name);
        System.out.println("CI: "+ci);
        System.out.println("Grupo: "+grupo);
    }

    public abstract void sendOneUser(String msg, Usuario usuario);
    public abstract void sendAllGroup(String message, String grupo);
    public abstract void messageReceived(String msg, Usuario usuario);
}
