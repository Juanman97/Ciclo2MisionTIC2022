/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triki;

import java.util.Scanner;

/**
 *
 * @author JuanManuel
 */
public class Triki {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        objetoTriki triki1 = new objetoTriki();
        triki1.imprimirMatriz();
        /*triki1.marcarCasilla("X", 0, 2);
        triki1.marcarCasilla("X", 1, 2);
        triki1.marcarCasilla("X", 2, 2);
        triki1.verificarCasilla(1, 2);
        triki1.verificarCasilla(1, 1);*/

        boolean p = false;
        while (p == false) {
            System.out.print("Jugador 1 inserte número de fila: ");
            int jugador1Fila = Integer.parseInt(sc.nextLine());
            System.out.print("Jugador 1 inserte número de columna: ");
            int jugador1Col = Integer.parseInt(sc.nextLine());
            triki1.marcarCasilla("X", jugador1Fila, jugador1Col);
            if (triki1.verificarGanador() == 'X') {
                System.out.println("El ganador es el jugador 1!!!");
                break;
            }
            if (triki1.verificarTrikiLLeno()==true){
                System.out.println("El tablero está lleno, es un empate.");
                break;
            }
            
            System.out.print("Jugador 2 inserte número de fila: ");
            int jugador2Fila = Integer.parseInt(sc.nextLine());
            System.out.print("Jugador 2 inserte número de columna: ");
            int jugador2Col = Integer.parseInt(sc.nextLine());
            triki1.marcarCasilla("O", jugador2Fila, jugador2Col);
            if (triki1.verificarGanador() == 'O') {
                System.out.println("El ganador es el jugador 2!!!");
                break;
            }
        }
    }
}
