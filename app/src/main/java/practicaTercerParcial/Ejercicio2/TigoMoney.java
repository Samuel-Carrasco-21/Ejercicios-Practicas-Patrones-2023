package practicaTercerParcial.Ejercicio2;

public class TigoMoney implements ITransferencia{
    private String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private double version;
    public double getVersion() {
        return version;
    }
    public void setVersion(double version) {
        this.version = version;
    }

    private double descuento;

    public TigoMoney(String tipo, double version, double descuento) {
        this.tipo = tipo;
        this.version = version;
        this.descuento = descuento;
    }

    @Override
    public void showTransferencia() {
        System.out.println("--- Transferencia ---");
        System.out.println("* Tipo Tranferencia: Tigo Money");
        System.out.println("* Tipo: "+tipo);
        System.out.println("* Version: "+version);
        System.out.println("* Descuento: "+descuento);
    }

    @Override
    public double obtenerDescuento() {
        return descuento;
    }
    
}
