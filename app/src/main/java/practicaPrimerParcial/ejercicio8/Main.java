package practicaPrimerParcial.ejercicio8;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread s1 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroCreditos cajeroCreditos = new CajeroCreditos(new Cliente("cliente 1"));
                cajeroCreditos.realizarPrestamo(3000);
            }
        });

        Thread s2 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroVivienda cajeroVivienda = new CajeroVivienda(new Cliente("cliente 2"));
                cajeroVivienda.realizarPrestamo(4000);
            }
        });

        Thread s3 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroNegocios cajeroNegocios = new CajeroNegocios(new Cliente("cliente 3"));
                cajeroNegocios.realizarPrestamo(2000);
            }
        });

        Thread s4 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroFinanciamiento cajeroFinanciamiento = new CajeroFinanciamiento(new Cliente("cliente 4"));
                cajeroFinanciamiento.realizarPrestamo(1000);
            }
        });

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        Thread.sleep(1000);
        CuentaFondos.getInstance().showEstado();
    }
}
