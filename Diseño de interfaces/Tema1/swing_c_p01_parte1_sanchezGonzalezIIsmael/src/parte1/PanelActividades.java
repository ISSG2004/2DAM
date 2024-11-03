package parte1;

import javax.swing.*;
import java.awt.*;

public class PanelActividades extends JPanel {
    PanelEj1 panelEj1;
    PanelEj2 panelEj2;
    PanelEj3 panelEj3;
    PanelEj4 panelEj4;
    PanelEj5 panelEj5;

    public PanelActividades() {
        // Crear y añadir el subpanel `PanelEj1`
        panelEj1 = new PanelEj1();
        panelEj2 = new PanelEj2();
        panelEj3 = new PanelEj3();
        panelEj4 = new PanelEj4();
        panelEj5 = new PanelEj5();
        this.setLayout(new GridLayout(5, 1));
        
        // Añadir el panel de ejercicio al contenedor
        this.add(panelEj1);
        this.add(panelEj2);
        this.add(panelEj3);
        this.add(panelEj4);
        this.add(panelEj5);
    }

    public PanelEj1 getPanelEj1() {
        return panelEj1; // Método para obtener la instancia de PanelEj1
    }
    public PanelEj2 getPanelEj2(){
        return panelEj2;
    }
    public PanelEj3 getPanelEj3(){
        return panelEj3;
    }
    public PanelEj4 getPanelEj4(){
        return panelEj4;
    }
    public PanelEj5 getPanelEj5(){
        return panelEj5;
    }
}
