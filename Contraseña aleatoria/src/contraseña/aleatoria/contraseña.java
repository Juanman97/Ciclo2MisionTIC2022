/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseña.aleatoria;

/**
 *
 * @author JuanManuel
 */
public class contraseña {

    private static String randomKey(int L) {
        String x = "";
        for (int i = 0; i < L; i++) {
            char yy;
            int numAsciiNum = (int) (Math.random() * (57 - 48 + 1) + 48);
            int numAsciiMay = (int) (Math.random() * (90 - 65 + 1) + 65);
            int numAsciiMin = (int) (Math.random() * (122 - 97 + 1) + 97);
            int eleccion = (int) (Math.random() * (3 - 1 + 1) + 1);
            switch (eleccion) {
                case 1:
                    yy = (char) numAsciiNum;
                    break;
                case 2:
                    yy = (char) numAsciiMay;
                    break;
                default:
                    yy = (char) numAsciiMin;
                    break;
            }
            x += String.valueOf(Character.toString(yy));
        }
        return x;
    }

    private static int[] numElementos(String clave) {
        int numeros = 0;
        int mayusculas = 0;
        int minusculas = 0;
        for (char i : clave.toCharArray()) {
            int iInt = (int) i;
            if (iInt >= 48 && iInt <= 57) {
                numeros++;
            } else if (iInt >= 65 && iInt <= 90) {
                mayusculas++;
            } else {
                minusculas++;
            }
        }
        int[] salida = {numeros, mayusculas, minusculas};
        return salida;
    }

    int longitud;
    String Contraseña;

    protected contraseña() {
        this.longitud = 8;
        Contraseña = randomKey(longitud);
    }

    protected contraseña(int longitud) {
        this.longitud = longitud;
        Contraseña = randomKey(longitud);
    }

    protected void imprimirClave() {
        System.out.println(Contraseña);
    }

    protected void esFuerte() {
        int[] numeroElementos = numElementos(Contraseña);
        int numNum = numeroElementos[0];
        int numMay = numeroElementos[1];
        int numMin = numeroElementos[2];
        boolean fuerte = false;
        if (numMay >= 1 && numMin >= 1 && numNum > 5) {
            fuerte = true;
        }
        System.out.println("La contraseña es fuerte?: " + fuerte);
    }

    protected void cambiarContraseña(String nuevaContraseña) {
        Contraseña = nuevaContraseña;
    }
    
    @Override
    public String toString(){
        String salida1 = "La contraseña actual es: " + Contraseña +"\nLa contraseña tiene " + longitud + " caracteres";
        return salida1;        
    }
}
