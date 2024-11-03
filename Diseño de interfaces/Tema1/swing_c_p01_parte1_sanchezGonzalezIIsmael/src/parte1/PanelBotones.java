package parte1;


import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel{
    JButton botonEj1;
    JButton botonEj2;
    JButton botonEj3;
    JButton botonEj4;
    JButton botonEj5;
    public PanelBotones() {
        // Crear una caja vertical
        Box botones = Box.createVerticalBox();

        // Añadir botones y espacios verticales
        botones.add(Box.createVerticalStrut(100)); 
        botones.add(botonEj1 = new JButton("Ejercicio 1"));
        botones.add(Box.createVerticalStrut(100)); 
        botones.add(botonEj2 = new JButton("Ejercicio 2"));
        botones.add(Box.createVerticalStrut(100));
        botones.add(botonEj3 = new JButton("Ejercicio 3"));
        botones.add(Box.createVerticalStrut(100));
        botones.add(botonEj4 = new JButton("Ejercicio 4"));
        botones.add(Box.createVerticalStrut(100));
        botones.add(botonEj5 = new JButton("Ejercicio 5"));
    // Añadir la caja al panel
        this.add(botones);
    }
}
