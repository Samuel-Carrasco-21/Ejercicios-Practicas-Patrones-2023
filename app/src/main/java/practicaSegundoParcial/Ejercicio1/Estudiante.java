package practicaSegundoParcial.Ejercicio1;

public class Estudiante {
    private Tesis tesis;

    public void setTesis(Tesis state){
        System.out.println("Nueva Tesis");
        state.showInfo();
        tesis = state;
    }

    public Memento createMemento(){
        return new Memento(tesis);
    }

    public void restoreMemento(Memento memento){
        tesis = memento.getTesis();
        System.out.println("Restore Tesis");
        tesis.showInfo();
    }
}
