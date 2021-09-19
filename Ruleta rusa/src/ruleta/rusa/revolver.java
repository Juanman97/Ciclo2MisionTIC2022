/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta.rusa;

/**
 *
 * @author JuanManuel
 */
public class revolver {
    
    int posActual;
    int posBala;
    
    protected revolver(){
        posActual = (int)Math.floor(Math.random()*9);
        posBala = (int)Math.floor(Math.random()*9);
    }
    
    protected boolean disparar(){
        return posActual==posBala;
    }
    
    protected void siguienteBala(){
        if (posActual == 9){
            posActual = 0;
        }else{
            posActual++;
        }
    }
    
    @Override
    public String toString(){
        return ("La posición actual es " + posActual + " y la bala está en la posición " + posBala);
    }    
}
