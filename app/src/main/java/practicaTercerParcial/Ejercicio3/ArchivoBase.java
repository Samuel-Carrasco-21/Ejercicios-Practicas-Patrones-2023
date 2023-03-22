package practicaTercerParcial.Ejercicio3;

public abstract class ArchivoBase {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String texto;
    public String getTexto() {
        if(this instanceof Archivo){
            return texto;
        }else{
            System.out.println("--- COMANDO INACEPTABLE ---");        
            return null;
        }
    }
    public void setTexto(String texto) {
        if(this instanceof Archivo){
            this.texto = texto;
            setCantidadPalabras();
        }else{
            System.out.println("--- COMANDO INACEPTABLE ---");    
        }
    }

    private int cantidadPalabras;
    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    private void setCantidadPalabras() {
        if(getTexto().length()!=0){
            this.cantidadPalabras=contarPalabras();
        }
    }

    private int contarPalabras(){
        char []arregloAux = getTexto().toLowerCase().toCharArray();
        int contador=1;
        for(int i=0; i<getTexto().length(); i++){
            if(arregloAux[i]==' '){
                contador++;
            }
        }
        return contador;
    }

    public ArchivoBase(String nombre) {
        this.nombre = nombre;
    }

    public abstract void operation();
    public abstract void add(ArchivoBase archivoBase);
    public abstract void remove(ArchivoBase archivoBase);
    public abstract ArchivoBase get(int position);
    
}
