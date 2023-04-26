/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DecoradorBiblio;

/**
 *
 * @author SG701-17
 */
public class ConcreteDecorator_2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("Comportamiento extendido previo 2");
        super.doJob();
        //Agregando 
        System.out.println("Señor Usurario su prestamos de libro y Revista Estan por expirar" );
        System.out.println("Comportamiento extendido posterior 2");
    }
    

}
