package practicaTercerParcial.Ejercicio3;

import java.util.Vector;

public class UnidadDisco extends ArchivoBase{
    private int cantidadPalabrasDisco;

    private Vector<Folders> vectorFolders = new Vector<>();

    public UnidadDisco(String nombre) {
        super(nombre);
    }

    @Override
    public void operation() {
        System.out.println("\n<><><><><><><><><><><><><><><><><>");
        System.out.println("+++ UNIDAD DISCO +++");
        System.out.println("* Nombre: "+getNombre());
        System.out.println("* Cantidad Palabras Disco: "+cantidadPalabrasDisco);
        System.out.println("* Folders:");
        vectorFolders.forEach(i->i.operation());
        System.out.println("<><><><><><><><><><><><><><><><><>");
    }

    @Override
    public void add(ArchivoBase archivoBase) {
        System.out.println("<><><> AGREGANDO FOLDER <><><>");
        Folders folders;
        folders = (Folders) archivoBase;
        vectorFolders.add(folders);
        cantidadPalabrasDisco += folders.getCantidadPalabrasFolder();
        
    }

    @Override
    public void remove(ArchivoBase archivoBase) {
        System.out.println("<><><> BORRANDO FOLDER <><><>");
        Folders folders;
        folders = (Folders) archivoBase;
        vectorFolders.remove(folders);
        cantidadPalabrasDisco -= folders.getCantidadPalabrasFolder();
    }

    @Override
    public ArchivoBase get(int position) {
        System.out.println("<><><> OBTENIENTO FOLDER <><><>");
        return vectorFolders.get(position);
    }
    
}
