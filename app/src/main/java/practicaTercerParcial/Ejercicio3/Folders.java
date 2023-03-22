package practicaTercerParcial.Ejercicio3;

import java.util.Vector;

public class Folders extends ArchivoBase{
    private int cantidadPalabrasFolder;
    public int getCantidadPalabrasFolder() {
        return cantidadPalabrasFolder;
    }

    private Vector<ArchivoBase> vectorArchivos = new Vector<>();

    public Folders(String nombre) {
        super(nombre);
    }

    @Override
    public void operation() {
        System.out.println("<><><> FOLDER <><><>");
        System.out.println("* Nombre: "+getNombre());
        System.out.println("* Cantidad Palabras Folder: "+cantidadPalabrasFolder);
        System.out.println("* Archivos:");
        vectorArchivos.forEach(i->i.operation());
    }

    @Override
    public void add(ArchivoBase archivoBase) {
        System.out.println("--- AGREGANDO ARCHIVO ---");
        vectorArchivos.add(archivoBase);
        this.cantidadPalabrasFolder += archivoBase.getCantidadPalabras();
    }

    @Override
    public void remove(ArchivoBase archivoBase) {
        System.out.println("--- BORRANDO ARCHIVO ---");
        vectorArchivos.remove(archivoBase);
        this.cantidadPalabrasFolder -= archivoBase.getCantidadPalabras();
    }

    @Override
    public ArchivoBase get(int position) {
        System.out.println("--- OBTENIENDO ARCHIVO ---");
        return vectorArchivos.get(position);
    }
    
}
