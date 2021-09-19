/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancariapagoyretiro;

/**
 *
 * @author JuanManuel
 */
public class CuentaBancariaPagoyretiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//cuenta bancaria con determinado dinero y operaciones de ingreso y retiro.
        cuenta juanman = new cuenta("Juan Manuel Reina", 400000.5);
        System.out.println(juanman.getTitular());
        System.out.println(juanman.getCantidad());
        juanman.ingresar(10000);
        System.out.println(juanman.getCantidad());
        juanman.retirar(400000);
        System.out.println(juanman.getCantidad());
        juanman.retirar(11110001.5);
        System.out.println(juanman.getCantidad());
    }

}
