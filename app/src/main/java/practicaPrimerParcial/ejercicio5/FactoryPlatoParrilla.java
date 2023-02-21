package practicaPrimerParcial.ejercicio5;

public class FactoryPlatoParrilla {
    public static PlatilloParrilla make(String tipo){
        PlatilloParrilla parrilla;
        switch(tipo.toLowerCase()){
            case "bife":
                parrilla = prepararBife();
                break;
            case "lomito":
                parrilla = prepararLomito();
                break;
            case "tira":
                parrilla = prepararTira();
                break;
            default:
                System.out.println("NO EXISTE ESTA VARIANTE");
                parrilla = null;
                break;
        }
        return parrilla;
    }

    public static Bife prepararBife(){
        Bife bife = new Bife();
        bife.setTipoCarne("bife");
        bife.setSaborRefresco("coca cola");
        bife.setGuarnicion("papas fritas");
        return bife;
    }

    public static Lomito prepararLomito(){
        Lomito lomito = new Lomito();
        lomito.setTipoCarne("lomo");
        lomito.setSaborRefresco("pepsi");
        lomito.setGuarnicion("arroz");
        return lomito;
    }

    public static Tira prepararTira(){
        Tira tira = new Tira();
        tira.setTipoCarne("tira de carne");
        tira.setSaborRefresco("coca cola");
        tira.setGuarnicion("fideo");
        return tira;
    }
}
