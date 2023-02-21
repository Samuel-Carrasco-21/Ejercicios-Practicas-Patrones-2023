package practicaPrimerParcial.ejercicio10;

public class Coche2 extends Vehiculo{

    @Override
    public void asignarPlaca() {
        setPlaca(Integer.toString((int)(Math.random()*100000)));
    }

    @Override
    public void asignarModelo() {
        setModelo("Todo terreno");
    }

    @Override
    public void asignarConductor() {
        setConductor(new Conductor(enviarDato("Conductor")));
    }

    @Override
    public Vehiculo create() {
        Coche2 coche2 = new Coche2();
        coche2.asignarPlaca();
        coche2.asignarModelo();
        coche2.asignarConductor();
        return coche2;
    }

    @Override
    public void showCoche() {
        System.out.println("--- COCHE FORD ---");
        System.out.println("Placa: "+getPlaca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Conductor:");
        System.out.println("* Nombre: "+getConductor().getName());
        System.out.println();
    }
    
}
