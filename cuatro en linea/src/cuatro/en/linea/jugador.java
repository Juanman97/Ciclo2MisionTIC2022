/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro.en.linea;

/**
 *
 * @author JuanManuel
 */
public class jugador {
    String nombre;
    int columna;

    public jugador(String nombre) {
        this.nombre = nombre;
    }
   
    protected void setColumna(int col){
        columna = col;
    }
}
