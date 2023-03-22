package practicaTercerParcial.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new 
        Usuario(
            "Jose - 1",
            "user1",
            "admin123",
            false);

        Usuario u2 = new 
        Usuario(
            "Jose - 2",
            "user2",
            "admin321",
            true);

        u1.ingresarSistema("user1", "admin123");
        u2.ingresarSistema("user2", "admin321");
    }
}
