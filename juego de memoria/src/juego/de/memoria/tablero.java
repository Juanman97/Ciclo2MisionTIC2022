/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.de.memoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author JuanManuel
 */
public class tablero {

    ArrayList<Integer> cartasDesorden;
    ArrayList<String> lineasCartasDesorden;
    ArrayList<String> lineasCartasBack;
    ArrayList<String> lineasCartasBackTemp;
    String linea1 = " ------" + "    " + "  ------" + "    " + "  ------" + "    " + "  ------";
    String linea2 = "\n|      |" + "    " + "|      |" + "    " + "|      |" + "    " + "|      |";
    String linea3;
    String linea4;
    String linea5 = "\n|      |" + "    " + "|      |" + "    " + "|      |" + "    " + "|      |";
    String linea6 = "\n ------" + "    " + "  ------" + "    " + "  ------" + "    " + "  ------";
    String linea7;
    String linea8;
    String linea3Temp = "\n";
    String linea4Temp = "\n";
    String linea7Temp = "\n";
    String linea8Temp = "\n";
    int p1 = -1;
    int p2 = -1;
    int numParejas = 0;
    
    public tablero() {
        cartasDesorden = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        lineasCartasDesorden = new ArrayList<>(Arrays.asList("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
        lineasCartasBack = new ArrayList<>(Arrays.asList("|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ",
                "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ",
                "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    "));
        lineasCartasBackTemp = new ArrayList<>(Arrays.asList("|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ",
                "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ",
                "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    ", "|      |" + "    "));
        defLineas();
        setCartasDefault();
    }

    protected void defLineas() {
        linea3 = "\n" + lineasCartasBack.get(0) + lineasCartasBack.get(2) + lineasCartasBack.get(4) + lineasCartasBack.get(6);
        linea4 = "\n" + lineasCartasBack.get(1) + lineasCartasBack.get(3) + lineasCartasBack.get(5) + lineasCartasBack.get(7);
        linea7 = "\n" + lineasCartasBack.get(8) + lineasCartasBack.get(10) + lineasCartasBack.get(12) + lineasCartasBack.get(14);
        linea8 = "\n" + lineasCartasBack.get(9) + lineasCartasBack.get(11) + lineasCartasBack.get(13) + lineasCartasBack.get(15);
    }

    private void defLineasTemp() {
        linea3Temp = "\n" + lineasCartasBackTemp.get(0) + lineasCartasBackTemp.get(2) + lineasCartasBackTemp.get(4) + lineasCartasBackTemp.get(6);
        linea4Temp = "\n" + lineasCartasBackTemp.get(1) + lineasCartasBackTemp.get(3) + lineasCartasBackTemp.get(5) + lineasCartasBackTemp.get(7);
        linea7Temp = "\n" + lineasCartasBackTemp.get(8) + lineasCartasBackTemp.get(10) + lineasCartasBackTemp.get(12) + lineasCartasBackTemp.get(14);
        linea8Temp = "\n" + lineasCartasBackTemp.get(9) + lineasCartasBackTemp.get(11) + lineasCartasBackTemp.get(13) + lineasCartasBackTemp.get(15);
    }

    public void Imprimir() {
        System.out.println("   0           1           2           3");
        //System.out.println("    0       1       2       3");
        System.out.println(linea1 + linea2 + linea3 + linea4 + linea5 + linea6);
        System.out.println("   4           5           6           7");
        System.out.println(linea1 + linea2 + linea7 + linea8 + linea5 + linea6);
    }

    private void setCartasDefault() {
        Collections.shuffle(cartasDesorden);
        int cont = 0;
        int c = 0;
        for (int i : cartasDesorden) {

            if (cont <= 3) {
                if (i == 0 || i == 1) {
                    lineasCartasDesorden.set(c, "|  /\\  |" + "    ");
                    lineasCartasDesorden.set(c + 1, "|  \\/  |" + "    ");
                    //linea3 += lineasCartasDesorden.get(c);
                    //linea4 += lineasCartasDesorden.get(c+1);
                } else if (i == 2 || i == 3) {
                    lineasCartasDesorden.set(c, "| ==== |" + "    ");
                    lineasCartasDesorden.set(c + 1, "| ==== |" + "    ");
                    //linea3 += lineasCartasDesorden.get(c);
                    //linea4 += lineasCartasDesorden.get(c+1);
                } else if (i == 4 || i == 5) {
                    lineasCartasDesorden.set(c, "|  \\/  |" + "    ");
                    lineasCartasDesorden.set(c + 1, "|  /\\  |" + "    ");
                    //linea3 += lineasCartasDesorden.get(c);
                    //linea4 += lineasCartasDesorden.get(c+1);
                } else if (i == 6 || i == 7) {
                    lineasCartasDesorden.set(c, "| :db: |" + "    ");
                    lineasCartasDesorden.set(c + 1, "| :qp: |" + "    ");
                    //linea3 += lineasCartasDesorden.get(c);
                    //linea4 += lineasCartasDesorden.get(c+1);
                }
            } else {
                if (i == 0 || i == 1) {
                    lineasCartasDesorden.set(c, "|  /\\  |" + "    ");
                    lineasCartasDesorden.set(c + 1, "|  \\/  |" + "    ");
                    //linea7 += lineasCartasDesorden.get(c);
                    //linea8 += lineasCartasDesorden.get(c+1);
                } else if (i == 2 || i == 3) {
                    lineasCartasDesorden.set(c, "| ==== |" + "    ");
                    lineasCartasDesorden.set(c + 1, "| ==== |" + "    ");
                    //linea7 += lineasCartasDesorden.get(c);
                    //linea8 += lineasCartasDesorden.get(c+1);
                } else if (i == 4 || i == 5) {
                    lineasCartasDesorden.set(c, "|  \\/  |" + "    ");
                    lineasCartasDesorden.set(c + 1, "|  /\\  |" + "    ");
                    //linea7 += lineasCartasDesorden.get(c);
                    //linea8 += lineasCartasDesorden.get(c+1);
                } else if (i == 6 || i == 7) {
                    lineasCartasDesorden.set(c, "| :db: |" + "    ");
                    lineasCartasDesorden.set(c + 1, "| :qp: |" + "    ");
                    //linea7 += lineasCartasDesorden.get(c);
                    //linea8 += lineasCartasDesorden.get(c+1);
                }
            }
            cont++;
            c += 2;
        }
    }

    protected void voltearCarta(int x) {
        int contPares = 0;
        int val1 = 0;
        int val2 = 0;
        for (int j = 0; j < 16; j++) {
            if (x == 0) {
                val1 = 0;
                val2 = 1;
                break;
            } else if (j % 2 == 0) {
                contPares++;
            }
            if (contPares - 1 == x) {
                val1 = j;
                val2 = j + 1;
                break;
            }
        }
        lineasCartasBackTemp.set(val1, lineasCartasDesorden.get(val1));
        lineasCartasBackTemp.set(val2, lineasCartasDesorden.get(val2));

        if (p1 == -1) {
            p1 = val1;
        } else {
            p2 = val1;
        }

        defLineasTemp();
        System.out.println("   0           1           2           3");
        System.out.println(linea1 + linea2 + linea3Temp + linea4Temp + linea5 + linea6);
        System.out.println("   4           5           6           7");
        System.out.println(linea1 + linea2 + linea7Temp + linea8Temp + linea5 + linea6);
    }

    protected void verificarPareja() {
        if (lineasCartasBackTemp.get(p1).equals(lineasCartasBackTemp.get(p2))) {
            lineasCartasBack.set(p1, lineasCartasBackTemp.get(p1));
            lineasCartasBack.set((p1 + 1), lineasCartasBackTemp.get(p1 + 1));

            lineasCartasBack.set(p2, lineasCartasBackTemp.get(p2));
            lineasCartasBack.set((p2 + 1), lineasCartasBackTemp.get(p2 + 1));
            System.out.println("Pareja encontrada!");
            defLineas();
            numParejas+=1;
        }else{
        lineasCartasBackTemp.set(p1, "|      |" + "    ");
        lineasCartasBackTemp.set((p1 + 1), "|      |" + "    ");
        lineasCartasBackTemp.set(p2, "|      |" + "    ");
        lineasCartasBackTemp.set((p2 + 1), "|      |" + "    ");
        System.out.println("Pareja no encontrada. Siga intentando.");
        defLineasTemp();
        }
        p1 = -1;
        p2 = -1;
    }
    
    protected boolean finalJuego(){
        boolean fin = false;
        if (numParejas==4){
            fin = true;
        }
        return fin;
    }

}
