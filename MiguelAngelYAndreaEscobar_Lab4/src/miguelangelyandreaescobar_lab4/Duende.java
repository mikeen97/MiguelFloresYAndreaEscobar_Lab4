package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Duende extends Pieza{

    public Duende() {
    }

    public Duende(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "D";
    }
    

    @Override
    public boolean movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) {
        Pieza x = new EspacioBlanco();
        boolean devolver= false;
        if (color == Color.BLACK) {
            if (matriz[moverx][movery] == x) {
                devolver= true;
            } else{
                devolver =false;
            }
        }
        else if (color == Color.BLACK) {
            if (matriz[moverx][movery] == x) {
                devolver=true;
            } else{
                devolver=false;
            }
        }
        return devolver;
    }
    
    
}

