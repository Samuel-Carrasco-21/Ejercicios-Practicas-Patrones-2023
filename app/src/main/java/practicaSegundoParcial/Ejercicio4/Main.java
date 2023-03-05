package practicaSegundoParcial.Ejercicio4;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Whatapp whatapp = new Whatapp();
        Vector<Usuario> usuarios = new Vector<>();
        for(int i=0;i<10;i++){
            OneUsuario o1 = new OneUsuario(whatapp);
            o1.setName("Usuario "+(i+1));
            o1.setGrupo("grupo x");
            o1.setCi((i+1)*10);

            usuarios.add(o1);
            whatapp.addNuevoUsuario(o1);
        }
        
        OneUsuario o1 = new OneUsuario(whatapp);
            o1.setName("Usuario 11");
            o1.setGrupo("grupo y");
            o1.setCi(110);

        usuarios.get(0).sendOneUser("Hola que tal?!", usuarios.get(1));
        usuarios.get(9).sendAllGroup("Hola grupo, que tal?!", "grupo x");

    }
}
