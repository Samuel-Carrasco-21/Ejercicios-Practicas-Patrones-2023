package practicaTercerParcial.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        personaje.setNombre("Jose - 1");
        personaje.info();
        
        Espada espada = new Espada(personaje);
        Hacha hacha = new Hacha(personaje);
        Escopeta escopeta = new Escopeta(personaje);

        Escudo escudo = new Escudo(personaje);
        escudo.setColor("azul");
        escudo.setModeloEscudo("acero azul");

        PosionCuracion posionCuracion = new PosionCuracion(personaje);
        posionCuracion.setClanDeOrigen("escoses");
        
        personaje.agregarAccesorioPersonaje(espada);
        personaje.agregarAccesorioPersonaje(hacha);
        personaje.agregarAccesorioPersonaje(escopeta);
        personaje.agregarAccesorioPersonaje(escudo);
        personaje.agregarAccesorioPersonaje(posionCuracion);

        personaje.info();

    }
}
