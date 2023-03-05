package practicaSegundoParcial.Ejercicio3;

import java.util.Vector;

public class BubbleSort implements IStrategy{
    private String tipoBusqueda;
    public String getTipoBusqueda() {
        return tipoBusqueda;
    }
    public void setTipoBusqueda(String tipoBusqueda) {
        this.tipoBusqueda = tipoBusqueda;
    }

    private String modelo;
    private int precio;

    public BubbleSort(String tipoBusqueda, String modelo, int precio) {
        this.tipoBusqueda = tipoBusqueda;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Vector<Celulares> bubbleSort(Vector<Celulares> celulares){
        for(int i=0;i<celulares.size()-1;i++){
            for(int j=i;j<celulares.size();j++){
                if(celulares.get(i).getPrecio()>celulares.get(j).getPrecio()){
                    Celulares aux = celulares.get(i);
                    celulares.set(i, celulares.get(j));
                    celulares.set(j, aux);
                }
            }
        }
        return celulares;
    }

    @Override
    public void execute(Tienda tienda) {
        System.out.println("\n--- BUBBLE-SORT ---");
        if(tipoBusqueda.toLowerCase().equals("precio") ||
        tipoBusqueda.toLowerCase().equals("precio - modelo")){
            
            Vector<Celulares> vector = new Vector<>();
            if(tipoBusqueda.toLowerCase().equals("precio - modelo")){
                tienda.getTienda().stream()
                .filter(i-> i.getModelo().equals(modelo) && i.getPrecio()<=precio)
                .forEach(i->vector.add(i));
                System.out.println("\n--- PRECIO - MODELO ---");
            }else{
                tienda.getTienda().stream()
                .filter(i-> i.getPrecio()<=precio)
                .forEach(i->vector.add(i));
                System.out.println("\n--- PRECIO ---");
            }
            Vector<Celulares> aux = bubbleSort(vector);

            System.out.println("--- CELULARES DISPONIBLES ---");
            aux.forEach(i->i.showInfo());

        }else{
            System.out.println("\n--- MODELO ---");
            System.out.println("--- CELULARES DISPONIBLES ---");
            tienda.getTienda().stream().filter(i->i.getModelo().equals(modelo))
            .forEach(i->i.showInfo());
        }
    }

    
    
}
