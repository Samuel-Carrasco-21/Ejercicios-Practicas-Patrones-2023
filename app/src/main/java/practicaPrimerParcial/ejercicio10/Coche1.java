package practicaPrimerParcial.ejercicio10;

public class Coche1 extends Vehiculo{

    @Override
    public void asignarPlaca() {
        setPlaca(Integer.toString((int)(Math.random()*100000)));
    }

    @Override
    public void asignarModelo() {
        setModelo("Familiar");
    }

    @Override
    public void asignarConductor() {
        setConductor(new Conductor(enviarDato("Conductor")));
    }

    @Override
    public Vehiculo create() {
        Coche1 coche1 = new Coche1();
        coche1.asignarPlaca();
        coche1.asignarModelo();
        coche1.asignarConductor();
        return coche1;
    }

    @Override
    public void showCoche() {
        System.out.println("--- COCHE SUZUKI ---");
        System.out.println("Placa: "+getPlaca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Conductor:");
        System.out.println("* Nombre: "+getConductor().getName());
        System.out.println();
    }

}
