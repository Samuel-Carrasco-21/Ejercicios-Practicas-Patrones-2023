package practicaSegundoParcial.Ejercicio6;

import java.util.Vector;

public class ProyectoGitHub {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String codigo = "";
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }

    private Vector<String> tareasBacklog =  new Vector<>();
    
    public void addTareaBacklog(String tarea){
        tareasBacklog.add(tarea.toLowerCase());
    }

    public boolean removeTareaBacklog(String tarea){
        if(tareasBacklog.contains(tarea)){
            System.out.println("--- TAREA TOMADA ---");
            tareasBacklog.remove(tarea);
            return true;
        }else{
            System.out.println("--- NO EXISTE LA TAREA DISPONIBLE ---");
            return false;
        }
    }

    public void showInfo(){
        System.out.println("-----------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Tareas:");
        this.tareasBacklog.forEach(i->System.out.println("* "+i));
        System.out.println("-----------------");
    }

    public void realizarCambios(String nuevoCodigo){
        String cambio = getCodigo() + nuevoCodigo; 
        setCodigo(cambio);
    }    

}
