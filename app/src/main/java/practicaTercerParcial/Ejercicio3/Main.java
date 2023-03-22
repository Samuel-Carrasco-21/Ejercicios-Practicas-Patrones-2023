package practicaTercerParcial.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Archivo a1 = new Archivo("Archivo - 1");
        Archivo a2 = new Archivo("Archivo - 2");

        Archivo a3 = new Archivo("Archivo - 3");
        Archivo a4 = new Archivo("Archivo - 4");

        Folders f1 = new Folders("Folder - 1");
        Folders f2 = new Folders("Folder - 2");

        UnidadDisco u1 = new UnidadDisco("Unidad Disco - 1");

        ///////////////////////////////

        a1.setTexto("Hola mundo");
        a2.setTexto("Para lelo gramo");
        a3.setTexto("Java y C++ funcionan");
        a4.setTexto("Python");

        f1.add(a1);
        f1.add(a2);

        f2.add(a3);
        f2.add(a4);

        u1.add(f1);
        u1.add(f2);

        u1.operation();
    }
}
