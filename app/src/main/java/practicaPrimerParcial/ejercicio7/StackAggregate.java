package practicaPrimerParcial.ejercicio7;

import java.util.Stack;

public class StackAggregate implements IAggregate{

    private Stack<Empleado> empleados = new Stack<>();

    public StackAggregate(){
        empleados = new Stack<Empleado>();
    }

    public void addEmpleado(Empleado empleado){
        empleados.addElement(empleado);
    }

    public Stack<Empleado> getEmpleados(){
        return empleados;
    }

    @Override
    public Iterator createIterator() {
        return new StackIterator(this.empleados);
    }
    
}
