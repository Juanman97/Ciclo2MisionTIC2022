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
public class punto {
    double x = 0;
    double y = 0;

    public punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public punto() {
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
    
    protected String cuadrante(){
        if(x>0 && y>0){
            return "El punto se encuentra en el cuadrante 1";
        }else if (x<0 && y>0){
            return "El punto se encuentra en el cuadrante 2";
        }else if (x<0 && y<0){
            return "El punto se encuentra en el cuadrante 3";
        }else if (x>0 && y<0){
            return "El punto se encuentra en el cuadrante 4";
        }else if (x==0 && y!=0){
            return "El punto se encuentra sobre el eje y";
        }else if (y==0 && x!=0){
            return "El punto se encuentra sobre el eje x";
        }else{
            return "El punto se encuentra sobre el origen";
        }
    }
    
    protected String vector(punto p2){
        double rx = p2.x-x;
        double ry = p2.y - y;
        return "El vector resultante es: (" + rx + ", " + ry + ")";
    }
    
    protected String distancia(punto p2){
        double d = Math.sqrt(Math.pow((p2.x - x),2)+Math.pow((p2.y - y),2));
        return "La distancia entre el punto 1 y el punto 2 es " + d;
    }
    
}
