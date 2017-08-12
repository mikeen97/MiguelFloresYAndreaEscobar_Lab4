package miguelangelyandreaescobar_lab4;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Rey extends Pieza {

    public Rey() {
    }

    public Rey(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) throws Excepciones {
        JOptionPane.showMessageDialog(null, "El Rey no se puede mover");
        int move = 2;
        return move;

    }

}
