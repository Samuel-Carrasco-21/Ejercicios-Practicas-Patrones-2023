package practicaPrimerParcial.ejercicio3;

public class Libros {
    private String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String autor;
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void showLibros(){
        System.out.println("Libros:");
        System.out.println("* tipo: "+getTipo());
        System.out.println("* autor: "+getAutor());
    }
}
