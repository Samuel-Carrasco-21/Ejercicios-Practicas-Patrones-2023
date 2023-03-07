package practicaSegundoParcial.Ejercicio6;

import java.util.Vector;

public class Main {
    public static void main(String[] args) throws Exception {
        ChatDesarrolladores chatDesarrolladores = new ChatDesarrolladores();
        Vector<Desarrollador> usuarios = new Vector<>();
        ProyectoGitHub proyectoGitHub = new ProyectoGitHub();
        proyectoGitHub.setNombre("Proyecto GitHub 1");

        proyectoGitHub.addTareaBacklog("tarea 1");
        proyectoGitHub.addTareaBacklog("tarea 2");
        proyectoGitHub.addTareaBacklog("tarea 3");
        proyectoGitHub.addTareaBacklog("tarea 4");

        for(int i=0;i<7;i++){
            Desarrollador o1 = new Desarrollador(chatDesarrolladores);
            o1.setName("Usuario "+(i+1));
            o1.setCi((i+1)*10);

            usuarios.add(o1);
            chatDesarrolladores.addNuevoUsuario(o1);
        }

        usuarios.get(0).subiendoCodigo(
            "personal", 
            "alert('Hola');",
            proyectoGitHub);

        usuarios.get(1).subiendoCodigo(
            "grupal", 
            " - print('Hola');",
            proyectoGitHub);

        System.out.println("<><><><><>");
        proyectoGitHub.showInfo();
        System.out.println("<><><><><>");

        usuarios.get(5).tareaBacklog(
            "personal",
            "tarea 1", 
            proyectoGitHub);

        usuarios.get(6).tareaBacklog(
            "grupal",
            "tarea 3", 
            proyectoGitHub);

        System.out.println("<><><><><>");
        proyectoGitHub.showInfo();
        System.out.println("<><><><><>");
    }
}
