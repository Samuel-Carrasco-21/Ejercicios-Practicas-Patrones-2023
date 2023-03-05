package practicaSegundoParcial.Ejercicio3;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Tienda t1 = new Tienda();
        Tienda t2 = new Tienda();

        Vector<Celulares> cv1 = new Vector<>();
        Vector<Celulares> cv2 = new Vector<>();

        for(int i=0;i<10;i++){
            if((int)(Math.random()*10)>5){
                Celulares cx1 = generarCelularHuawei();
                cx1.setModelo("X11");
                cv1.add(cx1);
            }else{
                Celulares cy1 = generarCelularHuawei();
                cy1.setModelo("Y11");
                cv1.add(cy1);
            }
        }

        for(int i=0;i<10;i++){
            if((int)(Math.random()*10)>5){
                Celulares cx1 = generarCelularHuawei();
                cx1.setModelo("X11");
                cv2.add(cx1);
            }else{
                Celulares cy1 = generarCelularHuawei();
                cy1.setModelo("Y11");
                cv2.add(cy1);
            }
        }

        // tienda 1
        t1.setCantidadCelulares(10);
        t1.setDescripcion("Tienda especial 1");
        t1.setTienda(cv1);

        t1.execute(5,
        "precio",
        "X11", 
        299);

        t1.execute(5,
        "precio - modelo",
        "X11", 
        299);

        t1.execute(5,
        "modelo",
        "X11", 
        299);

        // tienda 2
        t2.setCantidadCelulares(10);
        t2.setDescripcion("Tienda especial 2");
        t2.setTienda(cv2);

        t2.execute(15,
        "precio",
        "Y11", 
        299);

        t2.execute(15,
        "precio - modelo",
        "Y11", 
        299);

        t2.execute(15,
        "modelo",
        "Y11", 
        299);

    }

    public static Celulares generarCelularSamsung(){
        Celulares c1 = new Celulares("X"+(int)(Math.random()*1000),
        "Samsung",
        "media",
        (int)(Math.random()*1000));
        return c1;
    }

    public static Celulares generarCelularHuawei(){
        Celulares c1 = new Celulares("Y"+(int)(Math.random()*1000),
        "Huawei",
        "media",
        (int)(Math.random()*1000));
        return c1;
    }
}
