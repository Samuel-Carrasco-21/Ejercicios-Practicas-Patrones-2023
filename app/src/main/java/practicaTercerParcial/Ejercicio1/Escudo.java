package practicaTercerParcial.Ejercicio1;

public class Escudo extends AccesorioPersonaje{
    private String modeloEscudo;
    private String color;

    public String getModeloEscudo() {
        return modeloEscudo;
    }
    public void setModeloEscudo(String modeloEscudo) {
        this.modeloEscudo = modeloEscudo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Escudo(Personaje personaje) {
        super(personaje);
    }
    
    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("--- ESCUDO ---");
        System.out.println("* Modelo Escudo: "+modeloEscudo);
    }

    @Override
    public void activarVentaja(){
        super.activarVentaja();
        infoAccesorio();

        System.out.println("--- INCREMENTAR PUNTOS DE DEFENSA ---");
        System.out.println("--- INCREMENTAR PORCENTAJE DE ARMADURA ---");

        double defensaAnterior = getPersonaje().getPuntosDefensa();
        defensaAnterior*=1.35;
        defensaAnterior = Math.round(defensaAnterior*100.00)/100.00;
        getPersonaje().setPuntosDefensa(defensaAnterior);

        double porcentajeAnterior = getPersonaje().getPorcentajeArmadura();
        porcentajeAnterior*=1.10;
        porcentajeAnterior = Math.round(porcentajeAnterior*100.00)/100.00;
        getPersonaje().setPorcentajeArmadura(porcentajeAnterior);
    }
}
