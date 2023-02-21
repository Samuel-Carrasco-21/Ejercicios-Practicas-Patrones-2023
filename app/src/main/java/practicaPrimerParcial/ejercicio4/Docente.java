package practicaPrimerParcial.ejercicio4;

public class Docente {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int codigo;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Docente(String nombre, int codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
}
