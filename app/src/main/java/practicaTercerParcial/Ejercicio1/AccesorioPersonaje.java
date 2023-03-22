package practicaTercerParcial.Ejercicio1;

public class AccesorioPersonaje implements IAccesorioPersonaje{
    private Personaje personaje;
    public Personaje getPersonaje() {
        return personaje;
    }

    public void activarVentaja(){
        System.out.println("\n<><><><> ACTIVANDO VENTAJA <><><><>");
        System.out.println("* Personaje: "+getPersonaje().getNombre());
    }

    public void infoAccesorio(){
        System.out.println("\n--- ACCESORIO DE PERSONAJE ---");
    }

    public AccesorioPersonaje(Personaje personaje){
        this.personaje = personaje;
    }

    @Override
    public void agregarAccesorioPersonaje(IAccesorioPersonaje personaje) {
        if(personaje instanceof Personaje){
            if(personaje == this.personaje){
                this.activarVentaja();
            }else{
                System.out.println("--- COMANDO INACEPTABLE ---");
            }
        }
    }
    
}
