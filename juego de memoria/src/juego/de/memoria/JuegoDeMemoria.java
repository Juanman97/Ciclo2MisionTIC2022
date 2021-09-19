/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.de.memoria;

import java.util.Scanner;

/**
 *
 * @author JuanManuel
 */
public class JuegoDeMemoria {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*System.out.println(" ------");
        System.out.println("|      |");
        System.out.println("|  /\\  |");
        System.out.println("|  \\/  |");
        System.out.println("|      |");
        System.out.println(" ------");
        String carta1 = " ------" + "\n|      |" + "\n|  /\\  |" + "\n|  \\/  |" + "\n|      |" + "\n ------";
        
        System.out.println(" ------");
        System.out.println("|      |");
        System.out.println("| ==== |");
        System.out.println("| ==== |");
        System.out.println("|      |");
        System.out.println(" ------");
        
        System.out.println(" ------");
        System.out.println("|      |");
        System.out.println("|  \\/  |");
        System.out.println("|  /\\  |");
        System.out.println("|      |");
        System.out.println(" ------");
        
        System.out.println(" ------");
        System.out.println("|      |");
        System.out.println("| :db: |");
        System.out.println("| :qp: |");
        System.out.println("|      |");
        System.out.println(" ------");
        
        String linea1 = " ------" + "    " + "  ------" + "    " + "  ------" + "    " + "  ------" +
                "\n|      |" + "    " + "|      |" + "    " + "|      |" + "    " + "|      |" +
                "\n|  /\\  |" + "    " + "|  /\\  |" + "    " + "|  /\\  |" + "    " + "|  /\\  |" +
                "\n|  \\/  |" + "    " + "|  \\/  |" + "    " + "|  \\/  |" + "    " + "|  \\/  |" +
                "\n|      |" + "    " + "|      |" + "    " + "|      |" + "    " + "|      |" +
                "\n ------" + "    " + "  ------" + "    " + "  ------" +  "    " + "  ------";
        //int rand = (int) (Math.random() * (8 - 1 + 1) + 1);
        System.out.println(linea1);*/
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        jugador j1 = new jugador(nombre);
        tablero t1 = new tablero();
        t1.Imprimir();
        boolean seguir = true;
        while (seguir == true) {
            System.out.println("Ingrese el número de la primera carta a girar");
            int c1 = Integer.parseInt(sc.nextLine());
            t1.voltearCarta(c1);
            System.out.println("Ingrese el número de la segunda carta a girar");
            int c2 = Integer.parseInt(sc.nextLine());
            t1.voltearCarta(c2);
            t1.verificarPareja();
            t1.Imprimir();
            boolean finalJuego = t1.finalJuego();
            if (finalJuego == true) {
                System.out.println("El juego ha terminado. Todas las parejas completadas. " + nombre + " ha ganado.");
                break;
            }
            System.out.println("Seguir jugando? (0=sí, otro número=no)");
            int pregunta = Integer.parseInt(sc.nextLine());
            if (pregunta == 0) {
                seguir = false;
            }
        }
    }
}
