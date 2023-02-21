package practicaPrimerParcial.ejercicio6;

public class WordThen extends PalabraIngles{
    public WordThen(int letra){
        this.letra = letra;
    }

    @Override
    public void interpreter(Context context) {
        // TODO Auto-generated method stub
        context.output = context.output + conversionPalabra(context.input.substring(0,this.letra))+" ";
        context.input = context.input.substring(this.letra);    
    }

    public static String conversionPalabra(String word){
        if(word.equals("Para")){
            return "Then";
        }else{
            return word;
        }
    }
}
