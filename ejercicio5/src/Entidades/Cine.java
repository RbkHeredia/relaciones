/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Cine {
    private Pelicula pelicula;
    private ArrayList<ArrayList<Asiento>> sala;
    private double entrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, ArrayList<ArrayList<Asiento>> sala, double entrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.entrada = entrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<ArrayList<Asiento>> getSala() {
        return sala;
    }

    public void setSala(ArrayList<ArrayList<Asiento>> sala) {
        this.sala = sala;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", entrada=" + entrada + '}';
    }
    
    Asiento a;    
    Scanner read = new Scanner(System.in);
    Pelicula peli;
    public void crearSala(){
        sala = new ArrayList<>();
        peli = new Pelicula();
        String letters[] = {"A", "B", "C", "D", "E", "F"};
        for (int i = 0; i < 8; i++) {
            sala.add(new ArrayList<>());
            for (int j = 0; j < 6; j++) {
                a= new Asiento();
                a.setFila(i+1);
                a.setLetra(letters[j]);
                a.setIsEmpty(false);
                sala.get(i).add(a);
            }
        }
        System.out.println("Ingrese el precio de la entrada: ");
        this.setEntrada(read.nextDouble());
        read.nextLine();
        peli = peli.crearPelicula();
    }
    
    public void asignarAsiento(Espectador cliente){
        int fila = filaRandom();
        int col = colRandom();
        System.out.println(fila + col);
        if(!edadMin(cliente.getEdad())){
            System.out.println("El cliente "+ cliente.getNombre() + " no tiene suficiente edad");
        } else if(!dineroDisp(cliente.getDineroDisponible())){
            System.out.println("El cliente "+ cliente.getNombre()+ " no tiene suficiente dinero");
        } else if(!sala.get(fila).get(col).isIsEmpty() ){
            sala.get(fila).get(col).setIsEmpty(true);
            sala.get(fila).get(col).setEspectador(cliente);
        } else System.out.println("Asiento ocupado");
    }
    
    public void mostrarSala(){
        for (ArrayList<Asiento> asiento : sala) {
            System.out.println(asiento);
        }
    }
    
    public int filaRandom(){
        return (int)(Math.random()*7);
    }
    public int colRandom(){
        return (int)(Math.random()*5);
    }
    
    public boolean edadMin(int edad){
        return peli.getEdadMinima()<=edad;
    }
    
    public boolean dineroDisp(double dinero){
        return this.getEntrada()<=dinero;
    }
}
