/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoserieyvideojuego;

import java.util.ArrayList;

/**
 *
 * @author JuanManuel
 * Crearemos una clase llamada Serie con las siguientes características:
- Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
- Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
Los constructores que se implementaran serán:
- Un constructor por defecto.
- Un constructor con el titulo y creador. El resto por defecto.
- Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:
- Métodos get de todos los atributos, excepto de entregado.
- Métodos set de todos los atributos, excepto de entregado.
- Sobrescribe los métodos toString.
Crearemos una clase Videojuego con las siguientes características:
- Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
- Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
Los constructores que se implementaran serán:
- Un constructor por defecto.
- Un constructor con el titulo y horas estimadas. El resto por defecto.
- Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:
- Métodos get de todos los atributos, excepto de entregado.
- Métodos set de todos los atributos, excepto de entregado.
- Sobrescribe los métodos toString.
Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:
- entregar(): cambia el atributo prestado a true.
- devolver(): cambia el atributo prestado a false.
- isEntregado(): devuelve el estado del atributo prestado.
- Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas. Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.
 */
public class PrestamoSerieyVideojuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        serie blindspot = new serie("Blindspot", 5, "Acción", "Juanman");
        serie tbbt = new serie("The big bang theory", 12, "Comedia", "Sheldon Cooper");
        serie zoo = new serie("Zoo", 3, "Acción", "Jackson Oz");
        serie casaPapel = new serie("La casa de papel", 5, "Acción", "Profesor");
        serie vikings = new serie("Vikings", 5, "Acción", "Ragnar Lothbrook");
        
        ArrayList<serie> series = new ArrayList<>();
        series.add(blindspot);
        series.add(tbbt);
        series.add(zoo);
        series.add(casaPapel);
        series.add(vikings);
        
        for (serie i : series){
            System.out.println(i.toString() +"\n===============================");
        }
        
        zoo.compareTo(series);
    }
    
}
