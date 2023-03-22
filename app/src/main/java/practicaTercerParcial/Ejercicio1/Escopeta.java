package practicaTercerParcial.Ejercicio1;

public class Escopeta extends Arma{
    private String modelo;
    public String getModelo() {
        return modelo;
    }

    public Escopeta(Personaje personaje) {
        super(personaje);
        this.modelo = "R-870 MCS";
        setTipo("escopeta");
    }

    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("* Modelo: "+modelo);
    }
    
}
