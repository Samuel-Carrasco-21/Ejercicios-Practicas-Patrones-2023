package practicaPrimerParcial.ejercicio4;

public class Main {
    public static void main(String[] args) {
        JefeCarrera jefeCarrera = new JefeCarrera();
        CursoMatematicas matematicas = new CursoMatematicas();
        CursoLenguaje lenguaje = new CursoLenguaje();
        CursoHistoria historia = new CursoHistoria();
        CursoIngles ingles = new CursoIngles();
        Curso curso = null;

        jefeCarrera.setCurso(ingles);
        jefeCarrera.asignarCurso();
        curso = jefeCarrera.getCurso();
        curso.showCurso();
        
        jefeCarrera.setCurso(historia);
        jefeCarrera.asignarCurso();
        curso = jefeCarrera.getCurso();
        curso.showCurso();

        jefeCarrera.setCurso(lenguaje);
        jefeCarrera.asignarCurso();
        curso = jefeCarrera.getCurso();
        curso.showCurso();

        jefeCarrera.setCurso(matematicas);
        jefeCarrera.asignarCurso();
        curso = jefeCarrera.getCurso();
        curso.showCurso();
    }
}
