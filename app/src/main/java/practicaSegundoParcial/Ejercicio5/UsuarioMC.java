package practicaSegundoParcial.Ejercicio5;

public abstract class UsuarioMC {
    protected IMediator mediator;

    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private int ci;
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }

    public void showInfoUMC(){
        System.out.println("---------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Ci: "+ci);
        System.out.println("---------------");
    }

    public UsuarioMC(IMediator mediator){
        this.mediator = mediator;
    } 
    public abstract void messageReceived(String msg, Memento memento);
}
