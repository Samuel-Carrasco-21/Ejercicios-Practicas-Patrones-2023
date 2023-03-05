package practicaSegundoParcial.Ejercicio2;

public class General implements IHandler{
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
        if(orden.toLowerCase().equals("entrevistas")){
            System.out.println("\n--- Solicitud Aprobada---");
            System.out.println("Orden: "+orden);
            System.out.println("Orden atendida por el General");
        }else{
            System.out.println("\n--- Solicitud Invalida ---");
            System.out.println("Orden transferida...");
            next.ordenMilitar(orden);
        }
    }
    
}
