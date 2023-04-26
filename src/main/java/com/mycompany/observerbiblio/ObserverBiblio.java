/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.observerbiblio;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class ObserverBiblio {

    public static void main(String[] args) {
        //crear observadores
        Scanner in = new Scanner(System.in);
        Observer ob1 = new Observer();
        Subject Libro = new Subject();
        int opc = 0;
        while (true) {
            System.out.println("Bienvenido a la Biblioteca universidad piloto \n"
                    + "1. Registar un observador. \n"
                    + "2. Desinscribirse. \n"
                    + "3. Regresar el libro. \n"
                    + "4. Salir");
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Registrando un observador...");
                    Libro.register(ob1);
                    break;
                case 2:
                    System.out.println("Eliminando un observador...");
                    Libro.unregister(ob1);
                    break;
                case 3:
                    System.out.println("Estado del Libro: " + Libro.getFlag());
                    Libro.setFlag(1);
                    System.out.println("Estado del libro: " + Libro.getFlag());
                    break;
                case 4:
                    System.exit(0);
                    
            }
        }
    }
}
