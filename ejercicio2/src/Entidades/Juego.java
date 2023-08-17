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
public class Juego {
    private ArrayList<Jugador>jugadores = new ArrayList();
    private RevolverDeAgua revolver = new RevolverDeAgua();
    Jugador j1;
    
    Scanner read = new Scanner(System.in);
    
    public void llenarJuego(){
        String nombre;
        System.out.println("Ingrese la cantidad de jugadores. Valores permitidos: 1 a 6. \n Si no ingresa un valor correcto se asignarán 6 jugadores");
        int cantJug = read.nextInt();
        read.nextLine();
        if(cantJug <1 || cantJug >6){
            cantJug = 6;
        }
        for (int i = 0; i < cantJug; i++) {
            j1 = new Jugador();
            System.out.println("Ingrese el nombre del jugador");
            nombre = read.nextLine();
            j1.setNombre(nombre + " "+(i+1));
            j1.setId(i+1);
            j1.setMojado(false);
            jugadores.add(j1);
        }
        revolver.llenarRevolver();
    }
    
    public void mostrar(){
        for (Jugador jugador : jugadores) {
            jugador.toString();
        }
        revolver.toStringRev();
    }
    
    public void ronda(){
        boolean muerto = false;
        int ronda = 1;
        do{
            System.out.println("Ronda "+ronda);
            for (Jugador jugador : jugadores) {
                if(!jugador.isMojado() && !muerto){
                     revolver.toStringRev();
                     muerto = jugador.disparo(revolver);
                     
                     if(muerto){
                         System.out.println("Jugador mojado: " +jugador.getNombre());
                         
                         break;
                     }
                } 
                jugador.toString();
            }
            ronda += 1;
            
        }while (!muerto);
        
        
    }
}
