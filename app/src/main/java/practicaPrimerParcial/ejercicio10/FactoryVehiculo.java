package practicaPrimerParcial.ejercicio10;

public class FactoryVehiculo {
    // (placa,modelo, etc
    public static Vehiculo make(String tipo){
        Vehiculo vehiculo;
        switch(tipo){
            case "suzuki":
                vehiculo = new Coche1().create();
                break;
            case "ford":
                vehiculo = new Coche2().create();
                break;
            default:
                vehiculo = new Coche3().create();
                break;
        }
        return vehiculo;
    }
}
