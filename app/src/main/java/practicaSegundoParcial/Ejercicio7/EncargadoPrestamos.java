package practicaSegundoParcial.Ejercicio7;

public class EncargadoPrestamos implements IHandler{
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
        if(amount==100){
            System.out.println("--- Pago Exitoso ---");
            System.out.println("* Pago recibido por el Encargado de Prestamos");
            System.out.println("* Devolviendo los papeles de:");
            cliente.showInfo();
        }else{
            System.out.println("--- Operacion no disponible ---");
        }
    }
}
