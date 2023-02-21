package practicaPrimerParcial.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Evaluador extends TipoLista{
    private List<TipoLista> listas = new ArrayList<>();
    private Context context;

    public Evaluador(String listasOriginales){
        context = new Context(listasOriginales.replace(" ", ""));
        for(String msg:listasOriginales.split(" ")){
            listas.add(new ObjetoEstructura(msg.length()));                   
        }
    }

    public String evaluateCadena(){
        for (TipoLista palabraIngles:listas) {
            palabraIngles.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'interpreter'");
    }
    
}
