package practicaTercerParcial.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ITransferencia t1 = 
        new TransBancaria(
            1391,
            "Bisa",
            0.95);

        ITransferencia t2 =
        new TigoMoney(
            "Debito",
            10.9,
            0.98);

        ITransferencia t3 =
        new AppEmpresa(
            "Alchemax",
            8.1,
            0.90);

        ///////////////////////////////

        InsAgua i1 = 
        new InsAgua(
            91,
            9143.00,
            t1);

        InsAlcantarillado i2 =
        new InsAlcantarillado(
            21,
            "Samsung",
            1384.00,
            t2);

        InsElectrica i3 =
        new InsElectrica(
            "Joshep",
            39,
            4918.00,
            t3);

        ///////////////////
        System.out.println("\n<><><><><><><><><><><><>");
        i1.showInstalacion();
        i2.showInstalacion();
        i3.showInstalacion();
        System.out.println("\n<><><><><><><><><><><><>");
        i1.aplicarDescuento();
        i2.aplicarDescuento();
        i3.aplicarDescuento();
        System.out.println("\n<><><><><><><><><><><><>");
        i1.showInstalacion();
        i2.showInstalacion();
        i3.showInstalacion();

    }
}
