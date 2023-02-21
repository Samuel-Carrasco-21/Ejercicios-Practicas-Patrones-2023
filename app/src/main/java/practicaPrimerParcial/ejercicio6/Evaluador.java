package practicaPrimerParcial.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Evaluador extends PalabraIngles{
    private List<PalabraIngles> cadena = new ArrayList<>();
    private Context context;

    public Evaluador(String cadenaOriginal){
        context = new Context(cadenaOriginal.replace(" ", ""));
        for(String msg:cadenaOriginal.split(" ")){
            switch(msg){
                case "Como":
                    cadena.add(new WordGiven(msg.length()));
                    break;
                case "Quiero":
                    cadena.add(new WordWhen(msg.length()));
                    break;
                default:
                    cadena.add(new WordThen(msg.length()));
                    break;
            }
        }
    }

    public String evaluateCadena(){
        for (PalabraIngles palabraIngles:cadena) {
            palabraIngles.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {
        // TODO Auto-generated method stub
        
    }
    
}
