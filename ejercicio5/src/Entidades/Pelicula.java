/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Pelicula {
    private String titulo;
    private double duracion;
    private int edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
    Scanner read = new Scanner(System.in);
    Pelicula peli;
    public Pelicula crearPelicula(){
        peli = new Pelicula();
        System.out.println("Titulo de la pelicula");
        peli.setTitulo(read.nextLine());
        System.out.println("Duracion de la pelicula");
        peli.setDuracion(read.nextDouble());
        read.nextLine();
        System.out.println("Edad Minima");
        peli.setEdadMinima(read.nextInt());
        read.nextLine();
        System.out.println("Director");
        peli.setDirector(read.nextLine());
        return peli;
    }
    
}
