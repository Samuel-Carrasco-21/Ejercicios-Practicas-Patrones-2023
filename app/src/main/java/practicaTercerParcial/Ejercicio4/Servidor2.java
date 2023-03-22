package practicaTercerParcial.Ejercicio4;

import java.util.Vector;

public class Servidor2 implements ILogin{

    private Vector<Usuario> usariosServer2 = new Vector<>();
    public Vector<Usuario> getUsariosServer2() {
        return usariosServer2;
    }

    @Override
    public void request(Usuario usuario, String user, String pwd) {
        System.out.println("--- INICIO SESION SERVIDOR 2 ---");
        usuario.showInformacion();
    }

    public void agregarUsuario(Usuario usuario){
        usariosServer2.add(usuario);
    }

}
