package practicaTercerParcial.Ejercicio4;

public class LoginProxy implements ILogin{

    private Servidor1 servidor1 = new Servidor1();
    private Servidor2 servidor2 = new Servidor2();

    public LoginProxy(Usuario usuario){
        if(!usuario.getPar()){
            servidor1.agregarUsuario(usuario);
        }else{
            servidor2.agregarUsuario(usuario);
        }
    }

    @Override
    public void request(Usuario usuario, String user, String pwd) {
        System.out.println();
        if(!usuario.getPar()){
            System.out.println("--- SERVIDOR 1 ---");

            if(servidor1.getUsariosServer1().contains(usuario)){
                if(servidor1.getUsariosServer1().stream()
                .filter(i -> i.getUser().equals(user.toLowerCase()) &&
                i.getPwd().equals(pwd.toLowerCase())).count()>0){
                    servidor1.request(usuario, user, pwd);                    
                }else{
                    System.out.println("--- USUARIO O PWD INCORRETOS ---");
                }
            }else{
                System.out.println("--- Usuario Inexsistente ---");
            }

        }else{
            System.out.println("--- SERVIDOR 2 ---");
            
            if(servidor2.getUsariosServer2().contains(usuario)){
                if(servidor2.getUsariosServer2().stream()
                .filter(i -> i.getUser().equals(user.toLowerCase()) &&
                i.getPwd().equals(pwd.toLowerCase())).count()>0){
                    servidor2.request(usuario, user, pwd);                    
                }else{
                    System.out.println("--- USUARIO O PWD INCORRETOS ---");
                }
            }else{
                System.out.println("--- Usuario Inexsistente ---");
            }

        }
    }
    
}
