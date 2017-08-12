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
    public int movimiento(Pieza [][]matriz, int posx, int posy, int moverx, int movery, Color color) throws Excepciones{
        Pieza e = new EspacioBlanco();
        int move=0;
        if (matriz[moverx][movery]!=e) {
            move = 2;
        }
        else{
            if (matriz[moverx][movery]==e) {
                move =1;
            }
        }
        return move;
    }

}
