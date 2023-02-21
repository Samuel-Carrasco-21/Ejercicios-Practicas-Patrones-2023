package practicaPrimerParcial.ejercicio10;

public class Administrador {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Administrador(String name){
        this.name = name;
    }

    public void cobrarPeaje(int dinero, Vehiculo vehiculo){
        Cabina.getInstance().cobrarPeaje(dinero, vehiculo);
    }

    public void mostrarRegistro(){
        Cabina.getInstance().controlPeaje(this);
    }

}
