package practicaTercerParcial.Ejercicio5;

public class Android implements IMobile{
    private int numero;
    private String modelo;

    public Android(){
        this.modelo = "Samsung Galaxy S50";
        this.numero = (int)(Math.random()*100000000);
    }

    @Override
    public void login() {
        System.out.println("\n--- LOGIN MOBILE ---");
        System.out.println("Login Android");
    }

    @Override
    public void logout() {
        System.out.println("\n--- LOGOUT MOBILE ---");
        System.out.println("Logout Android");
    }

    @Override
    public void reportes() {
        System.out.println("\n--- REPORTES MOBILE ---");
        System.out.println("Making Report Android");
    }

    @Override
    public void infoMobile() {
        System.out.println("\n--- MOBILE ---");
        System.out.println("* Marca: Samsung");
        System.out.println("* Numero: "+numero);
        System.out.println("* Modelo: "+modelo);
    }
    
}
