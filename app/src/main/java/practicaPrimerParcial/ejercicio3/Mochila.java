package practicaPrimerParcial.ejercicio3;

public class Mochila {
    // mochila (numero bolsillos, tamaño)
    private int numeroBolsillos;
    public int getNumeroBolsillos() {
        return numeroBolsillos;
    }
    public void setNumeroBolsillos(int numeroBolsillos) {
        this.numeroBolsillos = numeroBolsillos;
    }

    private int tamano;
    public int getTamano() {
        return tamano;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void showMochila(){
        System.out.println("Mochila:");
        System.out.println("* numero bolsillos: "+getNumeroBolsillos());
        System.out.println("* tamano: "+getTamano()+"cm");
    }
}
