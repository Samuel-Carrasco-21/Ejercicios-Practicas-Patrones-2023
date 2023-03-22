package practicaTercerParcial.Ejercicio5;

public class IOS implements IMobile{
    private int numero;
    private String modelo;

    public IOS(){
        this.modelo = "Iphone X";
        this.numero = (int)(Math.random()*100000000);
    }

    @Override
    public void login() {
        System.out.println("\n--- LOGIN MOBILE ---");
        System.out.println("Login IOS");
    }

    @Override
    public void logout() {
        System.out.println("\n--- LOGOUT MOBILE ---");
        System.out.println("Logout IOS");
    }

    @Override
    public void reportes() {
        System.out.println("\n--- REPORTES MOBILE ---");
        System.out.println("Making Report IOS");
    }

    @Override
    public void infoMobile() {
        System.out.println("\n--- MOBILE ---");
        System.out.println("* Marca: Apple");
        System.out.println("* Numero: "+numero);
        System.out.println("* Modelo: "+modelo);
    }
    
}
