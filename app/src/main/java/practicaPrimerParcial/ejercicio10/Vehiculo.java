package practicaPrimerParcial.ejercicio10;

import java.util.Scanner;

public abstract class Vehiculo {

    public abstract void showCoche();

    public abstract Vehiculo create();

    public String enviarDato(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dato para "+mensaje+": ");
        String dato = scanner.nextLine();
        return dato;
    }

    public abstract void asignarPlaca();
    public abstract void asignarModelo();
    public abstract void asignarConductor();

    private String placa;
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    private String modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private Conductor conductor;
    public Conductor getConductor() {
        return conductor;
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
