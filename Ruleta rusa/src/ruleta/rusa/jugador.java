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
public class jugador extends revolver {
    int id;
    String nombre;
    boolean vivo = true;
    
    protected jugador(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    protected boolean disparar(revolver r){
        if (r.posActual == r.posBala){
            vivo = false;
        }
        r.siguienteBala();
        return vivo;
    }
}

