package practicaTercerParcial.Ejercicio5;

public class MobileAdapter implements IComputadora{
    private IMobile iMobile;

    public MobileAdapter(IMobile iMobile){
        this.iMobile = iMobile;
    }

    @Override
    public void iniciarSesion() {
        iMobile.login();
    }

    @Override
    public void cerrarSesion() {
        iMobile.logout();
    }

    @Override
    public void generarDatos() {
        iMobile.reportes();
    }

    @Override
    public void infoComputadora() {
        iMobile.infoMobile();
    }


}
