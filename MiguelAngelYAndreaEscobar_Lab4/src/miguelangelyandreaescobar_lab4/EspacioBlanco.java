/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelyandreaescobar_lab4;

import java.awt.Color;

/**
 *
 * @author Miguel Flores
 */
public class EspacioBlanco extends Pieza {

    public EspacioBlanco() {
    }

    @Override
    public String toString() {
        return " ";
    }

    @Override
    public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) {
        Pieza e = new EspacioBlanco();
        int move = 0;
        if (matriz[moverx][movery] != e) {
            move = 2;
        } else {
            if (matriz[moverx][movery] == e) {
                move = 1;
            }
        }
        return move;
    }

}
