package practicaTercerParcial.Ejercicio1;

import java.util.Vector;

public class Personaje implements IAccesorioPersonaje{
    private String nombre;
    private double nivel;
    private Vector<AccesorioPersonaje> accesoriosDisponibles = new Vector<>();
    private double porcentajeArmadura;
    private double puntosAtaque;
    private double puntosDefensa;
    private double puntosRegeneracionVida;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNivel() {
        return nivel;
    }
    public void setNivel(double nivel) {
        this.nivel = nivel;
    }
    
    public double getPorcentajeArmadura() {
        return porcentajeArmadura;
    }
    public void setPorcentajeArmadura(double porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }
    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public double getPuntosDefensa() {
        return puntosDefensa;
    }
    public void setPuntosDefensa(double puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public double getPuntosRegeneracionVida() {
        return puntosRegeneracionVida;
    }
    public void setPuntosRegeneracionVida(double puntosRegeneracionVida) {
        this.puntosRegeneracionVida = puntosRegeneracionVida;
    }

    public void agregarAccesorio(AccesorioPersonaje accesorioPersonaje){
        accesoriosDisponibles.add(accesorioPersonaje);
    }

    public void eliminarAccesorio(AccesorioPersonaje accesorioPersonaje){
        accesoriosDisponibles.remove(accesorioPersonaje);
    }

    public void escogerAccesorio(int index){
        accesoriosDisponibles.get(index).infoAccesorio();
    }

    public void info() {
        System.out.println("---------- Personaje ----------");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Nivel: "+nivel);
        System.out.println("* Porcentaje Armadura: "+porcentajeArmadura);
        System.out.println("* Puntos Ataque: "+puntosAtaque);
        System.out.println("* Puntos Defensa: "+puntosDefensa);
        System.out.println("* Puntos de Regeneracion de Vida: "+puntosRegeneracionVida);
        System.out.println("* Accesorios Disponibles:");
        accesoriosDisponibles.forEach(i -> i.infoAccesorio());
        System.out.println("-------------------------------");
    }

    @Override
    public void agregarAccesorioPersonaje(IAccesorioPersonaje accesorioNuevo){
        if(accesorioNuevo instanceof AccesorioPersonaje){
            AccesorioPersonaje aux = (AccesorioPersonaje)(accesorioNuevo);
            aux.agregarAccesorioPersonaje(this);
            accesoriosDisponibles.add(aux);
        }else{
            System.out.println("\n--- Debe insertar un Accesorio apropiado ---\n");
        }
    }

    public Personaje(){
        this.nivel = 1;
        this.porcentajeArmadura = 1;
        this.puntosAtaque = 1;
        this.puntosDefensa = 1;
        this.puntosRegeneracionVida = 1;
    }
}
