/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;

/**
 *
 * @author JuanManuel
 */
public class rectangulo {
    punto p1 = new punto(0,0);
    punto p2 = new punto(0,0);

    protected rectangulo() {
    }
    protected rectangulo(punto p1, punto p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    protected double base(){
        double rx = p2.x-p1.x;
        return rx;
    }
    protected double altura(){
        double ry = p2.y - p1.y;
        return ry;
    }
    protected double area(){
        double a = base() * altura();
        return a;
    }
    
    
}
