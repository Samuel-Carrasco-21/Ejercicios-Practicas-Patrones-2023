package practicaPrimerParcial.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Contrato contratoInicial = 
        new Contrato(new Docente(null, 0));
        
        Contrato contrato1 = contratoInicial.clone();
        contrato1
        .setDocente(new Docente("docente 1", generarCodigo()));

        Contrato contrato2 = contratoInicial.clone();
        contrato2
        .setDocente(new Docente("docente 2", generarCodigo()));

        Contrato contrato3 = contratoInicial.clone();
        contrato3
        .setDocente(new Docente("docente 3", generarCodigo()));

        Contrato contrato4 = contratoInicial.clone();
        contrato4
        .setDocente(new Docente("docente 4", generarCodigo()));

        Contrato contrato5 = contratoInicial.clone();
        contrato5
        .setDocente(new Docente("docente 5", generarCodigo()));

        Contrato contrato6 = contratoInicial.clone();
        contrato6
        .setDocente(new Docente("docente 6", generarCodigo()));

        Contrato contrato7 = contratoInicial.clone();
        contrato7
        .setDocente(new Docente("docente 7", generarCodigo()));

        Contrato contrato8 = contratoInicial.clone();
        contrato8
        .setDocente(new Docente("docente 8", generarCodigo()));

        Contrato contrato9 = contratoInicial.clone();
        contrato9
        .setDocente(new Docente("docente 9", generarCodigo()));

        Contrato contrato10 = contratoInicial.clone();
        contrato10
        .setDocente(new Docente("docente 10", generarCodigo()));

        Contrato contrato11 = contratoInicial.clone();
        contrato11
        .setDocente(new Docente("docente 11", generarCodigo()));

        Contrato contrato12 = contratoInicial.clone();
        contrato12
        .setDocente(new Docente("docente 12", generarCodigo()));

        Contrato contrato13 = contratoInicial.clone();
        contrato13
        .setDocente(new Docente("docente 13", generarCodigo()));

        Contrato contrato14 = contratoInicial.clone();
        contrato14
        .setDocente(new Docente("docente 14", generarCodigo()));

        Contrato contrato15 = contratoInicial.clone();
        contrato15
        .setDocente(new Docente("docente 15", generarCodigo()));

        contrato1.showInfo();
        contrato2.showInfo();
        contrato3.showInfo();
        contrato4.showInfo();
        contrato5.showInfo();
        contrato6.showInfo();
        contrato7.showInfo();
        contrato8.showInfo();
        contrato9.showInfo();
        contrato10.showInfo();
        contrato11.showInfo();
        contrato12.showInfo();
        contrato13.showInfo();
        contrato14.showInfo();
        contrato15.showInfo();
    }

    public static int generarCodigo(){
        return (int)(Math.random()*100000);
    }
}
