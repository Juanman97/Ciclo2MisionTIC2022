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
public abstract class Figura {

    String color;

    protected Figura(String color) {
        this.color = color;
    }

    protected abstract double perimetro();

    protected abstract double area();

    @Override
    public abstract String toString();
}
