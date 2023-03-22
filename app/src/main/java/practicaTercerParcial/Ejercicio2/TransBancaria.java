package practicaTercerParcial.Ejercicio2;

public class TransBancaria implements ITransferencia{
    private double id;
    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
    }

    private String nombreBanco;
    public String getNombreBanco() {
        return nombreBanco;
    }
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    private double descuento;
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public TransBancaria(double id, String nombreBanco, double descuento) {
        this.id = id;
        this.nombreBanco = nombreBanco;
        this.descuento = descuento;
    }

    @Override
    public void showTransferencia() {
        System.out.println("--- Tranferencia ---");
        System.out.println("* Tipo Tranferencia: Bancaria");
        System.out.println("* ID: "+id);
        System.out.println("* Nombre Banco: "+nombreBanco);
        System.out.println("* Descuento: "+descuento);
    }

    @Override
    public double obtenerDescuento() {
        return descuento;
    }
    
}
