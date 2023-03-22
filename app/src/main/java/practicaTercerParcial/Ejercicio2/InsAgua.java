package practicaTercerParcial.Ejercicio2;

public class InsAgua implements IInstalacion{
    private double numeroTanquesAgua;
    public double getNumeroTanquesAgua() {
        return numeroTanquesAgua;
    }
    public void setNumeroTanquesAgua(double numeroTanquesAgua) {
        this.numeroTanquesAgua = numeroTanquesAgua;
    }

    private double precio;

    private ITransferencia transferencia;
    public ITransferencia getTransferencia() {
        return transferencia;
    }
    public void setTransferencia(ITransferencia transferencia) {
        this.transferencia = transferencia;
    }

    public InsAgua(double numeroTanquesAgua, double precio, ITransferencia transferencia) {
        this.numeroTanquesAgua = numeroTanquesAgua;
        this.precio = precio;
        this.transferencia = transferencia;
    }

    @Override
    public void showInstalacion() {
        System.out.println("\n--- Instalacion ---");
        System.out.println("* Numero Tanques Agua: "+numeroTanquesAgua);
        System.out.println("* Precio: "+precio);
        System.out.println("* Transferencia: "+transferencia);
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
