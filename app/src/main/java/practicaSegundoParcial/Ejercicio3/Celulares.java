package practicaSegundoParcial.Ejercicio3;

public class Celulares {
    private String modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String gama;
    public String getGama() {
        return gama;
    }
    public void setGama(String gama) {
        this.gama = gama;
    }

    private int precio;
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Celulares(String modelo, String marca, String gama, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
    }

    public void showInfo(){
        System.out.println("--- CELULAR ---");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Gama: "+gama);
        System.out.println("Precio: "+precio);
    }
}
