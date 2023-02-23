package practicaPrimerParcial.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class ListAggregate implements IAggregate{

    private List<Empleado> empleados = new ArrayList<>();

    public ListAggregate(){
        empleados = new ArrayList<Empleado>();
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados(){
        return empleados;
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this.empleados);
    }
    
}
