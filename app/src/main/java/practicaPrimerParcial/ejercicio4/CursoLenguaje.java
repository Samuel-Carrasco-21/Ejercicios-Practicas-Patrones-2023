package practicaPrimerParcial.ejercicio4;

import java.util.Scanner;

public class CursoLenguaje extends BuilderCurso{

    @Override
    public void asignarNombre() {
        // TODO Auto-generated method stub
        this.curso.setNombreCurso("Lenguaje");
    }

    @Override
    public void asignarDuracion() {
        // TODO Auto-generated method stub
        this.curso.setDuracion(60);
    }

    @Override
    public void asignarCreditos() {
        // TODO Auto-generated method stub
        this.curso.setCreditos(3);
    }

    @Override
    public void asignarDocente() {
        // TODO Auto-generated method stub
        this.curso.setDocente(new Docente("Docente 2", 2000));
    }

    @Override
    public void asignarHorario() {
        // TODO Auto-generated method stub
        this.curso.setHorario("B");
    }

    @Override
    public void asignarEstudiante() {
        // TODO Auto-generated method stub
        this.curso.setEstudiante(new Estudiante
        (Integer.parseInt(enviarDato("Codigo Estudiante"))
        ,enviarDato("Nombre Estudiante")));
    }

    public String enviarDato(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dato para "+mensaje+": ");
        String dato = scanner.nextLine();
        return dato;
    }
    
}
