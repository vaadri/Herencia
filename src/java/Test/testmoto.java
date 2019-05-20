package Test;

import entidades.moto;

public class testmoto {
    public static void main(String[] args) {
        System.out.println("[...] Test moto");
        moto mimoto = new moto();
        mimoto.color="Rojo";
        mimoto.marca="Yamaha";
        mimoto.modelo="FZ";
        mimoto.precio=50000;
        mimoto.setRompeViento(true);
        
        
        System.out.println("[...] Imprimierdo moto atributo por atributo");
        System.out.println(mimoto.color + " " + mimoto.marca + " " + mimoto.modelo + " " + mimoto.precio + " " + mimoto.isRompeViento());
        System.out.println("[OK] Imprimierdo moto atributo por atributo");
        
        System.out.println("[...] Imprimiendo dato de moto (objeto)");
        System.out.println(mimoto);
        System.out.println("[OK] Imprimiendo dato de moto (objeto)");
        
        System.out.println("[OK]");
    }
    
}
