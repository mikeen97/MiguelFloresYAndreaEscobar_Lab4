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
    public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) throws Excepciones{
        Pieza x = new EspacioBlanco();
        int move = 0;
        if (matriz[posx][posy].getColor() == Color.BLACK) {
            if (matriz[moverx][movery] == x) {
                if (matriz[moverx][movery] != x) {
                    move = 3;//Comer
                }
                move = 1;//avanzar
            } else {
                move = 2;//No se puede mover
            }
        } else if (matriz[posx][posy].getColor() == Color.WHITE) {
            if (matriz[moverx][movery] == x) {
                if (matriz[moverx][movery] != x) {
                    move = 3;//Comer
                }
                move = 1;//Avanzar
            } else {
                move = 2;//No se puede mover
            }
        }
        return move;

    }

}
