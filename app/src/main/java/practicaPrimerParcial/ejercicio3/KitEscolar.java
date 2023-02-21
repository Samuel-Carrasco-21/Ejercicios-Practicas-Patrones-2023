package practicaPrimerParcial.ejercicio3;

public class KitEscolar implements IKit{
    private Mochila mochila = new Mochila();
    public Mochila getMochila() {
        return mochila;
    }
    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }
    
    private Deportivo deportivo = new Deportivo();
    public Deportivo getDeportivo() {
        return deportivo;
    }
    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    private Cuadernos cuadernos = new Cuadernos();
    public Cuadernos getCuadernos() {
        return cuadernos;
    }
    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }

    @Override
    public void prepararKit() {
        System.out.println("--- Preparando Kit Escolar ---");
    }
    
    @Override
    public void showKit() {
        System.out.println("\n--- KIT ESCOLAR ---");
        mochila.showMochila();
        deportivo.showDeportivo();
        cuadernos.showCuadernos();
    }

    
}
