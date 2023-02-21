package practicaPrimerParcial.ejercicio6;

public class Main {
    public static void main(String[] args) {
        String msg = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Evaluador evaluador = new Evaluador(msg);
        System.out.println("\nORIGINAL:\n"+msg);
        System.out.println("\nRESULTADO:\n"+evaluador.evaluateCadena());
    }
}
