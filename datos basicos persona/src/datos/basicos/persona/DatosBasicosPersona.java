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
public class DatosBasicosPersona {

    /**
     * @param args the command line arguments
     */
    
    /*Crear la clase Persona que tenga como atributos Nombre, Edad,Genero (H hombre, M mujer), peso y altura. El constructor debe
    recibir todos los parametros para su inicializacion. La clase debe tener los siguientes metodos:
    - calcularIMC(): Calculara y retornara el Indice de Masa Corporal del objeto.
    - esMayorDeEdad(): Devolvera true si es mayor de edad, false en caso contrario.
    - toString(): Devolvera toda la informacion del objeto en un String.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        persona juan = new persona ("juan", 23 , 'M' , 80.0 , 1.78);
        juan.calcularIMC();
        juan.esMayorDeEdad();
        System.out.println(juan.toString());
    }
    
    
}
