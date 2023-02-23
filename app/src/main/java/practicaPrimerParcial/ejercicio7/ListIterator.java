package practicaPrimerParcial.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class ListIterator implements Iterator{

    private List<Empleado> empleados = new ArrayList<>();
    private int position = 0;

    public ListIterator(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public Object next() {
        return this.empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.empleados.size() != 0 && position < this.empleados.size();
    }
    
}
