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
 */
public class juego implements entregable {
    
    String titulo = "Juego 1";
    int horas = 10;
    boolean prestado = false;
    String genero = "Genérico";
    String compañia = "Compañía 1";
    
    protected juego(){
    }
    protected juego(String titulo, int horas){
        this.titulo = titulo;
        this.horas = horas;
    }
    protected juego(String titulo, int horas, String genero, String compañia){
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.compañia = compañia;
    }
    
    protected String getTitulo(){
        return titulo;
    }
    protected int getHoras(){
        return horas;
    }
    protected String getGenero(){
        return genero;
    }
    protected String getCompañia(){
        return compañia;
    }
    
    protected void setTitulo(String newTitulo){
        this.titulo = newTitulo;
    }
    protected void setHoras(int newHoras){
        this.horas = newHoras;
    }
    protected void setGenero(String newGenero){
        this.genero = newGenero;
    }
    protected void setCompañia(String newCompañia){
        this.compañia = newCompañia;
    }
    
    @Override
    public String toString(){
        return ("Título juego: " + titulo + "\nNúmero de horas estimadas: " + horas + "\nGénero: " + genero
                + "\nCompañia: " + compañia + "\nEntregado?: " + prestado);
    }
    

    @Override
    public void entregar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean esEntregado() {
        return prestado;
    }


    public void compareTo(ArrayList<juego> a) {
        int mayor = a.get(0).getHoras();
        juego Jmayor = a.get(0);
        for (juego i : a){
            if(i.getHoras()>mayor){
                Jmayor = i;
                mayor = Jmayor.getHoras();
            }
        }
        System.out.println("La serie con mayor número de temporadas es: \n");
        System.out.println(Jmayor.toString());
    }
    
}
