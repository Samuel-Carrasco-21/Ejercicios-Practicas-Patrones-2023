package practicaPrimerParcial.ejercicio7;

import java.util.Stack;

public class StackIterator implements Iterator{
    private Stack<Empleado> empleados = new Stack<>();

    public StackIterator(Stack<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        return this.empleados.pop();
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return this.empleados.size() != 0;
    }
}
