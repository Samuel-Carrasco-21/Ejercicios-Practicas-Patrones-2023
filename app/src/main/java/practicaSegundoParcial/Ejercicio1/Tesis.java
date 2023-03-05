package practicaSegundoParcial.Ejercicio1;

public class Tesis {
    private String titulo;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private int codigo;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private String descripcion;
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Tesis(String titulo, int codigo, String descripcion) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public void showInfo(){
        System.out.println("---------------");
        System.out.println("Titulo: "+titulo);
        System.out.println("Codigo: "+codigo);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("---------------");
    }
}
