package practicaSegundoParcial.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Docente {
    private List<Memento> tesisList = new ArrayList<>();

    public Docente addMemento(Memento memento){
        tesisList.add(memento);
        return this;
    }

    public Memento getMemento(int index){
        return tesisList.get(index);
    }
}
