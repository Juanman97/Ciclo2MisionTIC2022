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
public class ContraseñaAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//generar una contraseña aleatoria de x número de caracteres (letras mayúsculas y minúsculas y números). 
//es fuerte si tiene más de 1 letra mayúscula, una minúscula y 5 números.
//también se puede poner una contraseña propia y verificar si es fuerte según dichos criterios.
        contraseña claveprueba = new contraseña(15);
        System.out.println(claveprueba.toString());
        claveprueba.esFuerte();
        claveprueba.cambiarContraseña("contraseñaSegura123456");
        System.out.println(claveprueba.toString());
        claveprueba.esFuerte();
    }

}
