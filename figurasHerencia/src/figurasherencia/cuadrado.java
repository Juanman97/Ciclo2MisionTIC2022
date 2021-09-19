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
public class cuadrado extends Figura {

    double lado;

    public cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    protected double perimetro() {
        double resultado1 = lado * 4;
        return resultado1;
    }

    @Override
    protected double area() {
        double resultado2 = lado * lado;
        return resultado2;
    }

    @Override
    public String toString() {
        String resultado3 = "El cuadrado " + color + " tiene un lado de " + lado + " metros, un perímetro de " + perimetro() + " metros y un área de " + area() + " metros cuadrados.";
        return resultado3;
    }
}
