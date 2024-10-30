package p01;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel{
    JButton botonEj1;
    JButton botonEj2;
    JButton botonEj3;
    JButton botonEj4;
    JButton botonEj5;
    public PanelBotones (){
        //Se puede hacer con un layout o creando una caja
        //this.setLayout(new BoxLayout( this , BoxLayout.Y_AXIS ));//Creamos una columna con los botones y los añadimos al layout
        //Caja
        Box botones = Box.createVerticalBox();
        //añadiendo elementos y espaciados a la caja
        botones.add(Box.createVerticalStrut(50)); 
        botones.add(botonEj1 = new JButton("Ejercicio 1"));
        botones.add(Box.createVerticalStrut(50)); 
        botones.add(botonEj2 = new JButton("Ejercicio 2"));
        botones.add(Box.createVerticalStrut(50));
        botones.add(botonEj3 = new JButton("Ejercicio 3"));
        botones.add(Box.createVerticalStrut(50));
        botones.add(botonEj4 = new JButton("Ejercicio 4"));
        botones.add(Box.createVerticalStrut(50));
        botones.add(botonEj5 = new JButton("Ejercicio 5"));
        this.add(botones);//añadimos los elementos al panel
    }
}
