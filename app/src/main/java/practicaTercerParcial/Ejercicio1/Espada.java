package practicaTercerParcial.Ejercicio1;

public class Espada extends Arma{
    private String material;
    public String getMaterial() {
        return material;
    }

    public Espada(Personaje personaje) {
        super(personaje);
        this.material = "Adamantium";
        setTipo("espada");
    }

    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("* Material: "+material);
    }
    
}
