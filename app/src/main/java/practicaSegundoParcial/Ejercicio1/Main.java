package practicaSegundoParcial.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente();
        Estudiante estudiante = new Estudiante();

        Tesis tesis;
        tesis = 
        new Tesis(
            "Tesis 1",
            1021,
            "Hola mundo one");

        estudiante.setTesis(tesis);
        docente.addMemento(estudiante.createMemento());

        tesis = 
        new Tesis(
            "Tesis 2",
            2021,
            "Hola mundo two");
        estudiante.setTesis(tesis);
        docente.addMemento(estudiante.createMemento());

        tesis = 
        new Tesis(
            "Tesis 3",
            3021,
            "Hola mundo three");
        estudiante.setTesis(tesis);
        docente.addMemento(estudiante.createMemento());

        tesis = 
        new Tesis(
            "Tesis 4",
            4021,
            "Hola mundo four");
        estudiante.setTesis(tesis);
        docente.addMemento(estudiante.createMemento());

        tesis = 
        new Tesis(
            "Tesis 5",
            5021,
            "Hola mundo five");
        estudiante.setTesis(tesis);
        docente.addMemento(estudiante.createMemento());

        System.out.println("\nEstado Actual:");
        tesis.showInfo();

        estudiante.restoreMemento(docente.getMemento(2));
    }
}
