package practicaSegundoParcial.Ejercicio3;

import java.util.Collection;
import java.util.Vector;

public class MergeSort implements IStrategy{
    private String tipoBusqueda;
    public String getTipoBusqueda() {
        return tipoBusqueda;
    }
    public void setTipoBusqueda(String tipoBusqueda) {
        this.tipoBusqueda = tipoBusqueda;
    }

    private String modelo;
    private int precio;

    public MergeSort(String tipoBusqueda, String modelo, int precio) {
        this.tipoBusqueda = tipoBusqueda;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void merge(Vector<Celulares> vector,
        int left,
        int middle, 
        int right){

        int leftVectorSize = middle - left + 1;
        int rightVectorSize = right - middle;

        Vector<Celulares> leftVector = new Vector<>();
        Vector<Celulares> rightVector = new Vector<>();

        for(int i=0;i<leftVectorSize;i++){
            leftVector.add(vector.get(left+i));
        }

        for(int j=0;j<rightVectorSize;j++){
            rightVector.add(vector.get(j + middle + 1));
        }

        int i = 0;
        int j = 0;

        int k = left;
        while(i < leftVectorSize && j < rightVectorSize){
            if(leftVector.get(i).getPrecio() <= rightVector.get(j).getPrecio()){
                vector.set(k, leftVector.get(i));
                i++;
            }else{
                vector.set(k, rightVector.get(j));
                j++;
            }
            k++;
        }

        while(i<leftVectorSize){
            vector.set(k, leftVector.get(i));
            i++;
            k++;
        }

        while(j<rightVectorSize){
            vector.set(k, rightVector.get(j));
            j++;
            k++;
        }

    }

    public Vector<Celulares> mergeSort(Vector<Celulares> vector,
    int left,
    int right){
        if(left < right){
            int middle = (left + (right - 1))/2;

            mergeSort(vector, left, middle);
            mergeSort(vector, middle+1, right);

            merge(vector,left,middle,right);
        }
        return vector;
    }

    @Override
    public void execute(Tienda tienda) {
        System.out.println("\n--- MERGE-SORT ---");
        if(tipoBusqueda.toLowerCase().equals("precio") ||
        tipoBusqueda.toLowerCase().equals("precio - modelo")){

            final Vector<Celulares> vector = new Vector<>();
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
            Vector<Celulares> aux = mergeSort(vector,0,vector.size()-1);

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
