/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triki;

/**
 *
 * @author JuanManuel
 */
public class objetoTriki {

    char[][] matriz = new char[3][3];

    public objetoTriki() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 'a';
            }
        }
    }

    protected void imprimirMatriz() {
        System.out.println("=========");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println("=========");
    }

    protected void marcarCasilla(String simbolo, int fila, int columna) {
        matriz[fila][columna] = simbolo.charAt(0);
        //verificarGanador();
        imprimirMatriz();
    }

    protected char verificarGanador() {
        char respuesta = 'a';
        if (matriz[0][0] != 'a' && matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2]) {//diagonal hacia la derecha
            respuesta = matriz[0][0];
        } else if (matriz[0][2] != 'a' && matriz[0][2] == matriz[1][1] && matriz[0][2] == matriz[2][0]) {//diagonal hacia la izquierda
            respuesta = matriz[0][2];
        } else if (matriz[0][1] != 'a' && matriz[0][1] == matriz[1][1] && matriz[0][1] == matriz[2][1]) {//vertical central
            respuesta = matriz[0][1];
        } else if (matriz[1][0] != 'a' && matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2]) {//horizontal central
            respuesta = matriz[1][1];
        } else if (matriz[0][0] != 'a' && matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2]) {//horizontal arriba
            respuesta = matriz[0][1];
        } else if (matriz[2][0] != 'a' && matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2]) {//horizontal abajo
            respuesta = matriz[2][1];
        } else if (matriz[0][0] != 'a' && matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0]) {//vertical izquierda
            respuesta = matriz[0][0];
        } else if (matriz[0][2] != 'a' && matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2]) {//vertical derecha
            respuesta = matriz[1][2];
        }

        return respuesta;

    }

    protected void verificarCasilla(int fila, int columna) {
        System.out.println(Character.toString(matriz[fila][columna]));
    }

    protected boolean verificarTrikiLLeno() {
        boolean completado = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == 'a'){
                    completado = false;
                }
            }
        }
        return completado;
    }

}
