/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author rebek
 */
public class Asiento {
    private String letra;
    private int fila;
    private boolean isEmpty;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(String letra, int fila, boolean isEmpty, Espectador espectador) {
        this.letra = letra;
        this.fila = fila;
        this.isEmpty = isEmpty;
        this.espectador = espectador;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        
        return fila +letra+ empty(isEmpty);
    }
    
    private String empty(boolean emp){
        if(emp){
            return "X";
        } else return " ";
    }
    
    
}
