package practicaSegundoParcial.Ejercicio4;

import java.util.Vector;

public class Whatapp implements IMediator{

    private Vector<Usuario> redSocial = new Vector<>();

    public Whatapp addNuevoUsuario(Usuario usuario){
        redSocial.add(usuario);
        return this;
    }

    @Override
    public void sendOneUser(String message, Usuario Usuario) {
        Usuario.messageReceived(message, Usuario);
        System.out.println();
    }

    @Override
    public void sendAllGroup(String message, String grupo, Usuario usuario) {
        redSocial.stream()
        .filter(i->i.getGrupo().toLowerCase().equals(grupo.toLowerCase())
        && usuario.getCi() != i.getCi())
        .forEach(i->i.messageReceived(message, i));
        System.out.println();
    }
    
}
