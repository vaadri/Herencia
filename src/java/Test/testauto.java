package Test;

import entidades.auto;
import entidades.moto;

public class testauto {
    public static void main(String[] args) {
        System.out.println("   [...] Test auto");
        auto miauto = new auto();
        miauto.color = "Negro";
        miauto.marca = "Renault";
        miauto.modelo="Duster";
        miauto.precio=400000;
        miauto.puertas=5;
        
        moto mimoto = new moto();
        mimoto.color="Rojo";
        mimoto.marca="Yamaha";
        mimoto.modelo="FZ";
        mimoto.precio=50000;
        mimoto.setRompeViento(false);
        
        System.out.println("[...] Imprimiendo dato de auto (objeto)");
        System.out.println(miauto);
        System.out.println("[OK] Imprimiendo dato de auto (objeto)");
        
        System.out.println("[...] Imprimir atributo por atributo");
        System.out.println(miauto.color + " " + miauto.marca + " " + miauto.modelo + " " + miauto.precio + " " + miauto.puertas);
        System.out.println("[OK] Imprimir atributo por atributo");
        
        System.out.println("[...] Imprimierdo moto atributo por atributo");
        System.out.println(mimoto.color + " " + mimoto.marca + " " + mimoto.modelo + " " + mimoto.precio + " " + mimoto.isRompeViento());
        System.out.println("[OK] Imprimierdo moto atributo por atributo");
        
        System.out.println("[...] Imprimiendo dato de moto (objeto)");
        System.out.println(mimoto);
        System.out.println("[OK] Imprimiendo dato de moto (objeto)");
        
        System.out.println("   [OK]");
    }
}
