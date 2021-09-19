/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.basicos.persona;

/**
 *
 * @author JuanManuel
 */
public class persona {

    String nombre;
    int edad;
    Character genero;
    double peso;
    double altura;

    public persona(String nombre, int edad, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    protected void calcularIMC() {
        double IMC = peso / Math.pow(altura, 2);
        System.out.println("El índice de masa corporal de " + nombre + " es: " + IMC);
    }
    
    protected void esMayorDeEdad(){
        boolean mayor = false;
        if(edad>=18){
            mayor = true;
        }
        System.out.println(nombre + " es mayor de edad: " + mayor);
    }
    
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nGénero: " + genero + "\nPeso: " + peso + "\nAltura: " + altura;
    }
    
}
