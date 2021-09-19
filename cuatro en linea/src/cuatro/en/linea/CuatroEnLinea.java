/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro.en.linea;

import java.util.Scanner;

/**
 *
 * @author JuanManuel
 */
public class CuatroEnLinea {
    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Ingrese el nombre del jugador 1: ");
        String nombre1 = sc.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        String nombre2 = sc.nextLine();
        jugador j1 = new jugador(nombre1);
        jugador j2 = new jugador(nombre2);
        tablero t1 = new tablero(j1, j2);
        t1.imprimirTablero();
        
        
        while (!t1.ganador("X") && !t1.ganador("O")){
            System.out.print("Juador 1, ingrese el número de columna para meter una ficha: ");
            int ficha1 = Integer.parseInt(sc.nextLine());
            if (ficha1>6){
                ficha1 = 6;
            }else if (ficha1 < 0){
                ficha1 = 0;
            }
            j1.setColumna(ficha1);
            t1.insertarFicha("X", j1.columna);
            if (t1.ganador("X")){
                System.out.println("El jugador 1 ha ganado. Felicidades " + j1.nombre + "!!!");
                break;
            }
            
            System.out.print("Juador 2, ingrese el número de columna para meter una ficha: ");
            int ficha2 = Integer.parseInt(sc.nextLine());
            if (ficha2>6){
                ficha2 = 6;
            }else if (ficha2 < 0){
                ficha2 = 0;
            }
            j2.setColumna(ficha2);
            t1.insertarFicha("O", j2.columna);
            if (t1.ganador("O")){
                System.out.println("El jugador 2 ha ganado. Felicidades " + j2.nombre + "!!!");
                break;
            }
            
            if (t1.empate()){
                System.out.println("No hay más casillas libres y no hubo ganador. " + j1.nombre + " y " + j2.nombre + " quedan empatados.");
                break;
            }
        }

    }
    
}
