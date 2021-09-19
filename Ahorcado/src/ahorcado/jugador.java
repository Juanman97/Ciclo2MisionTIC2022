/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author JuanManuel
 */
public class jugador {

    String nombre;

    public jugador(String nombre) {
        this.nombre = nombre;
    }

    protected boolean figura(int error) {
        String salida = "";
        boolean perdedor = false;
        switch (error) {
            case 1:
                salida = " _______" + "\n|       |" + "\n|     ('_')" + "\n|       "
                        + "\n|      " + "\n|       " + "\n|       " + "\n|_____     ";
                break;
            case 2:
                salida = " _______" + "\n|       |" + "\n|     ('_')" + "\n|       |"
                        + "\n|      " + "\n|       " + "\n|       " + "\n|_____     ";
                break;
            case 3:
                salida = " _______" + "\n|       |" + "\n|     ('_')" + "\n|       |"
                        + "\n|     / | " + "\n|       " + "\n|       " + "\n|_____     ";
                break;
            case 4:
                salida = " _______" + "\n|       |" + "\n|     ('_')" + "\n|       |"
                        + "\n|     / | \\" + "\n|       " + "\n|      " + "\n|_____     ";
                break;
            case 5:
                salida = " _______" + "\n|       |" + "\n|     ('_')" + "\n|       |"
                        + "\n|     / | \\" + "\n|       |" + "\n|     /  " + "\n|_____     ";
                break;
            case 6:
                salida = " _______" + "\n|       |" + "\n|     ('_')" + "\n|       |"
                        + "\n|     / | \\" + "\n|       |" + "\n|     /   \\" + "\n|_____     ";
                perdedor = true;
                break;
        }
        System.out.println(salida);
        return perdedor;
    }
}
