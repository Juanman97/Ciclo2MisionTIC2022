/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.empleados;

/**
 *
 * @author JuanManuel
 */
public class repartidor extends empleado {
    
    String zona;

    public repartidor(String nombre, int edad, int salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
        Plus();
    }

    @Override
    protected void Plus() {
        if (edad<25 && zona.equals("zona 3")){
            salario += plus;
        }
    }
    
    
}
