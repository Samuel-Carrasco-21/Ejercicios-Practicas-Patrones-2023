package practicaPrimerParcial.ejercicio7;

public class ObjetoEstructura extends TipoLista{

    public ObjetoEstructura(int tipoLista){
        this.tipoLista = tipoLista;
    }

    @Override
    public void interpreter(Context context) {
        context.output = context.output + 
        evaluarTipo(context.input.substring(0,this.tipoLista))+" ";
        context.input = context.input.substring(this.tipoLista);
    }

    public String evaluarTipo(String lista){
        if(lista.equals("List<Empleado>") 
        || lista.equals("Vector<Empleado>") 
        || lista.equals("Stack<Empleado>")){
            return "HashMap<Empleado>";
        }else if(lista.equals("Array[]")){
            return "HashMap<Empleado>";
        }
        return lista;
    }
    
}
