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
public class comercial extends empleado {
    
    double comision;

    public comercial(String nombre, int edad, int salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
        this.salario += this.comision;
        Plus();
    }

    @Override
    protected void Plus() {
        if (edad>30 && comision>200){
            salario += plus;
        }
    }
    
}
