package practicaPrimerParcial.ejercicio6;

public class WordWhen extends PalabraIngles{

    public WordWhen(int letra){
        this.letra = letra;
    }

    @Override
    public void interpreter(Context context) {
        // TODO Auto-generated method stub
        context.output = context.output + conversionPalabra(context.input.substring(0,this.letra))+" ";
        context.input = context.input.substring(this.letra);
    }

    public static String conversionPalabra(String word){
        if(word.equals("Quiero")){
            return "When";
        }else{
            return word;
        }
    }

}
