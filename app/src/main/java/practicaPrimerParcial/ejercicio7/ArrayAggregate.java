package practicaPrimerParcial.ejercicio7;

public class ArrayAggregate implements IAggregate{

    private Empleado[] empleados;
    private int position = 0;

    public ArrayAggregate(){
        empleados = new Empleado[100];
    }

    public void addEmpleado(Empleado empleado){
        empleados[position] = empleado;
        position++;
    }

    public Empleado[] getEmpleados(){
        return empleados;
    }

    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return new ArrayIterator(this.empleados);
    }
    
}
