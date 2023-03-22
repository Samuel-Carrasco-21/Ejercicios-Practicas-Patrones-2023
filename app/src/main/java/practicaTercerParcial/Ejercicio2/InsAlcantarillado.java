package practicaTercerParcial.Ejercicio2;

public class InsAlcantarillado implements IInstalacion{
    private double cantidadTubos;
    public double getCantidadTubos() {
        return cantidadTubos;
    }
    public void setCantidadTubos(double cantidadTubos) {
        this.cantidadTubos = cantidadTubos;
    }

    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    private double precio;

    private ITransferencia transferencia;
    public ITransferencia getTransferencia() {
        return transferencia;
    }
    public void setTransferencia(ITransferencia transferencia) {
        this.transferencia = transferencia;
    }

    public InsAlcantarillado(double cantidadTubos, String marca, double precio, ITransferencia transferencia) {
        this.cantidadTubos = cantidadTubos;
        this.marca = marca;
        this.precio = precio;
        this.transferencia = transferencia;
    }

    @Override
    public void showInstalacion() {
        System.out.println("\n--- Instalacion ---");
        System.out.println("* Tipo Instalacion: Alcantarillado");
        System.out.println("* Cantidad Tubos: "+cantidadTubos);
        System.out.println("* Marca: "+marca);
        System.out.println("* Transferencia: "+transferencia);
        System.out.println("* Precio: "+precio);
        infoTransferencia();
    }

    @Override
    public void infoTransferencia() {
        this.transferencia.showTransferencia();
    }

    @Override
    public void aplicarDescuento() {
        this.precio = this.precio * transferencia.obtenerDescuento();
        System.out.println("--- Nuevo Precio ---");
        System.out.println("-->> "+precio);
    }
    
}
