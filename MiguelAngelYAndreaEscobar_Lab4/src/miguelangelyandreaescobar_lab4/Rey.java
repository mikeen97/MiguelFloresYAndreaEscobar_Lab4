package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Rey extends Pieza{

    public Rey() {
    }

    public Rey(Color color, String material) {
        super(color, material);
    }
     @Override
    public boolean movimiento(String matriz, int posx, int posy, int moverx, int movery, Color color) {
         return false;
    }
    
}
