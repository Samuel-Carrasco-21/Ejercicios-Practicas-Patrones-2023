package practicaPrimerParcial.ejercicio5;

public class Tira extends PlatilloParrilla {

    private String tipoCarne;
    public String getTipoCarne() {
        return tipoCarne;
    }
    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    private String saborRefresco;
    public String getSaborRefresco() {
        return saborRefresco;
    }
    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    private String guarnicion;
    public String getGuarnicion() {
        return guarnicion;
    }
    public void setGuarnicion(String guarnicion) {
        this.guarnicion = guarnicion;
    }

    @Override
    public void prepararPlatillo() {
        // TODO Auto-generated method stub
        System.out.println("--- PREPARANDO TIRA ---");
    }

    @Override
    public void showPlatillo() {
        // TODO Auto-generated method stub
        prepararPlatillo();
        System.out.println("Platillo Tira:");
        System.out.println("* Tipo Carne: "+getTipoCarne());
        System.out.println("* Sabor Refresco: "+getSaborRefresco());       
        System.out.println("* Guarnicion: "+getGuarnicion());
        System.out.println();
    }

    
    
}
