package practicaPrimerParcial.ejercicio7;

public class Main {
    public static void main(String[] args) {
        String msg = "private Vector<Empleado> empleados;";
        Evaluador evaluador = new Evaluador(msg);
        System.out.println("\nORIGINAL:\n"+msg);
        System.out.println("\nRESULTADO:\n"+evaluador.evaluateCadena());
    }
}
