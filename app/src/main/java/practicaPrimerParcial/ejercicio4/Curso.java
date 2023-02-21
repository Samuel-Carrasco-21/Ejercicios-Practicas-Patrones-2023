package practicaPrimerParcial.ejercicio4;

public class Curso {
    private String nombreCurso;
    public String getNombreCurso() {
        return nombreCurso;
    }
    public Curso setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        return this;
    }
    
    private int duracion;
    public int getDuracion() {
        return duracion;
    }
    public Curso setDuracion(int duracion) {
        this.duracion = duracion;
        return this;
    }

    private int creditos;
    public int getCreditos() {
        return creditos;
    }
    public Curso setCreditos(int creditos) {
        this.creditos = creditos;
        return this;
    }

    private Docente docente;
    public Docente getDocente() {
        return docente;
    }
    public Curso setDocente(Docente docente) {
        this.docente = docente;
        return this;
    }

    private String horario;
    public String getHorario() {
        return horario;
    }
    public Curso setHorario(String horario) {
        this.horario = horario;
        return this;
    }

    private Estudiante estudiante;
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public Curso setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
        return this;
    }
    public void showCurso(){
        System.out.println("\n--- INFORMACION CURSO ---");
        System.out.println("Nombre: "+getNombreCurso());
        System.out.println("Duracion: "+getDuracion());
        System.out.println("Creditos: "+getCreditos());
        System.out.println("Nombre Docente: "+getDocente().getNombre());
        System.out.println("Codigo Docente: "+getDocente().getCodigo());
        System.out.println("Horario: "+getHorario());
        System.out.println("Nombre Estudiante: "+getEstudiante().getName());
        System.out.println("Codigo Estudiante: "+getEstudiante().getCi());
        System.out.println();
    }
}
