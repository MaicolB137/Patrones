/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DecoradorBiblio;

/**
 *
 * @author SG701-17
 */
public class AbstractDecorator extends Component {
    //Atributos
    protected Component componente;
    //private ConcreteComponent componente;

    @Override
    public void doJob() {
        if(componente!=null)
            componente.doJob();
        
    }

    public void setComponente(Component componente) {
        this.componente = componente;
    }
    
}
