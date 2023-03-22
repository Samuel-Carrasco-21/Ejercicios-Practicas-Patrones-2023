package practicaTercerParcial.Ejercicio1;

public class Hacha extends Arma{
    private String talisman;
    public String getTalisman() {
        return talisman;
    }

    public Hacha(Personaje personaje) {
        super(personaje);
        this.talisman = "Proteccion de Aegir";
        setTipo("hacha");
    }

    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("* Talisman: "+talisman);
    }

}
