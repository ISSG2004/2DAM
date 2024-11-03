package parte1;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PanelActividades extends JPanel{
    PanelEj1 panelEj1;
    PanelEj2 panelEj2;
    PanelEj3 panelEj3;
    public PanelActividades() {
        // Crear y añadir el subpanel `PanelEj1`
        panelEj1 = new PanelEj1();
        panelEj2=new PanelEj2();
        panelEj3 = new PanelEj3();
        // Establecer el BoxLayout en orientación vertical
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        // Alinear el subpanel al centro (opcional, según el diseño)
        panelEj1.setAlignmentX(CENTER_ALIGNMENT);
        
        // Añadir el panel de ejercicio al contenedor
        this.add(panelEj1);
        this.add(panelEj2);
        this.add(panelEj3);
    }
}
