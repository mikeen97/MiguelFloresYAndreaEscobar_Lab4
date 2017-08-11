package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Mago extends Pieza {

    public Mago() {
    }

    public Mago(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "M";
    }

    @Override
    public int movimiento(Pieza [][]matriz, int posx, int posy, int moverx, int movery, Color color) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
