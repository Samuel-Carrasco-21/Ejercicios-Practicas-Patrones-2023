package practicaPrimerParcial.ejercicio3;

public class Deportivo {
    private int talla;
    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    private int numeroPrendas;
    public int getNumeroPrendas() {
        return numeroPrendas;
    }
    public void setNumeroPrendas(int numeroPrendas) {
        this.numeroPrendas = numeroPrendas;
    }

    public void showDeportivo(){
        System.out.println("Deportivo:");
        System.out.println("* talla: "+getTalla());
        System.out.println("* color: "+getColor());
        System.out.println("* numero prendas: "+getNumeroPrendas());
    }
}
