package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Caballero extends Pieza {

    public Caballero(Color color, String material) {
        super(color, material);
    }

    public Caballero() {
    }

    @Override
    public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) {
        return 1;
    }

    @Override
    public String toString() {
        return "C";
    }

}
