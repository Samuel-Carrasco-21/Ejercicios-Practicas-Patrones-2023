package practicaTercerParcial.Ejercicio4;

public class Usuario {
    private String nombre;
    private String user;
    private String pwd;
    private boolean par;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user.toLowerCase();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd.toLowerCase();
    }

    public boolean getPar() {
        return par;
    }

    public void setPar(boolean par) {
        this.par = par;
    }

    public Usuario(String nombre, String user, String pwd, boolean par) {
        this.nombre = nombre.toLowerCase();
        this.user = user.toLowerCase();
        this.pwd = pwd.toLowerCase();
        this.par = par;
        this.loginProxy = new LoginProxy(this);
    }

    private LoginProxy loginProxy;

    public void showInformacion(){
        System.out.println("--- USUARIO ---");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* User: "+user);
        System.out.println("* Pwd: "+pwd);
        System.out.println(par ? "* Tipo Usuario: Par" : "* Tipo Usuario: Impar");
    }

    public void ingresarSistema(String user, String pwd){
        loginProxy.request(this, user, pwd);
    }

}
