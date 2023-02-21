package practicaPrimerParcial.ejercicio2;

public class Docente{
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String codigoDocente;
    public String getCodigoDocente() {
        return codigoDocente;
    }
    public void setCodigoDocente(int codigoDocente) {
        this.codigoDocente = Integer.toString(codigoDocente);
    }

    public Docente(String nombre,int codigoDocente){
        this.nombre = nombre;
        this.codigoDocente = Integer.toString(codigoDocente);
    }
}
