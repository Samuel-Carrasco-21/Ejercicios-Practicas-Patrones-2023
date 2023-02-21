package practicaPrimerParcial.ejercicio10;

public class Main {
    public static void main(String[] args) {
        String v1 = "suzuki";
        String v2 = "ford";
        String v3 = "toyota";

        Vehiculo a1 = FactoryVehiculo.make(v1);
        Vehiculo a2 = FactoryVehiculo.make(v1);

        Vehiculo a3 = FactoryVehiculo.make(v2);
        Vehiculo a4 = FactoryVehiculo.make(v2);

        Vehiculo a5 = FactoryVehiculo.make(v3);
        Vehiculo a6 = FactoryVehiculo.make(v3);

        Administrador administrador = new Administrador("Jhon Snow");

        administrador.cobrarPeaje(8, a1);
        administrador.cobrarPeaje(16, a2);
        administrador.cobrarPeaje(32, a3);
        administrador.cobrarPeaje(64, a4);
        administrador.cobrarPeaje(128, a5);
        administrador.cobrarPeaje(256, a6);

        administrador.mostrarRegistro();

    }
}
