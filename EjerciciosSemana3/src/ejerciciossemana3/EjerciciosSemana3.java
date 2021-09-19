/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciossemana3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author JuanManuel
 */
public class EjerciciosSemana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Dada una lista de numeros, eliminar los duplicados e imprimir la lista procesada.->OK
        ArrayList<Integer> listaNum = new ArrayList<>(Arrays.asList(1,2,3,4,5,2,3,4,6,6,5,3,5,3,7,3,2,9,8,9));
        Collections.sort(listaNum);
        System.out.println("Lista original: " + listaNum);
        ArrayList<Integer> listaProcesada = new ArrayList<>();
        for (int i : listaNum){
            if (!listaProcesada.contains(i)){
                listaProcesada.add(i);
            }
        }
            System.out.println("Lista Procesada: " + listaProcesada);
        
        
        //Dadas dos listas de numeros, las cuales pueden ser de distinto
        tama~no, e imprimir los numeros se encuentran en ambas listas. ->OK
        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1,4,5,3,8,7,65,4,44,5,8,12));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(1,42,5,3,83,7,65,41,44,5,8,12,14,55,2));
        ArrayList<Integer> lista3 = new ArrayList<>();
        for (int i : lista1){
            if (lista2.contains(i) && !lista3.contains(i)){
                lista3.add(i);
            }
        }
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista de elementos comunes en la lista 1 y 2: " + lista3);
        
        
        //Dada una lista de objetos, imprimir la inversa de dicha lista.->OK
        ArrayList<Integer> lista0 = new ArrayList<>(Arrays.asList(1,3,5,4,6,7,8,9,3,4,6));
        Collections.sort(lista0);
        System.out.println("Lista ordenada: " + lista0);
        Collections.reverse(lista0);
        System.out.println("Lista invertida: " + lista0);
        
        
        //Desarrollar un algoritmo que verique si todas las parejas
        clave:valor de un HashMap se encuentran en otro HashMap.->OK
        HashMap<Integer, String> dicc1 = new HashMap<>();
        dicc1.put(1, "juan");
        dicc1.put(2, "maria");
        dicc1.put(3, "mara");
        dicc1.put(4, "david");
        dicc1.put(5, "esteban");
        dicc1.put(6, "doris");
        dicc1.put(7, "santiago");
        dicc1.put(8, "carlos");
        HashMap<Integer, String> dicc2 = new HashMap<>();
        dicc2.put(1, "juan");
        dicc2.put(2, "maria");
        dicc2.put(3, "mara");
        dicc2.put(4, "david");
        dicc2.put(5, "esteban");
        dicc2.put(6, "doris");
        dicc2.put(7, "santiago");
        dicc2.put(8, "carlos");
        boolean test = true;
        for (int i : dicc1.keySet()) {
            if (!dicc2.containsKey(i) || dicc1.get(i) != dicc2.get(i)) {
                test = false;
            }
        }
        System.out.println(dicc1);
        System.out.println(dicc2);
        System.out.println("Todas las parejas del diccionario 1 se encuentran en el diccionario 2?: " + test);*/
        
        
        //
    }

}
