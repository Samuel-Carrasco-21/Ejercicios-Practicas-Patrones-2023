package practicaTercerParcial.Ejercicio1;

public class Arma extends AccesorioPersonaje{
    private String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        tipo = tipo.toLowerCase();
        this.tipo = tipo;
    }

    public Arma(Personaje personaje) {
        super(personaje);
    }

    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("--- ARMA ---");
        System.out.println("* Tipo: "+tipo);
    }
    
    @Override
    public void activarVentaja(){
        super.activarVentaja();
        infoAccesorio();

        System.out.println("--- INCREMENTAR PUNTOS DE ATAQUE ---");
        System.out.println("--- IMCREMENTAR NIVEL DE PERSONAJE ---");
        
        double nivelAnterior = getPersonaje().getNivel();
        nivelAnterior*=2;
        nivelAnterior = Math.round(nivelAnterior*100.00)/100.00;
        getPersonaje().setNivel(nivelAnterior);
        
        double ataqueAnterior = getPersonaje().getPuntosAtaque();
        ataqueAnterior *= 1.30;
        ataqueAnterior = Math.round(ataqueAnterior*100.00)/100.00;
        getPersonaje().setPuntosAtaque(ataqueAnterior);
    }
}
