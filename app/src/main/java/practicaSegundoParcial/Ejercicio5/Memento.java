package practicaSegundoParcial.Ejercicio5;

public class Memento {
    private Proyecto proyecto;

    public Memento(Proyecto proyecto){
        this.proyecto = proyecto;
    }

    public Proyecto mostrarProyecto(){
        return proyecto;
    }
}
