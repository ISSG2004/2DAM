package parte1;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelRecuentoEjs extends JPanel{
    private JButton btnRecuento;
    private PanelEj1 panelEj1; 
    private PanelEj2 panelEj2;
    private PanelEj3 panelEj3;
    private PanelEj4 panelEj4;
    private PanelEj5 panelEj5;
    private int contador = 0;
    public PanelRecuentoEjs(PanelEj1 panelEj1,PanelEj2 panelEj2,PanelEj3 panelEj3,PanelEj4 panelEj4,PanelEj5 panelEj5){
        this.panelEj1 = panelEj1; 
        this.panelEj2 = panelEj2;
        this.panelEj3 = panelEj3;
        this.panelEj4 = panelEj4;
        this.panelEj5 = panelEj5;
        Box cajaPanelRec=Box.createHorizontalBox();
        btnRecuento=new JButton("Ejercicios activos");
        ArrayList<String> ejsActivos = new ArrayList<String>();
        btnRecuento.addActionListener(e -> {
            ejsActivos.clear();   // Limpiar la lista para evitar duplicados
            contador=0;
            // Revisar la visibilidad de cada panel
            if (panelEj1.isVisible()) {
                ejsActivos.add("Ejercicio 1");
                contador++;
            }
            if (panelEj2.isVisible()) {
                ejsActivos.add("Ejercicio 2");
                contador++;
            }
            if (panelEj3.isVisible()) {
                ejsActivos.add("Ejercicio 3");
                contador++;
            }
            if (panelEj4.isVisible()) {
                ejsActivos.add("Ejercicio 4");
                contador++;
            }
            if (panelEj5.isVisible()) {
                ejsActivos.add("Ejercicio 5");
                contador++;
            }

            // Construir el mensaje con los ejercicios activos y el contador
            String mensaje = "Ejercicios activos: "+contador+"\n"+"Los ejercicios activos son: "+"\n" + String.join(", ", ejsActivos);

            // Mostrar el mensaje en una ventana emergente
            JOptionPane.showMessageDialog(null, mensaje, "Ejercicios activos", JOptionPane.INFORMATION_MESSAGE);
        });
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        cajaPanelRec.add(Box.createHorizontalGlue());
        cajaPanelRec.add(btnRecuento);
        cajaPanelRec.add(Box.createHorizontalGlue());
        cajaPanelRec.add(Box.createVerticalStrut(130));
        this.add(cajaPanelRec);
    }
}
