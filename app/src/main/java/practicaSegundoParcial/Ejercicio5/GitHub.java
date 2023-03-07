package practicaSegundoParcial.Ejercicio5;

import java.util.HashMap;
import java.util.Map;

public class GitHub {
    private MedioComunicacion medioComunicacion;
    public MedioComunicacion getMedioComunicacion() {
        return medioComunicacion;
    }
    public void setMedioComunicacion(MedioComunicacion medioComunicacion) {
        this.medioComunicacion = medioComunicacion;
    }

    private Map<String,Memento> commits = new HashMap<>();

    public void subscribirseRepositorio(Desarrollador desarrollador){
        medioComunicacion.addDesarrolador(desarrollador);
    }

    public void anularSubscripcion(Desarrollador desarrollador){
        medioComunicacion.removeDesarrollador(desarrollador);
    }

    public void subirCommit(String codeCommit, Memento memento){
        commits.put(codeCommit, memento);
    }

    public Memento checkoutCommit(String codeCommit){
        if(!commits.containsKey(codeCommit)){
            System.out.println("--- NO EXISTE EL COMMIT BUSCADO ---");
            return null;
        }else{
            medioComunicacion.send(codeCommit, commits.get(codeCommit));
            return commits.get(codeCommit);
        }
    }
}
