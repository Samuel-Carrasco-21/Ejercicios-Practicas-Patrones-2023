package practicaTercerParcial.Ejercicio3;

public class Archivo extends ArchivoBase{

    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public void operation() {
        System.out.println("--- ARCHIVO ---");
        System.out.println("* Nombre: "+getNombre());
        System.out.println("* Texto:");
        System.out.println(getTexto());
        System.out.println("* Cantidad Palabras: "+getCantidadPalabras());
    }

    @Override
    public void add(ArchivoBase archivoBase) {
        System.out.println("--- COMANDO INACEPTABLE ---");
    }

    @Override
    public void remove(ArchivoBase archivoBase) {
        System.out.println("--- COMANDO INACEPTABLE ---");
    }

    @Override
    public ArchivoBase get(int position) {
        System.out.println("--- COMANDO INACEPTABLE ---");
        return null;
    }
    
}
