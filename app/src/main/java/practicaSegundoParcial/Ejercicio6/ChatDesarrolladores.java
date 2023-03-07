package practicaSegundoParcial.Ejercicio6;

import java.util.Vector;

public class ChatDesarrolladores implements IMediator{
    private Vector<Usuario> redDesarrolladores = new Vector<>();

    public void addNuevoUsuario(Usuario usuario){
        redDesarrolladores.add(usuario);
    }

    @Override
    public Usuario infUsuario(int codigo) throws Exception{
        if(redDesarrolladores.stream().filter(i->i.getCi()==codigo).count()==0){
            throw new Exception("Usuario innexistente");
        }else{
            for(int i=0;i<redDesarrolladores.size();i++){ 
                if(redDesarrolladores.get(i).getCi()==codigo)
                    return redDesarrolladores.get(i);
            }
        }
        return null;
    }

    @Override
    public void sendOneUser(String message, Usuario Usuario) {
        Usuario.messageReceived(message, Usuario);
        System.out.println();
    }

    @Override
    public void sendAllGroup(String message, Usuario usuario) {
        redDesarrolladores.stream()
        .filter(i -> usuario.getCi() != i.getCi())
        .forEach(i -> i.messageReceived(message, i));
        System.out.println();
    }

}
