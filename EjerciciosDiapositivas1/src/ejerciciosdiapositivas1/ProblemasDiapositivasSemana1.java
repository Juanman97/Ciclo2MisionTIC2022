/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdiapositivas1;

import java.util.Scanner;

/**
 *
 * @author JuanManuel
 */
public class ProblemasDiapositivasSemana1 {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //CICLOS
        //determinar si el entero ingresado es el código ascii de una letra minúscula -> OK
        /*int asciiNum = Integer.parseInt(sc.nextLine());
        char letra = (char)asciiNum;
        if(asciiNum==97 || asciiNum==101 || asciiNum==105 || asciiNum==111 || asciiNum==117){
            System.out.println("El símbolo ASCII es una vocal");
        }else{
            System.out.println("El símbolo ASCII no es una vocal");
        }
        
        //Dada una cadena de longitud 1, determine si el código ASCII de primera letra de la cadena es par o no. -> OK
        String entrada1 = sc.nextLine();
        char letra1 = entrada1.charAt(0);
        int asciiValue = (int)letra1;
        if(asciiValue%2==0){
            System.out.println("El código ASCII " + asciiValue + " de la letra " + letra1 + " es par");
        }else{
            System.out.println("El código ASCII " + asciiValue + " de la letra " + letra1 + " es impar");
        }
        
        //Dado un caracter, construya un programa en Java para determinar si el caracter es un dgito o no. -> OK
        String entrada2 = sc.nextLine();
        char caracter=entrada2.charAt(0);
        System.out.println("prueba "+ caracter);
        if(Character.isDigit(caracter)){
            System.out.println("Es dígito");
        }else{
            System.out.println("Es caracter");
        }
        
        //Dado un numero real x, construya una funcion que permita determinar si el numero es positivo, negativo o cero. -> OK
        Double num = Double.parseDouble(sc.nextLine());
        if (num<0){
            System.out.println("El número " + num + " es negativo");
        }else if(num>0){
            System.out.println("El número " + num + " es positivo");
        }else{
            System.out.println("El número " + num + " es neutro para la suma");
        }*/
        //CICLOS
        /*Diseñe un algoritmo que pida un valor entero, y que siga leyendo valores enteros mientras que alguno de esos valores no represente el
codigo ASCII de una letra mayuscula del alfabeto ingles. -> OK
        int valor = Integer.parseInt(sc.nextLine());
        while(valor>=65 && valor<=90){
            valor = Integer.parseInt(sc.nextLine());
        }
        
        //Imprimir un listado con los numeros del 1 al 10 cada uno con su respectivo cuadrado. ->OK
        int i = 0;
        System.out.println("Num" + "  "+ "Cuadrado");
        do{
            System.out.println(i + "    "+ Math.pow(i,2));
            i++;
        }while(i<=10);
        
        //En 2022 el pas A tendra una poblacion de 25 millones de habitantes y el pas B de 18:9 millones. Las tasas de crecimiento anual de la
        poblacion seran de 2% y 3% respectivamente. Desarrollar un algoritmo para informar en que a~no la poblacion del pas B superara a
        la de A. -> OK
        Double a = 25.0;
        Double b = 18.9;
        int año=2022;
        while(b<=a){
            a=a+(a*0.02);
            b=b+(b*0.03);
            año++;
        }
        System.out.println(año);
        
        //Dise~ne un programa que muestre las tablas de multiplicar del 1 al 9. -> OK
        for(int i = 0; i<=9; i++){
            System.out.println("Tabla del " + i);
            for(int j = 0; j<=10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println(" ");
            System.out.println(" ");
        }*/
        //STRINGS
        /*Elabore un programa que dada una letra cuente cuantas ocurrencias de esta letra hay. -> OK
        String frase = sc.nextLine();
        String letra = sc.nextLine();
        char letra1 = letra.charAt(0);
        int contador = 0;
        for(char i : frase.toCharArray()){
            if(i == letra1){
                contador++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + contador + " veces");
        
        //Elabore un programa que dada una cadena diga si todos los smbolos de la cadena son letras (may. y min. alfabeto inglés). ->OK
        String frase = sc.nextLine();
        boolean resultado = true;
        for (char i : frase.toCharArray()) {
            int numLetra = (int) i;
            if (numLetra < 65 || (numLetra > 90 && numLetra < 97) || numLetra > 122) {
                resultado = false;
            }
        }
        System.out.println(resultado);
        
        //Desarrollar un algoritmo que retorne un valor booleano que indique si dos cadenas son iguales, esto es, que tienen la misma longitud con los
mismos smbolos en la mismas posiciones. -> OK
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();
        boolean result = false;
        if(cadena1.equals(cadena2)){
            result = true;
        }
        System.out.println(result);
        
        //Desarrollar un algoritmo que invierta una cadena de caracteres (la cadena invertida debe quedar guardada en una variable aparte).->OK
        String cadena1 = sc.nextLine();
        String nuevaCadena="";
        for (int i=cadena1.length()-1; i>=0; i--){
            nuevaCadena = nuevaCadena + cadena1.charAt(i);
        }
        System.out.println("Cadena inicial: " + cadena1 + "\ncadena invertida: " + nuevaCadena);
        
        //Desarrollar un algoritmo que determine si una cadena de caracteres es palindrome (con espacios: robas ese sabor).->OK
        String frase = sc.nextLine();
        String fraseReves="";
        for (int i=frase.length()-1; i>=0; i--){
            fraseReves = fraseReves + frase.charAt(i);
        }
        if(fraseReves.equals(frase)){
            System.out.println("Es palíndrome");
        }else{System.out.println("No es palíndrome");}*/
 /*ARREGLOS Y MATRICES
        
        //Desarrollar un algoritmo que calcule el promedio de un arreglo de reales.->OK
        double suma = 0.0;
        double x [] = {1.4, 2.5, 5.3, 8.4, 6.6};
        for(double i : x){
            suma+=i;
        }
        double promedio = suma/x.length;
        System.out.println("El promedio es: " + promedio);
        
        //Desarrollar un algoritmo que calcule el producto punto de dos arreglos de numeros enteros (reales) de igual tama~no.->OK
        double x [] = {3.4, 4.2, 8.3, 5.4, 2.9};
        double y [] = {7.9, 1.3, 5.8, 3.2, 8.8};
        double resultado=0;
        for(int i=0; i<x.length; i++){
            resultado += x[i]*y[i];
        }
        System.out.println(resultado);
        
        //Hacer un algoritmo que deje al nal de un arreglo de numeros todos los ceros que aparezcan en dicho arreglo.
        int x[] = {1, 6, 0, 7, -3, 8, 0, -2, 11};
        int cuenta = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                cuenta++;
            }
        }
        int nuevoX[] = new int[x.length - cuenta];
        int resultado[] = new int[x.length];
        int j = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != 0) {
                nuevoX[j] = x[i];
                j++;
            }
        }
        for (int i = 0; i < x.length; i++) {
            if (i >= nuevoX.length) {
                resultado[i] = 0;
            } else {
                resultado[i] = nuevoX[i];
            }
        }
        System.out.println(Arrays.toString(resultado));
        
        //Desarrollar un programa que sume los elementos de una columna dada de una matriz y luego de una fila dada de una matriz.->OK
        int matriz1[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        for (int i = 0; i < matriz1.length; i++) {  //imprimir matriz
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + "  ");
            }
            System.out.println(""); 
        }
        System.out.println("Columna de la matriz a sumar: ");
        int columna = Integer.parseInt(sc.nextLine());
        int sumaColumna = 0;
        int sumaFila = 0;
        for (int i = 0; i < matriz1.length; i++) { 
            for (int j = 0; j < matriz1[0].length; j++) {
                if (j==(columna-1)){
                    sumaColumna+=matriz1[i][j];
                }
            } 
        }
        System.out.println("suma columna: " + sumaColumna);
        System.out.println("fila de la matriz a sumar: ");
        int fila = Integer.parseInt(sc.nextLine());
        for (int i = 0; i<matriz1[0].length; i++){
            sumaFila+=matriz1[fila-1][i];
        }
        System.out.println("suma fila: " + sumaFila);*/
 
        
        
        

    }

}
