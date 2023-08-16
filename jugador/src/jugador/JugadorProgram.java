/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;

/**
 *
 * @author rebek
 * 
 * Realiza un programa en donde exista una clase Jugador 
 * que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. 
* Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada 
* jugador.
 */
public class JugadorProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList jugadores = new ArrayList();
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        Equipo eq = new Equipo();
        j1.setNombre("Maximo");
        j1.setApellido("Rodriguez");
        j1.setNumero(5);
        j1.setPosicion("ala");
        j2.setNombre("Rbk");
        j2.setApellido("Heredia");
        j2.setNumero(5);
        j2.setPosicion("nada");
        jugadores.add(j1);
        jugadores.add(j2);

        eq.setJugadores(jugadores);
        System.out.println(eq.toString());
    }
    
}
