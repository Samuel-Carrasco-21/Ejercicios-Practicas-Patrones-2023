package practicaSegundoParcial.Ejercicio2;

public class Militar implements IHandler{
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
        System.out.println("\n--- SISTEMA MILITAR ---");

        General general = new General();
        this.setNext(general);

        Teniente teniente = new Teniente();
        general.setNext(teniente);

        Coronel coronel = new Coronel();
        teniente.setNext(coronel);

        Cabo cabo = new Cabo();
        coronel.setNext(cabo);

        this.next.ordenMilitar(orden);
    }
    
}
