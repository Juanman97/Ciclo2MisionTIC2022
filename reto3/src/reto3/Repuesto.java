/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.ArrayList;

/**
 *
 * @author JuanManuel
 */
public class Repuesto {
    
    public Repuesto(){
        
    }
    
    public ArrayList<String> obtenerRepuestos(ArrayList<String> l){
        ArrayList<String> salida = new ArrayList<>();
        for (String i : l){
            if (!salida.contains(i)){
                salida.add(i);
            }
        }
        return salida;
    }
    
    public ArrayList<Integer> obtenerRepuestosFaltantes(ArrayList<Integer> lpos,ArrayList<String> faltantes, String cat){
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i : lpos){
            if (faltantes.get(i).equals(cat)){
                salida.add(i);
            }
        }
        return salida;
    }
    
    public ArrayList<String> obtenerFaltantes(ArrayList<String> lotro, ArrayList<String> lodtimuz){
        ArrayList<String> salida = new ArrayList<>();
        for (String i : lotro){
            if (!lodtimuz.contains(i)){
                salida.add(i);
            }
        }
        return salida;
    }
    
    public Integer obtenerSobrantesIntercambiables(ArrayList<String> lotro, ArrayList<String> lodtimuz){
        Integer lotroNecesita = 0;
        Integer lodtimuzNecesita = 0;
        for (String i : lotro){
            if (!lodtimuz.contains(i)){
                lodtimuzNecesita++;
            }
        }
        for (String j : lodtimuz){
            if (!lotro.contains(j)){
                lotroNecesita++;
            }
        }
        if (lotroNecesita>lodtimuzNecesita){
            return lodtimuzNecesita;
        }else{
            return lotroNecesita;
        }
        
    }
}
