package practicaSegundoParcial.Ejercicio5;

import java.util.Vector;

public class MedioComunicacion implements IMediator{
    private Vector <UsuarioMC> desarrolladores = new Vector<>();

    public void addDesarrolador(Desarrollador desarrollador){
        desarrolladores.add(desarrollador);
    }

    public void removeDesarrollador(Desarrollador desarrollador){
        desarrolladores.remove(desarrollador);
    }

    public void removeAllDev(){
        desarrolladores.clear();
    }

    @Override
    public void send(String message, Memento memento) {
        desarrolladores.forEach(i->i.messageReceived(message, memento));
    }

}
