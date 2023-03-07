package practicaSegundoParcial.Ejercicio5;

public class Proyecto {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public Proyecto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    private String code;
    public String getCode() {
        return code;
    }
    public Proyecto setCode(String code) {
        this.code = code;
        return this;
    }

    public void showInfo(){
        System.out.println("--- Proyect info ---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Code: "+code);
        System.out.println("--------------------");
    }
}
