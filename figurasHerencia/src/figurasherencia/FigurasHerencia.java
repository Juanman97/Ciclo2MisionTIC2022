/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

/**
 *
 * @author JuanManuel
 */
public class FigurasHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circulo circulo1 = new circulo("Rojo", 4);
        System.out.println(circulo1.area());
        System.out.println(circulo1.perimetro());
        System.out.println(circulo1.toString());

        cuadrado cuadrado1 = new cuadrado("Verde", 5);
        System.out.println(cuadrado1.area());
        System.out.println(cuadrado1.perimetro());
        System.out.println(cuadrado1.toString());
    }

}
