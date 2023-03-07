package practicaSegundoParcial.Ejercicio7;

import java.util.Scanner;

public class Prestamo {
    private static int dineroDisponible;
    private static Prestamo prestamo;
    private static int auxPrestamo = 0;
    private static int porcentajePaga = 100;
    private static HandlerManager handlerManager = new HandlerManager();

    public int getDineroDisponible() {
        return dineroDisponible;
    }

    private Prestamo(){
        this.dineroDisponible = 10000;
    }

    private synchronized static void createPrestamo(){
        if (prestamo == null){
            prestamo = new Prestamo();
        }
    }

    public static Prestamo getInstance(){
        if(prestamo == null){
            createPrestamo();
        }
        return prestamo;
    }

    public int obtenerPrestamo(int amount, Cliente cliente){
        if(amount<=dineroDisponible && porcentajePaga>=100){
            System.out.println("--- PRESTAMO HECHO ---");
            System.out.println("* Dinero Obtenido: "+amount);
            dineroDisponible-=amount;
            System.out.println(
                "* Dinero Disponible de Prestamistas: "+dineroDisponible);
            System.out.println("* A nombre de:");
            cliente.showInfo(); 
            auxPrestamo = amount;
            porcentajePaga=0;
            return amount;
        }else{
            System.out.println("--- OPERACION INACEPTABLE ---");
            return 0;
        }
    }

    public static void pagarPrestamo(int dinero, Cliente cliente){
        if(porcentajePaga<100){
            System.out.println("\n--- Pago en proceso ---");
            float porcentaje = ((float)(dinero)/(float)(auxPrestamo)) * (float)100;
            porcentajePaga += (int)porcentaje;
            handlerManager.montoEconomico(porcentajePaga,cliente);
        }else{
            System.out.println("--- OPERACION INACEPTABLE ---");
        }
    }

    public static void refinanciarPrestamo(){
        System.out.println("Desea refinanciar su Prestamo?");
        String respuesta = pedirDato("la respuesta (si/no)");
        if(respuesta.equals("si")){
            System.out.println("--- Prestamo Refinanciado ---");
        }else{
            System.out.println("--- Oferta Rechazada ---");
        }
    }

    public static void ofrecerPrestamo(){
        System.out.println("Desea tomar nuevos prestamos a futuro?");
        String respuesta = pedirDato("la respuesta (si/no)");
        if(respuesta.equals("si")){
            System.out.println("--- Oferta Tomada ---");
        }else{
            System.out.println("--- Oferta Rechazada ---");
        }
    }

    public static String pedirDato(String dato){
        System.out.print("Digite el dato para "+dato.toLowerCase()+": ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        return input;
    }
}
