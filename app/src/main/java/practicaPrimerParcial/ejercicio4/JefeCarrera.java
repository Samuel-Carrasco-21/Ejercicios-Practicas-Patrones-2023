package practicaPrimerParcial.ejercicio4;

public class JefeCarrera {
    private BuilderCurso builderCurso;

    public Curso getCurso(){
        return builderCurso.getCurso();
    }

    public void setCurso(BuilderCurso builder){
        this.builderCurso = builder;
    }

    public void asignarCurso(){
        this.builderCurso.inscripcionCurso();
        this.builderCurso.asignarNombre();
        this.builderCurso.asignarCreditos();
        this.builderCurso.asignarDuracion();
        this.builderCurso.asignarDocente();
        this.builderCurso.asignarHorario();
        this.builderCurso.asignarEstudiante();
    }
}
