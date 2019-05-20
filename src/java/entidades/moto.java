package entidades;

public class moto extends vehiculo{
    private boolean rompeViento;

    public String isRompeViento() {
        String rompeVientoSioNo= "";
    
        if (rompeViento){
            //Devovler si
             rompeVientoSioNo = "SI";
        } else {
            //Devolver NO
            rompeVientoSioNo = "NO";

        }
        return rompeVientoSioNo;
    }

    public void setRompeViento(boolean rompeViento) {
        this.rompeViento = rompeViento;
    }
    
    
}
    