package parte1;


import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelBotones extends JPanel {
    private JButton botonEj1;
    private JButton botonEj2;
    private JButton botonEj3;
    private JButton botonEj4;
    private JButton botonEj5;
    private PanelEj1 panelEj1; 
    private PanelEj2 panelEj2;
    private PanelEj3 panelEj3;
    private PanelEj4 panelEj4;
    private PanelEj5 panelEj5;

    public PanelBotones(PanelEj1 panelEj1,PanelEj2 panelEj2,PanelEj3 panelEj3,PanelEj4 panelEj4,PanelEj5 panelEj5) { 
        this.panelEj1 = panelEj1; 
        this.panelEj2 = panelEj2;
        this.panelEj3 = panelEj3;
        this.panelEj4 = panelEj4;
        this.panelEj5 = panelEj5;

        botonEj1 = new JButton("Ejercicio 1");
        botonEj2 = new JButton("Ejercicio 2");
        botonEj3 = new JButton("Ejercicio 3");
        botonEj4 = new JButton("Ejercicio 4");
        botonEj5 = new JButton("Ejercicio 5");

        // Crear una caja vertical
        Box botones = Box.createVerticalBox();
        
        // Añadir botones y espacios verticales
        botones.add(Box.createVerticalStrut(100));
        botones.add(botonEj1);
        botonEj1.addActionListener(e -> panelEj1.alternarVisibilidad());
        botones.add(Box.createVerticalStrut(100));
        botones.add(botonEj2);
        botonEj2.addActionListener(e -> panelEj2.alternarVisibilidad());
        botones.add(Box.createVerticalStrut(100));
        botones.add(botonEj3);
        botonEj3.addActionListener(e -> panelEj3.alternarVisibilidad());
        botones.add(Box.createVerticalStrut(100));
        botones.add(botonEj4);
        botonEj4.addActionListener(e -> panelEj4.alternarVisibilidad());
        botones.add(Box.createVerticalStrut(100));
        botones.add(botonEj5);
        botonEj5.addActionListener(e -> panelEj5.alternarVisibilidad());
        // Añadir la caja al panel
        this.add(botones);
    }
}
