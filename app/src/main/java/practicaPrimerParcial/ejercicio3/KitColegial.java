package practicaPrimerParcial.ejercicio3;

public class KitColegial implements IKit{
    // mochila(numero bolsillos,tamano), 
    // libros(tipo, autor), 
    // computadora(marca, os)
    private Mochila mochila = new Mochila();
    public Mochila getMochila() {
        return mochila;
    }
    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }
    
    private Libros libros = new Libros();
    public Libros getLibros() {
        return libros;
    }
    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    private Computadora computadora = new Computadora();
    public Computadora getComputadora() {
        return computadora;
    }
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    @Override
    public void prepararKit() {
        System.out.println("--- Preparando Kit Colegial ---");
        
    }

    @Override
    public void showKit() {
        System.out.println("\n--- KIT COLEGIAL ---");
        mochila.showMochila();
        libros.showLibros();
        computadora.showComputadora();
    }


    
}
