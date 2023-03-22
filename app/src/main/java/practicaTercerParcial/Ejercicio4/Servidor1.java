package practicaTercerParcial.Ejercicio4;

import java.util.Vector;

public class Servidor1 implements ILogin{

    private Vector<Usuario> usariosServer1 = new Vector<>();
    public Vector<Usuario> getUsariosServer1() {
        return usariosServer1;
    }

    @Override
    public void request(Usuario usuario, String user, String pwd) {
        System.out.println("--- INICIO SESION SERVIDOR 1 ---");
        usuario.showInformacion();
    }

    public void agregarUsuario(Usuario usuario){
        usariosServer1.add(usuario);
    }

}
