package practicaPrimerParcial.ejercicio7;

import java.util.Vector;

public class VectorAggregate implements IAggregate{
    private Vector<Empleado> empleados = new Vector<>();

    public VectorAggregate(){
        empleados = new Vector<Empleado>();
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public Vector<Empleado> getEmpleados(){
        return empleados;
    }

    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return new VectorIterator(this.empleados);
    }


}
