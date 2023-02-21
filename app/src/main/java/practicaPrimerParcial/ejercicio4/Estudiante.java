package practicaPrimerParcial.ejercicio4;

public class Estudiante {
    private int ci;
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Estudiante(int ci, String name) {
        this.ci = ci;
        this.name = name;
    }
}
