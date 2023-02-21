package practicaPrimerParcial.ejercicio3;

public class Main {
    public static void main(String[] args) {
        KitColegial k1 = new KitColegialCreator().create();
        KitColegial k2 = new KitColegialCreator().create();

        KitEscolar k3 = new KitEscolarCreator().create();
        KitEscolar k4 = new KitEscolarCreator().create();

        k1.showKit();
        k2.showKit();
        k3.showKit();
        k4.showKit();
    }
}
