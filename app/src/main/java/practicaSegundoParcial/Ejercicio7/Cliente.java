package practicaSegundoParcial.Ejercicio7;

public class Cliente {
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

    public void showInfo(){
        System.out.println("---- Cliente ----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Ci: "+ci);
        System.out.println("-----------------");
    }

    public void sacarDinero(int dinero){
        Prestamo.getInstance().obtenerPrestamo(dinero, this);
    }

    public void pagarDeuda(int dinero){
        Prestamo.getInstance().pagarPrestamo(dinero, this);
    }
}
