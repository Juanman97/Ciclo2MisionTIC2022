/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JuanManuel
 */
public class Reto3 {
/*Odtimuz necesita tu ayuda para crear una clase en Java llamada Repuesto que pueda integrar a su sistema. La clase debe tener las siguientes funciones:

obtenerRepuestos(l): Dada una lista de repuestos l que contiene nombres de artículos la función genera una lista de los artículos sin repetición. 

Ejemplo:
l = ['CHASIS', 'FRENOS', 'MOTOR', 'FRENOS', 'DIRECCION', 'EMBRAGUE', 'MOTOR']

La función debe retornar la siguiente lista:
['CHASIS', 'FRENOS', 'MOTOR', 'DIRECCION', 'EMBRAGUE']

obtenerRepuestosFaltantes(lpos, faltantes, cat): Dada una lista con las posiciones de los repuestos que faltan lpos, una lista de repuestos faltantes faltantes y el nombre de un repuesto cat, se debe obtener la lista de posiciones de los repuestos faltantes. Ejemplo: 

lpos = [0, 1, 4, 5, 6]
faltantes =['EMBRAGUE', 'FRENOS', 'MOTOR', 'FRENOS', 'DIRECCION', 'EMBRAGUE', 'MOTOR']
cat = ‘EMBRAGUE’

Se debe retornar la siguiente lista: [0, 5]

obtenerFaltantes(lotro, lodtimuz): Para poder realizar un intercambio de repuestos, dada la lista de repuestos que tienen otro autobot llamada lotro, y la lista de repuestos que tiene Odtimuz actualmente llamada lodtimuz, retorna la lista de repuestos que me interesan del otro autobot.

Ejemplo: si se tiene como entrada:

lotro =['EMBRAGUE', 'RUEDA', 'FRENOS', 'MOTOR', 'DIRECCION', 'CAJA']
lodtimuz  = ['SUSPENSION', 'RUEDA', 'CAJA', 'EMBRAGUE', 'PATIN']

La función debe retornar una lista que contiene: ['FRENOS', 'MOTOR', 'DIRECCION']

obtenerSobrantesIntercambiables(lotro, lodtimuz): dadas la lista de repuestos sobrantes de otro autobot lotro y las que a Odtimuz lodtimuz que le sobran, debe retornar el número de repuestos que se pueden intercambiar entre sí.

Ejemplo: si se tiene como entrada
lotro =['EXPLORADORA', 'RUEDA', 'FRENOS', 'MOTOR', 'DIRECCION', 'CAJA']
lodtimuz = ['SUSPENSION', 'RUEDA', 'CAJA', 'EMBRAGUE', 'PATIN']

La función debe retornar: 3.  Al otro le interesan 3 repuestos de Odtimuz. A Odtimuz, le interesan 4 repuestos del otro, luego podrían intercambiar máximo 3. Para que sea evaluada correctamente por Odtimuz, la función debe retornar un Integer.
Entrada:

Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre Repuesto.java con la clase Repuesto.java y que definan los nombres de las funciones dadas y sus parámetros tal cual está especificado en el enunciado definiendo la clase Repuesto.*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Repuesto r1 = new Repuesto();

        ArrayList<Integer> lpos = new ArrayList<>(Arrays.asList(0, 1, 4, 5, 6));
        ArrayList<String> faltante = new ArrayList<>(Arrays.asList("EMBRAGUE", "EMBRAGUE", "MOTOR", "FRENOS", "DIRECCION", "EMBRAGUE", "MOTOR"));
        String cat = "EMBRAGUE";
        System.out.println(r1.obtenerRepuestosFaltantes(lpos, faltante, cat));
        


    }
}
