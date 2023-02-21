package practicaPrimerParcial.ejercicio3;

public class KitColegialCreator extends CreatorKit{

    @Override
    public KitColegial create() {
        // mochila (numero bolsillos, tamaño),
        // libros(tipo, autor), 
        // computadora(marca, os)W
        KitColegial kitColegial = new KitColegial();
        
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(7);
        mochila.setTamano(60);

        Libros libros = new Libros();
        libros.setTipo("Educativo");
        libros.setAutor("Alan Turing");

        Computadora computadora = new Computadora();
        computadora.setMarca("HP");
        computadora.setOs("Windows");

        kitColegial.setMochila(mochila);
        kitColegial.setLibros(libros);
        kitColegial.setComputadora(computadora);

        kitColegial.prepararKit();
        return kitColegial;
    }
    
}
