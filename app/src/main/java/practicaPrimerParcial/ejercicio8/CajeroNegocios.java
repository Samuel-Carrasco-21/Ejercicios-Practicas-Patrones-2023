package practicaPrimerParcial.ejercicio8;

public class CajeroNegocios {
    private Cliente cliente;
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CajeroNegocios(Cliente cliente){
        this.cliente = cliente;
    }

    public void realizarPrestamo(int dinero){
        CuentaFondos.getInstance()
        .retirarDinero(dinero, "Cajero Negocios", cliente.getName());
    }
}
