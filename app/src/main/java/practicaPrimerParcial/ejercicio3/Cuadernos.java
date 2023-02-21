package practicaPrimerParcial.ejercicio3;

public class Cuadernos {
    private String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private int numeroHojas;
    public int getNumeroHojas() {
        return numeroHojas;
    }
    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public void showCuadernos(){
        System.out.println("Cuadernos:");
        System.out.println("* tipo: "+getTipo());
        System.out.println("* numero hojas: "+getNumeroHojas());
    }
}
