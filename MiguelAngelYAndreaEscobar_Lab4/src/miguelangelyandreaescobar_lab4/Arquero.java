package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Arquero extends Pieza {

    public Arquero() {
    }

    public Arquero(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "A";
    }

    @Override
    public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) throws Excepciones{
        
    }

}
