package practicaSegundoParcial.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Cliente 1");
        cliente.setCi(5001);
        cliente.sacarDinero(200);

        cliente.pagarDeuda(20);
        cliente.pagarDeuda(40);
        cliente.pagarDeuda(60);
        cliente.pagarDeuda(80);
    }
}
