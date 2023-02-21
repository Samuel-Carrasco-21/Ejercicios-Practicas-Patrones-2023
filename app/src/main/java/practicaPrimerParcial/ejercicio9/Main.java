package practicaPrimerParcial.ejercicio9;

public class Main {
    public static void main(String[] args) {
        String msg = "1 2 3 4 2 2 6 10 7 4 5 6 9 10 7 8";
        Evaluador evaluador = new Evaluador(msg);
        System.out.println("TEXTO ORIGINAL: "+msg+"\n");
        System.out.println("TEXTO FINAL: "+evaluador.evaluarNumeros());
    }
}
