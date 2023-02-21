package practicaPrimerParcial.ejercicio3;

public class KitEscolarCreator extends CreatorKit{

    @Override
    public KitEscolar create() {
        // mochila (numero bolsillos, tamaño), 
        // deportivo (talla, color, número de prendas), 
        // cuadernos(tipo, #hojas)
        KitEscolar kitEscolar = new KitEscolar();

        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(5);
        mochila.setTamano(40);

        Deportivo deportivo = new Deportivo();
        deportivo.setTalla(30);
        deportivo.setColor("Azul");
        deportivo.setNumeroPrendas(12);

        Cuadernos cuadernos = new Cuadernos();
        cuadernos.setTipo("Anillado");
        cuadernos.setNumeroHojas(100);

        kitEscolar.setMochila(mochila);
        kitEscolar.setDeportivo(deportivo);
        kitEscolar.setCuadernos(cuadernos);

        kitEscolar.prepararKit();
        return kitEscolar;
    }
    
}
