package practicaPrimerParcial.ejercicio10;

public class Coche3 extends Vehiculo{

    @Override
    public void asignarPlaca() {
        setPlaca(Integer.toString((int)(Math.random()*100000)));
    }

    @Override
    public void asignarModelo() {
        setModelo("Economico");
    }

    @Override
    public void asignarConductor() {
        setConductor(new Conductor(enviarDato("Conductor")));
    }

    @Override
    public Vehiculo create() {
        Coche3 coche3 = new Coche3();
        coche3.asignarPlaca();
        coche3.asignarModelo();
        coche3.asignarConductor();
        return coche3;
    }

    @Override
    public void showCoche() {
        System.out.println("--- COCHE TOYOTA ---");
        System.out.println("Placa: "+getPlaca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Conductor:");
        System.out.println("* Nombre: "+getConductor().getName());
        System.out.println();
    }
    
    
}
