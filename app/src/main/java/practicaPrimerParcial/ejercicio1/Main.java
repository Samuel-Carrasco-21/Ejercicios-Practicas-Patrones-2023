package practicaPrimerParcial.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Jose",19472);
        Estudiante e2 = new Estudiante("Manuel",10957);
        Estudiante e3 = new Estudiante("Michael",34917);
        Estudiante e4 = new Estudiante("Adrian",17503);
        Estudiante e5 = new Estudiante("Logan",18503);

        Cajero cajero = new Cajero("Bryan", 29471);

        VentanillaPago.getInstance().establecerCajero(cajero.getCodigo());

        e1.pagarMatricula(1000);
        e2.pagarMatricula(2931);
        e3.pagarMatricula(190);
        e4.pagarMatricula(2990);
        e5.pagarMatricula(100);

        VentanillaPago.getInstance().estadoVentanilla();
    }
}
