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
    public static void main(String[] args) {
        String opcion = "";
        ArrayList<Jugador> ListJugadores = new ArrayList();
        while (!opcion.equalsIgnoreCase("f")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Agregar Jugador \n"
                    + "b- Eliminar Jugador\n"
                    + "c- Listar Jugador\n"
                    + "d- Modificar Jugador\n"
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

        }
    }

    public static void tablero(Pieza x[][]) {
        String material_Player1 = "", material_Player2 = "";
        material_Player1 = JOptionPane.showInputDialog("Ingrese el material del jugador 1");
        material_Player2 = JOptionPane.showInputDialog("Ingrese el material del jugador 2");
        x[0][0] = new Caballero(Color.BLACK, material_Player1);
        x[0][1] = new EspacioBlanco();
        x[0][2] = new Dragon();
        x[0][3] = "()";
        x[0][4] = "()";
        x[0][5] = "()";
        x[0][6] = "()";
        x[0][7] = "()";
        x[0][8] = "()";
        x[0][9] = "()";
        x[1][0] = "()";
        x[1][1] = "()";
        x[1][2] = "()";
        x[1][3] = "()";
        x[1][4] = "()";
        x[1][5] = "()";
        x[1][6] = "()";
        x[1][7] = "()";
        x[1][8] = "()";
        x[1][9] = "()";
        x[2][0] = "()";
        x[2][1] = "()";
        x[2][2] = "()";
        x[2][3] = "()";
        x[2][4] = "()";
        x[2][5] = "()";
        x[2][6] = "()";
        x[2][7] = "()";
        x[2][8] = "()";
        x[2][9] = "()";
        x[3][0] = "()";
        x[3][1] = "()";
        x[3][2] = "()";
        x[3][3] = "()";
        x[3][4] = "()";
        x[3][5] = "()";
        x[3][6] = "()";
        x[3][7] = "()";
        x[3][8] = "()";
        x[3][9] = "()";
        x[4][0] = "()";
        x[4][1] = "()";
        x[4][2] = "()";
        x[4][3] = "()";
        x[4][4] = "()";
        x[4][5] = "()";
        x[4][6] = "()";
        x[4][7] = "()";
        x[4][8] = "()";
        x[4][9] = "()";
        x[5][0] = "()";
        x[5][1] = "()";
        x[5][2] = "()";
        x[5][3] = "()";
        x[5][4] = "()";
        x[5][5] = "()";
        x[5][6] = "()";
        x[5][7] = "()";
        x[5][8] = "()";
        x[5][9] = "()";
        x[6][0] = "()";
        x[6][1] = "()";
        x[6][2] = "()";
        x[6][3] = "()";
        x[6][4] = "()";
        x[6][5] = "()";
        x[6][6] = "()";
        x[6][7] = "()";
        x[6][8] = "()";
        x[6][9] = "()";
        x[7][0] = "()";
        x[7][1] = "()";
        x[7][2] = "()";
        x[7][3] = "()";
        x[7][4] = "()";
        x[7][5] = "()";
        x[7][6] = "()";
        x[7][7] = "()";
        x[7][8] = "()";
        x[7][9] = "()";
        x[7][0] = "()";
        x[7][0] = "()";
        x[7][0] = "()";
        x[7][0] = "()";
    }
}
