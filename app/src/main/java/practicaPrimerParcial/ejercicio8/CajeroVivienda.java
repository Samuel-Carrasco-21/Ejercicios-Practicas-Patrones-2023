package practicaPrimerParcial.ejercicio8;

public class CajeroVivienda {
    private Cliente cliente;
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CajeroVivienda(Cliente cliente){
        this.cliente = cliente;
    }

    public void realizarPrestamo(int dinero){
        CuentaFondos.getInstance()
        .retirarDinero(dinero, "Cajero Vivienda", cliente.getName());
    }
}
