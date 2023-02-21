package practicaPrimerParcial.ejercicio3;

public class Computadora {
    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String os;
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public void showComputadora(){
        System.out.println("Computadora:");
        System.out.println("* marca: "+getMarca());
        System.out.println("* os: "+getOs());
    }
}
