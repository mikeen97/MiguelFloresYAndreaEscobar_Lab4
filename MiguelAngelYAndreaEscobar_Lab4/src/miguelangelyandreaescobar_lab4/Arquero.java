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
    public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) throws Excepciones {
        int move = 0;
        Pieza e = new EspacioBlanco();
        if ((moverx > 9 || movery > 9) || (moverx < 0 || movery < 0)) {
            throw new Excepciones("Fuera de tablero");
        } else {
            if (matriz[posx][posy].getColor() == Color.BLACK) {
                if (matriz[moverx][movery]== e) {
                    if (true) {
                        
                    }
                }
                else{
                    if (matriz[moverx][movery]!=e) {
                        if (matriz[moverx][movery].getColor() == Color.BLACK) {
                            move =2;
                        }
                        else{
                            move = 3;
                        }
                    }
                }
            }
        }
        return move;
    }

}
