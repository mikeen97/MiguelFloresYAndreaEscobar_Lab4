package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public class Dragon extends Pieza {

    public Dragon() {
    }

    public Dragon(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "F";
    }

    @Override
    public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) throws Excepciones {
        Pieza e = new EspacioBlanco();
        //my = mover en x
        //mover en x 1 = mover en x
        //mover en y 1 = mover en y
        int mx = posx - moverx, my = posy - movery;
        int mx1 = (int) Math.abs(mx);
        int my1 = (int) Math.abs(my);
        int cont = 0, pasos = mx1;
        if ((moverx > 9 || movery > 9) || (moverx < 0 || movery < 0)) {
            throw new Excepciones("Fuera de tablero");
        }
        if (matriz[posx][posy].getColor() == (Color.BLACK)) {
            if (mx1 == my1) {//Verifico que sea diagonal
                if (mx < 0) {//Izquierda
                    if (my < 0) {//abajo

                    } else {

                    }
                    while (cont < mx1) {

                    }
                }
                if (mx > 0) {//Derecha
                    while (cont < mx1) {

                    }
                }

            }
        }
    }

}
