package practicaTercerParcial.Ejercicio2;

public class InsElectrica implements IInstalacion{
    private String nombreEncargado;
    public String getNombreEncargado() {
        return nombreEncargado;
    }
    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }
    
    private double tiempoInstalacion;
    public double getTiempoInstalacion() {
        return tiempoInstalacion;
    }
    public void setTiempoInstalacion(double tiempoInstalacion) {
        this.tiempoInstalacion = tiempoInstalacion;
    }

    private double precio;

    private ITransferencia transferencia;
    public ITransferencia getTransferencia() {
        return transferencia;
    }
    public void setTransferencia(ITransferencia transferencia) {
        this.transferencia = transferencia;
    }

    public InsElectrica(String nombreEncargado, double tiempoInstalacion, double precio, ITransferencia transferencia) {
        this.nombreEncargado = nombreEncargado;
        this.tiempoInstalacion = tiempoInstalacion;
        this.precio = precio;
        this.transferencia = transferencia;
    }
    
    @Override
    public void showInstalacion() {
        System.out.println("\n--- Instalacion ---");
        System.out.println("* Tipo Instalacion: Electrica");
        System.out.println("* Nombre Encargado: "+nombreEncargado);
        System.out.println("* Tiempo Instalacion: "+tiempoInstalacion);
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
