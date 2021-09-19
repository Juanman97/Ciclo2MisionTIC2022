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
public class serie implements entregable {

    String titulo = "Serie 1";
    int numTemporadas = 3;
    boolean prestado = false;
    String genero = "Genérico";
    String creador = "Creador 1";

    protected serie() {
    }
    protected serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }
    protected serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }
    
    protected String getTitulo(){
        return titulo;
    }
    protected int getTemporadas(){
        return numTemporadas;
    }
    protected String getGenero(){
        return genero;
    }
    protected String getCreador(){
        return creador;
    }
    
    protected void setTitulo(String newTitulo){
        this.titulo = newTitulo;
    }
    protected void setTemporadas(int newTemporadas){
        this.numTemporadas = newTemporadas;
    }
    protected void setGenero(String newGenero){
        this.genero = newGenero;
    }
    protected void setCreador(String newCreador){
        this.creador = newCreador;
    }
    
    @Override
    public String toString(){
        return ("Título serie: " + titulo + "\nNúmero de temporadas: " + numTemporadas + "\nGénero: " + genero
                + "\nCreador: " + creador + "\nEntregado?: " + prestado);
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

    public void compareTo(ArrayList<serie> a) {
        int mayor = a.get(0).getTemporadas();
        serie Smayor = a.get(0);
        for (serie j : a){
            if (j.getTemporadas() > mayor){
                Smayor = j;
                mayor = Smayor.getTemporadas();
            }
        }
        System.out.println("La serie con mayor número de temporadas es: \n");
        System.out.println(Smayor.toString());
    }

}
