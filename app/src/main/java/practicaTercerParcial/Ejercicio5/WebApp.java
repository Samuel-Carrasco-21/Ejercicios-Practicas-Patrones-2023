package practicaTercerParcial.Ejercicio5;

public class WebApp implements IComputadora {
    private String nombre;
    private int ip;
    private String marca;

    public WebApp(String nombre, String marca){
        this.nombre = nombre;
        this.ip = (int)(Math.random()*100000000);
        this.marca = marca;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("\n--- INICIAR SESION COMPUTADORA ---");
        System.out.println("Inicio Sesion WebApp");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("\n--- CERRAR SESION COMPUTADORA ---");
        System.out.println("Cerrar Sesion WebApp");
    }

    @Override
    public void generarDatos() {
        System.out.println("\n--- GENERAR DATOS COMPUTADORA ---");
        System.out.println("Generar Datos WebApp");
    }

    @Override
    public void infoComputadora() {
        System.out.println("\n--- COMPUTADORA ---");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* IP: "+ip);
        System.out.println("* Marca: "+marca);
    }
    
}
