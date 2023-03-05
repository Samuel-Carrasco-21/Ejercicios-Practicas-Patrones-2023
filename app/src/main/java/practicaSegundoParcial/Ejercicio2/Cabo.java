package practicaSegundoParcial.Ejercicio2;

public class Cabo implements IHandler{
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
        if(orden.toLowerCase().equals("limpiezas")){
            System.out.println("\n--- Solicitud Aprobada---");
            System.out.println("Orden: "+orden);
            System.out.println("Orden atendida por el Cabo");
        }else{
            System.out.println("\n--- Solicitud Invalida ---");
        }
    }
    
}
