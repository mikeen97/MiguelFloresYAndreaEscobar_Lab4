/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelyandreaescobar_lab4;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Flores
 */
public class MiguelAngelYAndreaEscobar_Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Excepciones {
        String opcion = "";
        ArrayList<Jugador> ListJugadores = new ArrayList();
        Pieza a = new Arquero();
        Pieza m = new Mago();
        Pieza d = new Duende();
        Pieza r = new Rey();
        Pieza e = new EspacioBlanco();
        Pieza f = new Dragon();
        Pieza c = new Caballero();
        int posx, posy;
        while (!opcion.equalsIgnoreCase("f")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Agregar Jugador \n"
                    + "b- Eliminar Jugador\n"
                    + "c- Listar Jugador\n"
                    + "d- Modificar Jugador\n"
                    + "e- Jugar \n"
                    + "f- Salir \n");
            if (opcion.equals("a")) {
                String nombre = "", lugarNacimiento = "", username = "", contrasena = "", sexo = "";
                int edad = 0, punto = 0;
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del Jugador");
                username = JOptionPane.showInputDialog("Ingrese el usuario de la persona");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del Jugador"));
                lugarNacimiento = JOptionPane.showInputDialog("Ingrese lugar de nacimiento del Jugador");
                lugarNacimiento = JOptionPane.showInputDialog("Ingrese sexo del Jugador");
                ListJugadores.add(new Jugador(nombre, username, punto, lugarNacimiento, edad, sexo));
            }
            if (opcion.equals("b")) {
                int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Posicion de Jugador a Eliminar"));
                ListJugadores.remove(p);
            }
            if (opcion.equals("c")) {
                String p1 = "";
                for (Jugador t1 : ListJugadores) {
                    if (t1 instanceof Jugador) {
                        p1 += ListJugadores.indexOf(t1) + " " + ((Jugador) t1) + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, p1);
            }
            if (opcion.equals("d")) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la Posicion del Jugador a modificar: "));
                String nombre = "", lugarNacimiento = "", username = "", sexo = "";
                int edad = 0;
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
                sexo = JOptionPane.showInputDialog("Ingrese el sexo del Jugador");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del usuario"));
                lugarNacimiento = JOptionPane.showInputDialog("Ingrese lugar de nacimiento del usuario");
                username = JOptionPane.showInputDialog("Ingrese el usuario de la persona");
                ListJugadores.get(pos).setEdad(edad);
                ListJugadores.get(pos).setLugarNacimiento(lugarNacimiento);
                ListJugadores.get(pos).setName(nombre);
                ListJugadores.get(pos).setPuntos(0);
                ListJugadores.get(pos).setSexo(opcion);
                ListJugadores.get(pos).setUsername(username);
            }
            if (opcion.equalsIgnoreCase("e")) {
                JOptionPane.showMessageDialog(null, "BIENVENIDO AL JUEGO");
                boolean vive = true;
                Pieza tablero[][] = new Pieza[10][10];
                tablero(tablero);
                while (vive == true) {
                    System.out.println("");
                    imprimir(tablero);
                    posx = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion X de la pieza que desea mover"));
                    posy = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion Y de la pieza que desea mover"));
                    int movex = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicioneeeee de la pieza que desea mover"));
                    int movey = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicioneeee de la pieza que desea mover"));
                    JOptionPane.showConfirmDialog(null, d.movimiento(tablero, posx, posy, movex, movey, Color.BLACK));
                    JOptionPane.showConfirmDialog(null, "Pos inicial" + tablero[posx][posy]);
                    JOptionPane.showConfirmDialog(null, "Pos nueva" + tablero[movex][movey]);
                    if (tablero[posx][posy].equals(d)) {
                        if (d.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 1) {
                            System.out.println("entro if 1");
                            tablero[posx][posy] = new Duende();
                            tablero[movex][movey] = d;
                        }
                        if (d.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 2) {
                            System.out.println("entro if 2");
                            JOptionPane.showMessageDialog(null, "No se puede mover");
                        }
                        if (d.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 3) {

                        }
                    }
                    if (tablero[posx][posy].equals(c)) {
                        c.movimiento(tablero, posx, posy, movex, movey, Color.BLACK);
                        if (c.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 1) {
                            System.out.println("entro if 1");
                            tablero[posx][posy] = e;
                            tablero[movex][movey] = d;

                        }
                        if (c.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 2) {
                            System.out.println("entro if 2");
                            JOptionPane.showMessageDialog(null, "No se puede mover");

                        }
                        if (c.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 3) {

                        }
                    }
                    if (tablero[posx][posy].equals(f)) {
                        f.movimiento(tablero, posx, posy, movex, movey, Color.BLACK);
                        if (f.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 1) {
                            tablero[posx][posy] = e;
                            tablero[movex][movey] = d;

                        }
                        if (f.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 2) {
                            JOptionPane.showMessageDialog(null, "No se puede mover");

                        }
                        if (f.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 3) {

                        }
                    }
                    if (tablero[posx][posy].equals(m)) {
                        m.movimiento(tablero, posx, posy, movex, movey, Color.BLACK);
                        if (m.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 1) {
                            tablero[posx][posy] = e;
                            tablero[movex][movey] = d;

                        }
                        if (m.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 2) {
                            JOptionPane.showMessageDialog(null, "No se puede mover");

                        }
                        if (m.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 3) {

                        }
                    }
                    if (tablero[posx][posy].equals(r)) {
                        r.movimiento(tablero, posx, posy, movex, movey, Color.BLACK);
                        if (r.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 1) {
                            tablero[posx][posy] = e;
                            tablero[movex][movey] = d;

                        }
                        if (r.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 2) {
                            JOptionPane.showMessageDialog(null, "No se puede mover");

                        }
                        if (r.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 3) {

                        }
                    }
                    if (tablero[posx][posy].equals(a)) {
                        a.movimiento(tablero, posx, posy, movex, movey, Color.BLACK);
                        if (a.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 1) {
                            tablero[posx][posy] = e;
                            tablero[movex][movey] = d;
                        }
                        if (a.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 2) {
                            JOptionPane.showMessageDialog(null, "No se puede mover");
                        }
                        if (a.movimiento(tablero, posx, posy, movex, movey, Color.BLACK) == 3) {

                        }
                    }
                }

            }

        }
    }

    public static void tablero(Pieza x[][]) {
        String material_Player1 = "", material_Player2 = "";
        material_Player1 = JOptionPane.showInputDialog("Ingrese el material del jugador 1");
        material_Player2 = JOptionPane.showInputDialog("Ingrese el material del jugador 2");
        x[0][0] = new Caballero(Color.BLACK, material_Player1);
        x[0][1] = new EspacioBlanco();
        x[0][2] = new Dragon(Color.BLACK, material_Player1);
        x[0][3] = new Arquero(Color.BLACK, material_Player1);
        x[0][4] = new Rey(Color.BLACK, material_Player1);
        x[0][5] = new Mago(Color.BLACK, material_Player1);
        x[0][6] = new Arquero(Color.BLACK, material_Player1);
        x[0][7] = new Dragon(Color.BLACK, material_Player1);
        x[0][8] = new EspacioBlanco();
        x[0][9] = new Caballero(Color.BLACK, material_Player1);
        x[1][0] = new Dragon(Color.BLACK, material_Player1);
        x[1][1] = new EspacioBlanco();
        x[1][2] = new Arquero(Color.BLACK, material_Player1);
        x[1][3] = new Duende(Color.BLACK, material_Player1);
        x[1][4] = new Caballero(Color.BLACK, material_Player1);
        x[1][5] = new Dragon(Color.BLACK, material_Player1);
        x[1][6] = new Duende(Color.BLACK, material_Player1);
        x[1][7] = new Arquero(Color.BLACK, material_Player1);
        x[1][8] = new EspacioBlanco();
        x[1][9] = new Duende(Color.BLACK, material_Player1);
        for (int i = 2; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                x[i][j] = new EspacioBlanco();
            }
        }
        x[8][0] = new Duende(Color.BLACK, material_Player2);
        x[8][1] = new EspacioBlanco();
        x[8][2] = new Arquero(Color.BLACK, material_Player2);
        x[8][3] = new Duende(Color.BLACK, material_Player2);
        x[8][4] = new Dragon(Color.BLACK, material_Player2);
        x[8][5] = new Caballero(Color.BLACK, material_Player2);
        x[8][6] = new Duende(Color.BLACK, material_Player2);
        x[8][7] = new Arquero(Color.BLACK, material_Player2);
        x[8][8] = new EspacioBlanco();
        x[8][9] = new Duende(Color.BLACK, material_Player2);
        x[9][0] = new Caballero(Color.BLACK, material_Player2);
        x[9][1] = new EspacioBlanco();
        x[9][2] = new Dragon(Color.BLACK, material_Player2);
        x[9][3] = new Arquero(Color.BLACK, material_Player2);
        x[9][4] = new Mago(Color.BLACK, material_Player2);
        x[9][5] = new Rey(Color.BLACK, material_Player2);
        x[9][6] = new Arquero(Color.BLACK, material_Player2);
        x[9][7] = new Dragon(Color.BLACK, material_Player2);
        x[9][8] = new EspacioBlanco();
        x[9][9] = new Caballero(Color.BLACK, material_Player2);
    }

    public static void imprimir(Pieza[][] x) {
        String matriz[][] = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = x[i][j].toString();
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println("");
        }
    }

}
