package miguelangelyandreaescobar_lab4;

import java.awt.Color;


public class Dragon extends Pieza {

    public Dragon() {
    }

    public Dragon(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "F";
    }

    @Override
        public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) {
            return 1;
    }
    
}
