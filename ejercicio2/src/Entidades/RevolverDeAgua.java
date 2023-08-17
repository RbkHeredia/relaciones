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
public class RevolverDeAgua {
    private int posicionActual; //6 lugares
    private int posicionAgua; //6 lugares
    Scanner read = new Scanner(System.in);

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    public void llenarRevolver(){
        this.setPosicionAgua((int)(Math.random()*6+1));
        this.setPosicionActual((int)(Math.random()*6+1));
    }
    
    public boolean mojar(){
        int posAgua = this.getPosicionAgua();
        int posActual = this.getPosicionActual();
        return posAgua == posActual;
    }
    
    public void siguienteChorro(){
        int tambor = this.getPosicionActual();
        if(tambor<6){
            this.setPosicionActual(tambor+1);
        } else this.setPosicionActual(1);
    }
    
    public void toStringRev(){
        System.out.println(this.toString());
    }
    
}
