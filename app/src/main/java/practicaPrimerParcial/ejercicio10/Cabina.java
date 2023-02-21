package practicaPrimerParcial.ejercicio10;

import java.util.Vector;

public class Cabina {
    private static Cabina instance = null;
    private int peaje;
    private Vector<Vehiculo> vehiculos = new Vector<>();

    // constructor privado
    private Cabina(){
        System.out.println("--- ABRIENDO PEAJE ---");
    }

    private synchronized static void create(){
        if (instance == null)
            instance = new Cabina();
    }

    public static Cabina getInstance(){
        if (instance == null)
            create();
        return instance;
    }

    public void cobrarPeaje(int amount, Vehiculo vehiculo){
        if (amount>=5){
            peaje+=amount;
            System.out.println("** PEAJE PAGADO EXITOSAMENTE **");
            vehiculos.add(vehiculo);
        }else{
            System.out.println("** NO FUE POSIBLE REALIZAR EL COBRO **");
        }
    }

    public void controlPeaje(Administrador administrador){
        if(vehiculos.size()==0){
            System.out.println("\n<< NO HAY VEHICULOS REGISTRADOS >>");
        }else{
            System.out.println("\nMonto acumulado: "+peaje);
            System.out.println("Administrador: "+administrador.getName());
            System.out.println("<< AUTOS REGISTRADOS >>");
            for(int i=0;i<vehiculos.size();i++){
                vehiculos.get(i).showCoche();
            }
        }
    }
}
