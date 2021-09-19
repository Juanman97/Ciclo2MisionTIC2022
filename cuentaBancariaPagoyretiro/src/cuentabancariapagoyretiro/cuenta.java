/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancariapagoyretiro;

/**
 *
 * @author JuanManuel
 */
public class cuenta {
    
    String titular;
    double cantidad;
    
    protected cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    protected void setTitular(String titular){
        this.titular = titular;
    }
    
    protected void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    protected String getTitular(){
        return titular;
    }
    
    protected double getCantidad(){
        return cantidad;
    }
    
    protected void ingresar(double ingreso){
        if (ingreso>0){
            cantidad+=ingreso;
        }
    }
    
    protected void retirar(double retiro){
        if (cantidad - retiro <=0){
            cantidad=0;
        }else{
            cantidad -=retiro;
        }
    }
    
}
