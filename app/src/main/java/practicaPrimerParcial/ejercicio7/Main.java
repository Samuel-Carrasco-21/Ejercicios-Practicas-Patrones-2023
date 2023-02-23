package practicaPrimerParcial.ejercicio7;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Empleado> empleadosFinales = new HashMap<>();

        ListAggregate listAggregate = new ListAggregate();
        listAggregate.addEmpleado(new Empleado("Empleado 1", 1939));
        listAggregate.addEmpleado(new Empleado("Empleado 2", 2939));
        listAggregate.addEmpleado(new Empleado("Empleado 3", 3939));

        StackAggregate stackAggregate = new StackAggregate();
        stackAggregate.addEmpleado(new Empleado("Empleado 4", 4939));
        stackAggregate.addEmpleado(new Empleado("Empleado 5", 5939));
        stackAggregate.addEmpleado(new Empleado("Empleado 6", 6939));

        VectorAggregate vectorAggregate = new VectorAggregate();
        vectorAggregate.addEmpleado(new Empleado("Empleado 7", 7939));
        vectorAggregate.addEmpleado(new Empleado("Empleado 8", 8939));
        vectorAggregate.addEmpleado(new Empleado("Empleado 9", 9939));

        ArrayAggregate arrayAggregate = new ArrayAggregate();
        arrayAggregate.addEmpleado(new Empleado("Empleado 10", 10939));
        arrayAggregate.addEmpleado(new Empleado("Empleado 11", 11939));
        arrayAggregate.addEmpleado(new Empleado("Empleado 12", 12939));

        Iterator iterator;

        iterator = listAggregate.createIterator();
        while(iterator.hasNext()){
            Empleado aux = (Empleado) iterator.next();
            empleadosFinales.put(aux.getCodigo(),aux);
        }

        iterator = stackAggregate.createIterator();
        while(iterator.hasNext()){
            Empleado aux = (Empleado) iterator.next();
            empleadosFinales.put(aux.getCodigo(),aux);
        }

        iterator = vectorAggregate.createIterator();
        while(iterator.hasNext()){
            Empleado aux = (Empleado) iterator.next();
            empleadosFinales.put(aux.getCodigo(),aux);
        }

        iterator = arrayAggregate.createIterator();
        while(iterator.hasNext()){
            Empleado aux = (Empleado) iterator.next();
            empleadosFinales.put(aux.getCodigo(),aux);
        }

        System.out.println("EMPLEADOS FINALES:\n------");
        empleadosFinales.entrySet().forEach(entry -> {
            System.out.println("* Nombre: "+entry.getValue().getName());
            System.out.println("* Codigo: "+entry.getValue().getCodigo());
            System.out.println("------");
        });

    }
}
