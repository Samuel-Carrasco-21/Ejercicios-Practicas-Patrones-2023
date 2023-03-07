package practicaSegundoParcial.Ejercicio7;

public class Cajero implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void montoEconomico(int amount, Cliente cliente) {
        if(amount<25){
            System.out.println("--- Pago Exitoso ---");
            System.out.println("* Pago recibido por el Cajero");
        }else{
            System.out.println("--- Operacion no disponible ---");
            System.out.println
            ("Se transferira la operacion...");
            next.montoEconomico(amount,cliente);
        }
    }
}
