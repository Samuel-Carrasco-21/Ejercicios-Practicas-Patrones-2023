package practicaPrimerParcial.ejercicio4;

public abstract class BuilderCurso {
    protected Curso curso;

    public Curso getCurso(){
        return curso;
    }

    public void inscripcionCurso(){
        curso = new Curso();
    }

    public abstract void asignarNombre();
    public abstract void asignarDuracion();
    public abstract void asignarCreditos();
    public abstract void asignarDocente();
    public abstract void asignarHorario();
    public abstract void asignarEstudiante();
}
