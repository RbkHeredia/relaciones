/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Baraja {
    private ArrayList<Carta>baraja = new ArrayList();
    private int posCarta = 0;
    private int cartas = 40;
    Scanner read = new Scanner(System.in);

    public Baraja() {
    }

    public Baraja(int posCarta, int cartas) {
        this.posCarta = posCarta;
        this.cartas = cartas;
    }

    public int getPosCarta() {
        return posCarta;
    }

    public void setPosCarta(int posCarta) {
        this.posCarta = posCarta;
    }

    public int getCartas() {
        return cartas;
    }

    public void setCartas(int cartas) {
        this.cartas = cartas;
    }
    
    Carta carta;
    
    public void nuevaBaraja(){
        String[] palos = {"Basto", "Copa", "Oro", "Espada"};
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if(j != 8 & j != 9){
                    carta = new Carta();
                    carta.setPalo(palos[i]);
                    carta.setNumero(j);
                    baraja.add(carta);
                }
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
    
    public int cartasDisponibles(int resta){
        int disp = this.getCartas()-resta;
        this.setCartas(disp);
        return disp;
    }
    
    public void sigCarta(){
        int pos = this.getPosCarta();
        Carta carta = baraja.get(pos);
        System.out.println(carta.toString());
        this.setPosCarta(pos+1);
    }
    
    public void mostrarBaraja(){
        for (int i = this.getPosCarta(); i < 40 ; i++) {
           baraja.get(i).toString();
        }
    }
    
    public void darCartas(){
        int pedidas;
        System.out.println("Cuantas cartas quiere?");
        pedidas = read.nextInt();
        read.nextLine();
        if(pedidas<=this.getCartas()){
            for (int i = 0; i < pedidas; i++) {
                sigCarta();
            }
            cartasDisponibles(pedidas);
        } else System.out.println("No hay suficientes caartas para mostrar");
    }
    
    public void cartasMonton(){
        if(this.getPosCarta()>0){
            for (int i = 0; i < this.getPosCarta(); i++) {
                baraja.get(i).toString();
            }
        }
    }
    
    
    public void empezar(){
        nuevaBaraja();
        barajar();
        do{
            darCartas();
        }while(this.getCartas()!=0);
        System.out.println("No hay mas cartas");
    }
}
