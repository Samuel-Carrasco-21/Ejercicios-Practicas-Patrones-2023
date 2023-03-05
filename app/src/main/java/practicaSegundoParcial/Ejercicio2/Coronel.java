package practicaSegundoParcial.Ejercicio2;

public class Coronel implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler iHandler) {
        next = iHandler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void ordenMilitar(String orden) {
        if(orden.toLowerCase().equals("desbloqueos") ||
        orden.toLowerCase().equals("manifestaciones")){
            System.out.println("\n--- Solicitud Aprobada---");
            System.out.println("Orden: "+orden);
            System.out.println("Orden atendida por el Coronel");
        }else{
            System.out.println("\n--- Solicitud Invalida ---");
            System.out.println("Orden transferida...");
            next.ordenMilitar(orden);
        }
    }
    
}
