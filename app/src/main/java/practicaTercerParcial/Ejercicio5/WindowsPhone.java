package practicaTercerParcial.Ejercicio5;

public class WindowsPhone implements IMobile{
    private int numero;
    private String modelo;

    public WindowsPhone(){
        this.modelo = "Microsoft Mobile 1";
        this.numero = (int)(Math.random()*100000000);
    }

    @Override
    public void login() {
        System.out.println("\n--- LOGIN MOBILE ---");
        System.out.println("Login Windows Phone");
    }

    @Override
    public void logout() {
        System.out.println("\n--- LOGOUT MOBILE ---");
        System.out.println("Logout Windows Phone");
    }

    @Override
    public void reportes() {
        System.out.println("\n--- REPORTES MOBILE ---");
        System.out.println("Making Report Windows Phone");
    }

    @Override
    public void infoMobile() {
        System.out.println("\n--- MOBILE ---");
        System.out.println("* Marca: Microsoft");
        System.out.println("* Numero: "+numero);
        System.out.println("* Modelo: "+modelo);
    }
    
}
