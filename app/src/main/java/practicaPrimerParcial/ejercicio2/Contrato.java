package practicaPrimerParcial.ejercicio2;

public class Contrato implements IContrato{
    private int sueldo;
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    private int cargaHoraria;
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    private boolean CursoEducacionSuperior;
    public boolean isCursoEducacionSuperior() {
        return CursoEducacionSuperior;
    }
    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.CursoEducacionSuperior = cursoEducacionSuperior;
    }

    private boolean AccesoPlataforma;
    public boolean isAccesoPlataforma() {
        return AccesoPlataforma;
    }
    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.AccesoPlataforma = accesoPlataforma;
    }

    private boolean MarcadoBiometrico;
    public boolean isMarcadoBiometrico() {
        return MarcadoBiometrico;
    }
    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.MarcadoBiometrico = marcadoBiometrico;
    }

    private String MarcadoHoraEntrada;
    public String getMarcadoHoraEntrada() {
        return MarcadoHoraEntrada;
    }
    public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.MarcadoHoraEntrada = marcadoHoraEntrada;
    }

    private String MarcadoHoraSalida;
    public String getMarcadoHoraSalida() {
        return MarcadoHoraSalida;
    }
    public void setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.MarcadoHoraSalida = marcadoHoraSalida;
    }

    

    // Sueldo : 5000 
    // Carga_Horaria : 80
    // Curso_Educacion_Superior : true 
    // AccesoPlataforma : true 
    // Marcado Biométrico : false 
    // Marcado Hora de Entrada : 08:00 
    // Marcado hora de Salida : 18:00
    private Docente docente;
    public Docente getDocente() {
        return docente;
    }
    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Contrato(Docente docente){
        this.docente = docente;
    }

    @Override
    public Contrato clone(){
        Contrato clone = new 
        Contrato(this.docente);

        clone.setSueldo(5000);
        clone.setCargaHoraria(80);
        clone.setCursoEducacionSuperior(true);
        clone.setAccesoPlataforma(true);
        clone.setMarcadoBiometrico(false);
        clone.setMarcadoHoraEntrada("8:00");
        clone.setMarcadoHoraSalida("18:00");

        return clone;
    }

    public void showInfo(){
        System.out.println("\n-------------");
        System.out.println("Nombre Docente: "+getDocente().getNombre());
        System.out.println("Codigo Docente: "+getDocente().getCodigoDocente());
        System.out.println("Sueldo: "+getSueldo());
        System.out.println("Carga Horaria: "+getCargaHoraria());
        System.out.println("Curso Educacion Superior: "+isCursoEducacionSuperior());
        System.out.println("Acceso a Plataforma: "+isAccesoPlataforma());
        System.out.println("Marcado Biometrico: "+isMarcadoBiometrico());
        System.out.println("Marcado Hora Entrada: "+getMarcadoHoraEntrada());
        System.out.println("Marcado Hora Salida: "+getMarcadoHoraSalida());
        System.out.println("-------------\n");
    }
}
