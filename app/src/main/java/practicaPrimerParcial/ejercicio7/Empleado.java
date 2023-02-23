package practicaPrimerParcial.ejercicio7;

public class Empleado {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Empleado(String name, int codigo) {
        this.name = name;
        this.codigo = codigo;
    }
}
