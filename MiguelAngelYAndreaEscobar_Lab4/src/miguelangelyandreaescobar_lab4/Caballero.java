package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Caballero extends Pieza {

    public Caballero(Color color, String material) {
        super(color, material);
    }

    public Caballero() {
    }

    @Override
    public boolean movimiento(String matriz, int posx, int posy, int moverx, int movery) {
        for (int i = 0; i < matriz.length(); i++) {
            for (int j = 0; j < matriz.length(); j++) {
                if (posx == 1) {

                }

            }
        }
        return true;
    }

}
