package practicaPrimerParcial.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Evaluador extends Conversion{
    private List<Conversion> lista = new ArrayList<>();
    private Context context;

    public Evaluador(String formulaOriginal){
        context = new Context(formulaOriginal.replace(" ",""));
        for (String msg:formulaOriginal.split(" ")){
            lista.add(new NumerosRomanos(msg.length()));
        }
    }

    public String evaluarNumeros(){
        for (Conversion operacionMatematicas:lista) {
            operacionMatematicas.interpreter(context);
        }
        return context.output;
    }
    @Override
    public void interpreter(Context context) {

    }
}
