package practicaPrimerParcial.ejercicio8;

public class CajeroCreditos {
    private Cliente cliente;
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CajeroCreditos(Cliente cliente){
        this.cliente = cliente;
    }

    public void realizarPrestamo(int dinero){
        CuentaFondos.getInstance()
        .retirarDinero(dinero, "Cajero Creditos", cliente.getName());
    }
}
