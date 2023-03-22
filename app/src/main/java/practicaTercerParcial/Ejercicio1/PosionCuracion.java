package practicaTercerParcial.Ejercicio1;

public class PosionCuracion extends AccesorioPersonaje{
    private String clanDeOrigen;
    public String getClanDeOrigen() {
        return clanDeOrigen;
    }
    public void setClanDeOrigen(String clanDeOrigen) {
        this.clanDeOrigen = clanDeOrigen;
    }

    public PosionCuracion(Personaje personaje) {
        super(personaje);
    }

    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("--- Posion Curacion ---");
        System.out.println("* Clan de Origen: "+clanDeOrigen);
    }

    @Override
    public void activarVentaja(){
        super.activarVentaja();
        infoAccesorio();

        System.out.println("--- INCREMENTAR PUNTOS DE REGENERACION DE VIDA ---");

        double regeneracionAnterior = getPersonaje().getPuntosRegeneracionVida();
        regeneracionAnterior*=1.80;
        regeneracionAnterior = Math.round(regeneracionAnterior*100.00)/100.00;
        getPersonaje().setPuntosRegeneracionVida(regeneracionAnterior);
    }
    
}
