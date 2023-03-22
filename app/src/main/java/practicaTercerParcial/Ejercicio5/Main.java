package practicaTercerParcial.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Android android = new Android();
        android.login();
        android.logout();
        android.reportes();
        android.infoMobile();

        DesktopApp desktopApp = 
        new DesktopApp("Jose", "user1", "Ubisoft");
        desktopApp.iniciarSesion();
        desktopApp.cerrarSesion();
        desktopApp.generarDatos();
        desktopApp.infoComputadora();

        MobileAdapter mobileAdapter = new MobileAdapter(android);
        mobileAdapter.iniciarSesion();
        mobileAdapter.cerrarSesion();
        mobileAdapter.generarDatos();
    }
}
