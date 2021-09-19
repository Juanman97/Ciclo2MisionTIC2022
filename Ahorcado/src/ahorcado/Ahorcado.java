/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JuanManuel
 */
public class Ahorcado {
    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Jugador 1, ingrese su nombre: ");
        String nombre1 = sc.nextLine();
        jugador j1 = new jugador(nombre1);
        System.out.print("Jugador 2, ingrese su nombre: ");
        String nombre2 = sc.nextLine();
        jugador j2 = new jugador(nombre2);
        System.out.print("Jugador 1, ingrese la frase: ");
        String frase1 = sc.nextLine();
        tablero t = new tablero(frase1, j1, j2);
        System.out.println(t.imprimirTablero());
        boolean fin = false;
        boolean sigue;
        int error = 1;
        ArrayList<String> yaDichas = new ArrayList<>();
        while (true) {
            System.out.print("Jugador 2, ingrese la letra: ");
            String letra = sc.nextLine();
            if (yaDichas.contains(letra)) {
                System.out.println("Esta letra ya la ingresó.");
            } else {
                yaDichas.add(letra);
                sigue = t.verificarLetra(letra);
                List<String> paraVerif = Arrays.asList(t.tablero0);
                if (!sigue) {
                    fin = j2.figura(error);
                    error++;
                }
                if (fin == true) {
                    System.out.println("El jugador 2 ha sido ahorcado. " + j2.nombre + " ha perdido el juego.");
                    break;
                } else if (!paraVerif.contains("_")) {
                    System.out.println("El jugador 2 ha descubierto la palabra. " + j2.nombre + " ha ganado!!!");
                    break;
                }
            }
        }
    }
}
