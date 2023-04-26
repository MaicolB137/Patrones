/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.DecoradorBiblio;

import java.util.Scanner;

/**
 *
 * @author SG701-17
 */
public class DecoratorBiblio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecorator_1 cd_1 = new ConcreteDecorator_1();
        ConcreteDecorator_2 cd_2 = new ConcreteDecorator_2();
        int opc = 0;
        while(true){
        System.out.println("Bienvenido a la Biblioteca universidad piloto \n"
                + "1. Enviar notificaciones de libros. \n"
                + "2. Enviar notificaciones de Revistas. \n"
                + "3. Enviar notificacion de Libro/Revistas \n"
                + "4. Salir");
        opc = in.nextInt();
            switch (opc) {
                case 1:
                    cc.doJob();
                    break;
                case 2:
                    cd_1.doJob();
                    break;
                case 3:
                    cd_2.doJob();
                    break;
                case 4:
                    System.exit(0);
                default:
                   System.out.println("Opción incorrecta, intente de nuevo:");
            }
        }
    }
}
