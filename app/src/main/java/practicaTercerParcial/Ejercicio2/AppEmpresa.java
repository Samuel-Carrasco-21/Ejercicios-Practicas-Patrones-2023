package practicaTercerParcial.Ejercicio2;

public class AppEmpresa implements ITransferencia{
    private String nombreEmpresa;
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    private double versionApp;
    public double getVersionApp() {
        return versionApp;
    }
    public void setVersionApp(double versionApp) {
        this.versionApp = versionApp;
    }

    private double descuento;
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public AppEmpresa(String nombreEmpresa, double versionApp, double descuento) {
        this.nombreEmpresa = nombreEmpresa;
        this.versionApp = versionApp;
        this.descuento = descuento;
    }

    @Override
    public void showTransferencia() {
        System.out.println("--- App Empresa ---");
        System.out.println("* Tipo Tranferencia: App Empresa");
        System.out.println("* Nombre Empresa: "+nombreEmpresa);
        System.out.println("* Version App: "+versionApp);
        System.out.println("* Descuento: "+descuento);
    }

    @Override
    public double obtenerDescuento() {
        return descuento;
    }
    
}
