package practicaPrimerParcial.ejercicio9;

public class NumerosRomanos extends Conversion{

    public NumerosRomanos(int digit){
        this.digit=digit;
    }

    @Override
    public void interpreter(Context context) {
        // TODO Auto-generated method stub
        context.output=context.output + 
        traduccion(context.input.substring(0,this.digit))+" ";
        context.input=context.input.substring(this.digit);
    }

    public String traduccion(String numero){
        switch(numero){
            case "1":
                return "I";
            case "2":
                return "II";
            case "3":
                return "III";
            case "4":
                return "IV";
            case "5":
                return "V";
            case "6":
                return "VI";
            case "7":
                return "VII";
            case "8":
                return "VIII";
            case "9":
                return "IX";
            default:
                return "X";
        }
    }
    
}
