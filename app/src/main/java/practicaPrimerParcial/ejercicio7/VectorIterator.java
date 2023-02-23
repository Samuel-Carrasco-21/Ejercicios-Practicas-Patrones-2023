package practicaPrimerParcial.ejercicio7;

import java.util.Vector;

public class VectorIterator implements Iterator{
    private Vector<Empleado> empleados = new Vector<>();
    private int position = 0;
    public VectorIterator(Vector<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        return empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return this.empleados.size() != 0 && position < this.empleados.size();
    }
    
}
