/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro.en.linea;

import java.util.ArrayList;

/**
 *
 * @author JuanManuel
 */
public class tablero {

    jugador j1;
    jugador j2;
    ArrayList<ArrayList<String>> tablero1 = new ArrayList<>();

    public tablero(jugador j1, jugador j2) {
        this.j1 = j1;
        this.j2 = j2;
        tablero1 = tablero();
    }

    protected ArrayList tablero() {
        ArrayList<String> lista;
        ArrayList<ArrayList<String>> board = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            lista = new ArrayList<>();
            for (int j = 0; j < 7; j++) {
                lista.add(j, "a");
            }
            board.add(lista);
        }
        return board;
    }

    protected void imprimirTablero() {
        for (int p = 0; p<7; p++){
            System.out.print(p + "   ");
        }
        System.out.println("\n=========================");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(tablero1.get(i).get(j) + "   ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    protected void insertarFicha(String a, int col){
       for (int i = 5; i >= 0; i--) {
            if ((tablero1.get(i).get(col)).equals("a")) {
                if (a.equals("X")){
                    tablero1.get(i).set(col, "X");
                }else if (a.equals("O")){
                    tablero1.get(i).set(col, "O");
                }                
                break;
            }
        }
        imprimirTablero(); 
    }
    

    protected boolean ganador(String g) {
        boolean ganador = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                //Primer caso: línea de 4 horizontal
                if (j <= 3) {
                    if (tablero1.get(i).get(j).equals(g) && tablero1.get(i).get(j + 1).equals(g)
                            && tablero1.get(i).get(j + 2).equals(g)
                            && tablero1.get(i).get(j + 3).equals(g)) {
                        return ganador = true;
                    }
                }
                //Segundo caso: línea de 4 vertical
                if (i <= 2) {
                    if (tablero1.get(i).get(j).equals(g) && tablero1.get(i + 1).get(j).equals(g)
                            && tablero1.get(i + 2).get(j).equals(g)
                            && tablero1.get(i + 3).get(j).equals(g)) {
                        return ganador = true;
                    }
                }
                //Tercer caso: línea de 4 en diagonal /
                if (i > 2 && j < 4) {
                    if (tablero1.get(i).get(j).equals(g) && tablero1.get(i - 1).get(j + 1).equals(g)
                            && tablero1.get(i - 2).get(j + 2).equals(g)
                            && tablero1.get(i - 3).get(j + 3).equals(g)) {
                        return ganador = true;
                    }
                }
                //Cuarto caso: línea de 4 en diagonal \
                if (i > 2 && j > 2) {
                    if (tablero1.get(i).get(j).equals(g) && tablero1.get(i - 1).get(j - 1).equals(g)
                            && tablero1.get(i - 2).get(j - 2).equals(g)
                            && tablero1.get(i - 3).get(j - 3).equals(g)) {
                        return ganador = true;
                    }
                }
            }
        }
        return ganador;
    }
    
    protected boolean empate(){
        boolean emp = true;
        for (int i = 5; i >= 0; i--){
            for (int j = 6; j>=0; j--){
                if (tablero1.get(i).get(j) == "a"){
                    emp = false;
                }
            }
        }
        return emp;
    }
}
