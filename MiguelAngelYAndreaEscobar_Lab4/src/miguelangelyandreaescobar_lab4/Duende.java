package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Duende extends Pieza {

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
    public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) {
        Pieza x = new EspacioBlanco();
        int move = 0;
        if (color == Color.BLACK) {
            if (matriz[moverx][movery] == x) {
                move = 1;
            } else {
                move = 2;
            }
        } else if (color == Color.WHITE) {
            if (matriz[moverx][movery] == x) {
                move = 1;
            } else {
                move = 2;
            }
        }
        return move;

    }

}
