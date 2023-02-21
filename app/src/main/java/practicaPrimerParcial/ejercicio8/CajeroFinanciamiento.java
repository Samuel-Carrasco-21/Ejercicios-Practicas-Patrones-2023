package practicaPrimerParcial.ejercicio8;

public class CajeroFinanciamiento {
    private Cliente cliente;
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CajeroFinanciamiento(Cliente cliente){
        this.cliente = cliente;
    }

    public void realizarPrestamo(int dinero){
        CuentaFondos.getInstance()
        .retirarDinero(dinero, "Cajero Financiamiento", cliente.getName());
    }
}
