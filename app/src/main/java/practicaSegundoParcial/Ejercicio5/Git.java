package practicaSegundoParcial.Ejercicio5;

public class Git {
    private Proyecto proyecto;

    public void setProject(Proyecto proyecto){
        this.proyecto = new Proyecto();
        this.proyecto.setNombre(proyecto.getNombre());
        this.proyecto.setCode(proyecto.getCode());
    }

    public Memento crearCommitProyecto(){
        return new Memento (this.proyecto);
    }

    public Proyecto getCommit(Memento memento){
        this.proyecto =memento.mostrarProyecto();
        return this.proyecto;
    }
}
