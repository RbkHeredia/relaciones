/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rebek
 * 
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro dog;
        Persona p1 ;
        ArrayList<Persona> personas = new ArrayList();
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            p1 = new Persona();
            System.out.println("Ingresa tu nombre");
            p1.setNombre(read.nextLine());
            System.out.println("Ingresa tu apellido");
            p1.setApellido(read.nextLine());
            System.out.println("Ingresa tu edad");
            p1.setEdad(read.nextInt());
            read.nextLine();
            System.out.println("Ingresa tu numero de dni");
            p1.setDocumento(read.nextInt());
            read.nextLine();
            dog = new Perro();
            System.out.println("Ingresa el nombre del perro a adoptar");
            dog.setNombre(read.nextLine());
            System.out.println("Ingresa la raza del perro");
            dog.setRaza(read.nextLine());
            System.out.println("Ingresa la edad del perro");
            dog.setEdad(read.nextInt());
            read.nextLine();
            System.out.println("Ingresa el tamaño del perro");
            dog.setTamaño(read.nextInt());
            read.nextLine();
            p1.setPerro(dog);
            personas.add(p1);
        }
        
        for (Persona persona : personas) {
            System.out.println(persona.toString());
            
        }
    }
    
}
