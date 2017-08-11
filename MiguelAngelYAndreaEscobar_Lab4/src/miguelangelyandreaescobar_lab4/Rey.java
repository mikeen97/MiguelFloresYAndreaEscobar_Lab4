package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Rey extends Pieza {

    public Rey() {
    }

    public Rey(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) {
        int move = 1;
        return move;
    }

}
