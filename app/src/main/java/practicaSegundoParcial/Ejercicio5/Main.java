package practicaSegundoParcial.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        GitHub gitHub = new GitHub();

        Git git =  new Git();

        Proyecto proyecto = new Proyecto();

        for(int i=0;i<3;i++){
            Desarrollador desarrollador = 
            new Desarrollador();

            desarrollador.setNombre("DEV "+(i+1));
            desarrollador.setCi((i+1)*100);

            gitHub
            .attach(desarrollador);
        }

        proyecto.setNombre("JavaScript Code");

        proyecto.setCode("alert('musica ligera');");
        git.setProject(proyecto);
        gitHub.subirCommit("A1001", git.crearCommitProyecto());

        proyecto.setCode("alert('lalala');");
        git.setProject(proyecto);
        gitHub.subirCommit("B2001", git.crearCommitProyecto());

        proyecto.setCode("alert('dust in the wind');");
        git.setProject(proyecto);
        gitHub.subirCommit("C3001", git.crearCommitProyecto());

        proyecto.setCode("alert('la fama');");
        git.setProject(proyecto);
        gitHub.subirCommit("D4001", git.crearCommitProyecto());

        proyecto.setCode("alert('snowman');");
        git.setProject(proyecto);
        gitHub.subirCommit("E5001", git.crearCommitProyecto());

        proyecto.showInfo();

        proyecto = git.getCommit(gitHub.checkoutCommit("A1001"));

        System.out.println("\n--- REPOSITORIO ACTUAL ---");
        proyecto.showInfo();

        System.out.println("\n<><><><><><><><><><><><>");

        while(!gitHub.getObservadores().isEmpty()){
            gitHub.deattach(gitHub.getObservadores().lastElement());   
        }

        for(int i=0;i<3;i++){
            Desarrollador desarrollador = 
            new Desarrollador();

            desarrollador.setNombre("DEV "+((i+1)*5));
            desarrollador.setCi((i+1)*1000);

            gitHub
            .attach(desarrollador);
        }

        proyecto = git.getCommit(gitHub.checkoutCommit("E5001"));

        System.out.println("\n--- REPOSITORIO ACTUAL ---");
        proyecto.showInfo();
    }
}
