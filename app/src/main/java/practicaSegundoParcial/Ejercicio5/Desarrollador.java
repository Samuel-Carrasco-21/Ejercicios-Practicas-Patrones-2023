package practicaSegundoParcial.Ejercicio5;

public class Desarrollador  implements IObserver{

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

    public void showInfoDev(){
        System.out.println("---------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Ci: "+ci);
        System.out.println("---------------");
    }

    @Override
    public void update(String msg, Memento memento) {
        System.out.println("\n--- Nuevo Mensaje ---");
        System.out.println("Para:");
        this.showInfoDev();
        System.out.println("--- Repositorio Actualizado ---");
        System.out.println("Codigo Commit: "+msg);
        memento.mostrarProyecto().showInfo();
    }
    
}




