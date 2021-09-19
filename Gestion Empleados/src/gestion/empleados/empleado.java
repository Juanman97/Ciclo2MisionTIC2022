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
public abstract class empleado {
    String nombre;
    int edad;
    int salario;
    int plus = 300;

    public empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    protected String getNombre(){
        return nombre;
    }
    protected int getEdad(){
        return edad;
    }
    protected int getSalario(){
        return salario;
    }

    @Override
    public String toString() {
        return "El empleado "+ nombre + " tiene " + edad + " años y su salario es $" + salario;
    }
    
    
    
    protected abstract void Plus();
    
    
    
    
    
}
