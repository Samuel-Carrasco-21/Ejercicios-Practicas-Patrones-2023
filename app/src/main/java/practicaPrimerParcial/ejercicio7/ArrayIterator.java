package practicaPrimerParcial.ejercicio7;

public class ArrayIterator implements Iterator{
    private Empleado[] empleados;
    private int position = 0;
    public ArrayIterator(Empleado[] empleados) {
        this.empleados = empleados;
    }
    @Override
    public Object next() {
        // TODO Auto-generated method stub
        return this.empleados[position++];
    }
    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return this.empleados.length != 0 && this.empleados[position]!=null;
    }
    
}
