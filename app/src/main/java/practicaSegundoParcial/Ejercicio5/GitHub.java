package practicaSegundoParcial.Ejercicio5;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class GitHub implements ISubject{
    private Map<String,Memento> commits = new HashMap<>();
    private Vector<IObserver> observadores = new Vector<>();

    public Vector<IObserver> getObservadores() {
        return observadores;
    }

    public void subirCommit(String codeCommit, Memento memento){
        commits.put(codeCommit, memento);
    }

    @Override
    public Memento checkoutCommit(String codeCommit){
        if(!commits.containsKey(codeCommit)){
            System.out.println("--- NO EXISTE EL COMMIT BUSCADO ---");
            return null;
        }else{
            for (IObserver observer:observadores
            ) {
                observer.update(codeCommit,commits.get(codeCommit));
            }
            return commits.get(codeCommit);
        }
    }

    @Override
    public void attach(IObserver observer) {
        observadores.add(observer);
    }

    @Override
    public void deattach(IObserver observer) {
        observadores.remove(observer);
    }
}
