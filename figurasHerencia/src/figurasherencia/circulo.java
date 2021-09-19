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
public class circulo extends Figura {
    
    double radio;
    
    public circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    @Override
    protected double perimetro() {
        double resultado1 = 2 * Math.PI * radio;
        return resultado1;
    }

    @Override
    protected double area() {
        double resultado2 = Math.PI * Math.pow(radio, 2);
        return resultado2;
    }

    @Override
    public String toString() {
        String resultado3 = "El círculo " + color + " tiene un radio de " + radio + " metros, un perímetro de " + perimetro() + " metros y un área de " + area() + " metros cuadrados.";
        return resultado3;
    }
    
    
    
}
