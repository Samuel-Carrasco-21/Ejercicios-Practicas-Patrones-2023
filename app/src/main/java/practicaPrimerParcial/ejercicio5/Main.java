package practicaPrimerParcial.ejercicio5;

public class Main {
    public static void main(String[] args) {
        String bife = "bife";
        String lomito = "lomito";
        String tira = "tira";

        Bife p1 = (Bife) FactoryPlatoParrilla.make(bife);
        Lomito p2 = (Lomito) FactoryPlatoParrilla.make(lomito);
        Tira p3 = (Tira) FactoryPlatoParrilla.make(tira);

        p1.showPlatillo();
        p2.showPlatillo();
        p3.showPlatillo();
    }
}
