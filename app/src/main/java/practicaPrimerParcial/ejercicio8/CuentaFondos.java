package practicaPrimerParcial.ejercicio8;

public class CuentaFondos {
    private static CuentaFondos cuentaFondos = null;
    private int dineroDisponible;

    private CuentaFondos(){
        dineroDisponible = 10000000;   
    }

    private synchronized static void create(){
        if (cuentaFondos == null)
            cuentaFondos = new CuentaFondos();
    }
    public static CuentaFondos getInstance(){
        if (cuentaFondos == null)
            create();
        return cuentaFondos;
    }

    public synchronized void retirarDinero(int amount, String tipoCajero, String nombreCliente){
        if (amount <= dineroDisponible && amount>0){
            dineroDisponible-=amount;
            System.out.println("Dinero Retirado de: "+tipoCajero);
            System.out.println("Cantidad Disponible: "+dineroDisponible);
            System.out.println("A nombre de: "+nombreCliente+"\n");
        }else{
            System.out.println("NO ES POSIBLE RETIRAR UNA CANTIDAD INEXISTENTE\n");
        }
    }

    public void showEstado(){
        System.out.println("DINERO ACTUAL:\n"+dineroDisponible);
    }
}
