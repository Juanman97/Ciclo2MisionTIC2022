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
public class tablero {

    String frase;
    jugador j1;
    jugador j2;
    String[] tablero0;
    String[] listaFrase;

    public tablero(String frase, jugador j1, jugador j2) {
        this.frase = frase.toUpperCase();
        this.j1 = j1;
        this.j2 = j2;
        listaFrase = this.frase.split("");
        tablero0 = crearTablero();
    }

    protected String[] crearTablero() {
        String[] salida = new String[listaFrase.length];
        int pos = 0;
        for (String i : listaFrase) {
            if (((int) i.charAt(0) >= 65 && (int) i.charAt(0) <= 90) || (int) i.charAt(0) == 165) {
                salida[pos] = "_";
            } else if ((int) i.charAt(0) == 32) {
                salida[pos] = " ";
            } else {
                salida[pos] = i;
            }
            pos++;
        }
        return salida;
    }

    protected String imprimirTablero() {
        String salida = "";
        for (String i : tablero0) {
            salida += i + " ";
        }
        return salida;
    }

    protected boolean verificarLetra(String letra) {
        letra = letra.toUpperCase();
        int pos = 0;
        int cont = 0;
        boolean esta = false;
        for (String i : listaFrase) {
            if (i.equals(letra)) {
                tablero0[pos] = letra;
                esta = true;
                cont++;
            }
            pos++;
        }
        if (esta == true) {
            if (cont == 1) {
                System.out.println("La letra " + letra + " está en la frase " + cont + " vez.");
            } else {
                System.out.println("La letra " + letra + " está en la frase " + cont + " veces.");
            }
        } else {
            System.out.println("La letra " + letra + " no se encuentra en la frase.");
        }
        System.out.println(imprimirTablero());
        return esta;
    }
}
