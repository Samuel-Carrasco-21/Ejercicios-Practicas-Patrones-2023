package practicaPrimerParcial.ejercicio1;

public class Estudiante {
    private String nombre;
    private int codigoEstudiante;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, int codigoEstudiante) {
        this.nombre = nombre;
        this.codigoEstudiante = codigoEstudiante;
    }

    public void pagarMatricula(int monto){
        VentanillaPago.getInstance()
        .pagarMatricula(monto,this.nombre,this.codigoEstudiante);
        System.out.println();
    }

}
