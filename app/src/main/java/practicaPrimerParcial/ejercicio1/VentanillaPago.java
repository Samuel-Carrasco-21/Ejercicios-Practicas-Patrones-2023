package practicaPrimerParcial.ejercicio1;

public class VentanillaPago {
    private static VentanillaPago instance = null;
    private int dineroVentanilla;
    private int numeroUsos;
    private int codigoCajero;
    private String[] estudiantes;
    private int[] codigoEstudiante;

    private VentanillaPago(){
        dineroVentanilla = 0;
        numeroUsos = 0;
        codigoCajero = 0;
        estudiantes = new String[200];
        codigoEstudiante = new int[200];
    }

    private synchronized static void create(){
        if (instance == null)
            System.out.println("-- ABRIENDO VENTANILLA ---");
            instance = new VentanillaPago();
    }

    public static VentanillaPago getInstance(){
        if (instance == null)
            create();
        return instance;
    }

    public void pagarMatricula(int monto, String nombreEstudiante, 
    int codEstudiante){
        if(codigoCajero!=0){
            if(monto>=750){
                if(numeroUsos<200){
                    dineroVentanilla+=monto;
                    estudiantes[numeroUsos] = nombreEstudiante;
                    codigoEstudiante[numeroUsos] = codEstudiante;
                    numeroUsos++;
                    System.out.println("Pago exitoso");
                    System.out.println("De: "+nombreEstudiante);
                    System.out.println("Codigo Estudiante: "+codEstudiante);
                }else{
                    System.out.println("NO ES POSIBLE REALIZAR MAS DEPOSITOS");
                }
            }else{
                System.out.println("No es posible realizar el pago"
                +" de la matricula");
                System.out.println("De: "+nombreEstudiante);
                System.out.println("Codigo Estudiante: "+codEstudiante);
            }
        }else{
            System.out.println("Se debe asignar un cajero");
        }
        
    }
    
    public void establecerCajero(int codigo){
        this.codigoCajero = codigo;
        System.out.println("Cajero establecido");
    }

    public void estadoVentanilla(){
        System.out.println("--------------------");
        System.out.println("Dinero en Ventanilla: "+dineroVentanilla);
        System.out.println("Numero de usos Ventanilla: "+numeroUsos);
        System.out.println("Codigo del Cajero: "+codigoCajero);
        System.out.println("Estudiantes que pagaron:");
        if(numeroUsos==0){
            System.out.println("NINGUN ESTUDIANTE REALIZO UN PAGO");
        }else{
            for(int i=0;i<numeroUsos;i++){
                System.out.println(
                    "* "+estudiantes[i]+" - "+codigoEstudiante[i]);
            }
        }
        System.out.println("--------------------");
    }

}
