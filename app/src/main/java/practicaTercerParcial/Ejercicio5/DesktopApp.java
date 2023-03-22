package practicaTercerParcial.Ejercicio5;

public class DesktopApp implements IComputadora{
    private String nombre;
    private String usuario;
    private String marca;

    public DesktopApp(String nombre, String usuario, String marca){
        this.nombre = nombre;
        this.usuario = usuario;
        this.marca = marca;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("\n--- INICIAR SESION COMPUTADORA ---");
        System.out.println("Inicio Sesion Desktop");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("\n--- CERRAR SESION COMPUTADORA ---");
        System.out.println("Cerrar Sesion Desktop");
    }

    @Override
    public void generarDatos() {
        System.out.println("\n--- GENERAR DATOS COMPUTADORA ---");
        System.out.println("Generar Datos Desktop");
    }

    @Override
    public void infoComputadora() {
        System.out.println("\n--- COMPUTADORA ---");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Usuario: "+usuario);
        System.out.println("* Marca: "+marca);
    }
    
    
}
