package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Duende extends Pieza{

    public Duende() {
    }

    public Duende(Color color, String material) {
        super(color, material);
    }

    @Override
    public boolean movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) {
        Pieza x = new EspacioBlanco();
        if (color == Color.BLACK) {
            if (matriz[moverx][movery] == x) {
          
            }
        }
        else if (color == Color.BLACK) {
            if (true ) {
                
            }
        }
        return true;
    }
    
    
}

