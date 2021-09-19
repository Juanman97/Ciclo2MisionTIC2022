/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;

/**
 *
 * @author JuanManuel
 * Crea una clase llamada Punto con sus dos coordenadas X e Y.
    - Añade un método constructor para crear puntos fácilmente. Si no se reciben una coordenada, su valor será cero.
    - Sobreescribe el método string, para que al imprimir por pantalla un punto aparezca en formato (X,Y)
    - Añade un método llamado cuadrante que indique a qué cuadrante pertenece el punto, teniendo en cuenta que si X == 0 e Y != 0 se sitúa sobre el eje Y, si X != 0 e Y == 0 se sitúa sobre el eje X y si X == 0 e Y == 0 está sobre el origen.
    - Añade un método llamado vector, que tome otro punto y calcule el vector resultante entre los dos puntos.
    - (Optativo) Añade un método llamado distancia, que tome otro punto y calcule la distancia entre los dos puntos y la muestre por pantalla. La fórmula es la siguiente:
    Crea una clase llamada Rectangulo con dos puntos (inicial y final) que formarán la diagonal del rectángulo.
    - Añade un método constructor para crear ambos puntos fácilmente, si no se envían se crearán dos puntos en el origen por defecto.
    - Añade al rectángulo un método llamado base que muestre la base.
    - Añade al rectángulo un método llamado altura que muestre la altura.
    - Añade al rectángulo un método llamado area que muestre el area.
 */
public class Coordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        punto p1 = new punto(2,3);
        System.out.println(p1);
        System.out.println(p1.cuadrante());
        
        punto p2 = new punto(5,5);
        System.out.println(p2);
        System.out.println(p2.cuadrante());
        
        System.out.println(p1.vector(p2));
        System.out.println(p1.distancia(p2));
        
        rectangulo r1 = new rectangulo(p1, p2);
        System.out.println("La base es " + r1.base());
        System.out.println("La altura es " + r1.altura());
        System.out.println("El área es " + r1.area());
        
    }
    
}
