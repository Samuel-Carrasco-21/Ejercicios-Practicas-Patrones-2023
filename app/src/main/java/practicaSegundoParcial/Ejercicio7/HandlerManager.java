package practicaSegundoParcial.Ejercicio7;

public class HandlerManager implements IHandler{
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
        Cajero cajero = new Cajero();
        this.setNext(cajero);

        AgenteCredito agenteCredito = new AgenteCredito();
        cajero.setNext(agenteCredito);

        Supervisor supervisor = new Supervisor();
        agenteCredito.setNext(supervisor);

        EncargadoPrestamos encargadoPrestamos = new EncargadoPrestamos();
        supervisor.setNext(encargadoPrestamos);

        this.next.montoEconomico(amount,cliente);
    }
    
}
