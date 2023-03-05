package practicaSegundoParcial.Ejercicio3;

import java.util.Vector;

public class Tienda {
    private int cantidadCelulares;
    public int getCantidadCelulares() {
        return cantidadCelulares;
    }
    public void setCantidadCelulares(int cantidadCelulares) {
        this.cantidadCelulares = cantidadCelulares;
    }

    private Vector<Celulares> tienda;
    public Vector<Celulares> getTienda() {
        return tienda;
    }
    public void setTienda(Vector<Celulares> tienda) {
        this.tienda = tienda;
    }

    private String descripcion;
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private IStrategy strategy;
    public IStrategy getStrategy() {
        return strategy;
    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int value, String tipoBusqueda
    , String modelo, int precio){
        if(cantidadCelulares>value){
            setStrategy(new MergeSort(tipoBusqueda,modelo,precio));
        }else{
            setStrategy(new BubbleSort(tipoBusqueda,modelo,precio));
        }
        this.strategy.execute(this);    
    }
    
}
