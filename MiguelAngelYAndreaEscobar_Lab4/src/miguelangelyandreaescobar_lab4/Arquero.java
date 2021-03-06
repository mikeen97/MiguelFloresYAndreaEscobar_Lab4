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
        int movimiento = 0, contx = 0, fin = 0, conty = 0;
        int pasos = posx - moverx;
        conty = posy - movery;
        int mx = posx - moverx, my = posy - movery;
        int mx1 = (int) Math.abs(mx);
        int my1 = (int) Math.abs(my);
        int cont = 0;
        if (mx1==my1) {
     
        }
        Pieza e = new EspacioBlanco();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (posx == moverx && fin == 0) {
                    if (i == posx && j == posy) {
                        while (contx < pasos && fin == 0) {
                            if (matriz[posx + contx][posy] == e) {
                                movimiento = 1;//Avanza;
                                fin = 1;
                            }
                            contx++;
                        }
                        while (contx < pasos && fin == 0) {
                            if (matriz[posx + contx][posy] != e) {
                                movimiento = 2;//No Avanza;
                                fin = 1;
                            }
                            contx++;
                        }
                    }
                    if (fin == 0) {
                        movimiento = 3;//No Avanza;
                        fin = 1;
                    }
                }
                if (posy == movery && fin == 0) {
                    if (i == posx && j == posy) {
                        while (conty < pasos && fin == 0) {
                            if (matriz[posx][posy + conty] == e) {
                                movimiento = 1;//Avanza;
                                fin = 1;
                            }
                            conty++;
                        }
                        while (conty < pasos && fin == 0) {
                            if (matriz[posx][posy + conty] != e) {
                                movimiento = 2;//No Avanza;
                                fin = 1;
                            }
                            conty++;
                        }
                    }
                    if (fin == 0) {
                        movimiento = 3;//No Avanza;
                        fin = 1;
                    }
                }

            }
        }

        return movimiento;

    }

}
