package miguelangelyandreaescobar_lab4;

import java.awt.Color;

public abstract class Pieza {
   private Color color;
   private String material;

    public  Pieza() {
    }

    public Pieza(Color color, String material) {
        this.color = color;
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Pieza{" + "color=" + color + ", material=" + material + '}';
    }
    public abstract int movimiento(Pieza[][] matriz, int posx, int posy, int moverx, int movery, Color color) throws Excepciones;
}
