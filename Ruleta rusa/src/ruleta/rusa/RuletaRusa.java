/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta.rusa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JuanManuel
 * Vamos a hacer el juego de la ruleta rusa en Java. Como muchos sabéis, se trata de un número de jugadores que con un revolver con un sola bala en el tambor se dispara en la cabeza.
Las clases a hacer son:
Revolver:
    Atributos:
    - posición actual (posición del tambor donde se dispara, puede que esté la bala o no)
    - posición bala (la posición del tambor donde se encuentra la bala)
    - Estas dos posiciones, se generaran aleatoriamente.
    Funciones:
    - disparar(): devuelve true si la bala coincide con la posición actual
    - siguienteBala(): cambia a la siguiente posición del tambor
    - toString(): muestra información del revolver (posición actual y donde está la bala)
Jugador:
    - Atributos
    - id (representa el número del jugador, empieza en 1)
    - nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo)
    - vivo (indica si está vivo o no el jugador)
    Funciones:
    - disparar(Revolver r): el jugador se apunta y se dispara, si la bala se dispara, el jugador muere.
Juego:
    Atributos:
    - Jugadores (conjunto de Jugadores)
    - Revolver
    Funciones:
    - finJuego(): cuando un jugador muere, devuelve true
    - ronda(): cada jugador se apunta y se dispara, se informara del estado de la partida (El jugador se dispara, no ha muerto en esa ronda, etc.)
El número de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
En cada turno uno de los jugadores, dispara el revólver, si este tiene la bala  el jugador muere y el juego termina.
 */
public class RuletaRusa {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<jugador> jugadores = new ArrayList<>();
        
        revolver r1 = new revolver();
        
        System.out.print("Ingrese el número de jugadores (1-6): ");
        int numJugadores = Integer.parseInt(sc.nextLine());
        for (int i = 1; i<=numJugadores; i++){
            System.out.print("Ingrese el nombre del jugador " + i + ": ");
            String nombre = sc.nextLine();
            jugador j1 = new jugador(i,nombre);
            jugadores.add(j1);
        }
        int ronda = 1;
        boolean end = false;
        System.out.println(r1.toString());
        while(jugadores.get(1).vivo){
            System.out.println("Ronda " + ronda);
            for (jugador i : jugadores){
                System.out.print("El jugador " + i.id + " dispara? ");
                String respuesta = sc.nextLine();
                if (respuesta.equals("si")){
                    i.disparar(r1);
                    if (!i.vivo){
                        System.out.println(i.nombre + " muere. El juego ha acabado");
                        end = true;
                        break;
                    }else{
                        System.out.println("La bala no se ha disparado aún, " + i.nombre + " vive\n");
                    }
                }else{
                    System.out.println(i.nombre + " se retira. El juego ha acabado");
                    end = true;
                    break;
                }
                System.out.println(r1.toString());
            }
            if (end){
                    break;
                }
            ronda++;
        }
        
    }
    
}
