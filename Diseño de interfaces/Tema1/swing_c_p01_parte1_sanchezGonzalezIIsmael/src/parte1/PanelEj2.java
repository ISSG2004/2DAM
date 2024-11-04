package parte1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelEj2 extends JPanel{
    private JComboBox selectorFuente;
    private JLabel panelTxt=new JLabel("En un lugar de la Mancha, de cuyo nombre...");
    private String[] fuentesTxt={"-","Arial","Georgia","Times New Roman"};
    private Box cajaTxt= Box.createHorizontalBox();
    private boolean visibilidad=false;
    public PanelEj2(){
        selectorFuente= new JComboBox<>(fuentesTxt);
        panelTxt.setFont(new Font("Courier New", Font.BOLD, 24));//fijamos estas especificaciones por defecto para la fuente de txt
        cajaTxt.add(panelTxt);
        cajaTxt.add(Box.createHorizontalGlue());
        //selectorFuente.setPreferredSize(new Dimension(0,20));
        selectorFuente.setMaximumSize(new Dimension(4000, 25));
        selectorFuente.addActionListener(e->{//Evento para cambiar la fuente en funcion del elemento seleccionado
            String opcionSeleccionada=selectorFuente.getSelectedItem().toString();
            switch (opcionSeleccionada) {
                case "Arial":
                    panelTxt.setFont(new Font("Arial", Font.BOLD, 24));
                    break;
                case "Georgia":
                    panelTxt.setFont(new Font("Georgia", Font.BOLD, 24));
                    break;
                case "Times New Roman":
                    panelTxt.setFont(new Font("Times New Roman", Font.BOLD, 24));
                    break;
                default:
                    panelTxt.setFont(new Font("Courier New", Font.BOLD, 24));
                    break;
            }
        });
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.add(Box.createVerticalStrut(30));
        this.add(selectorFuente);
        this.add(Box.createVerticalStrut(30));
        this.add(cajaTxt);
        this.setVisible(false);
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        //añadir el metodo combo.box.getSelectedItem para obtener el texto
        
    }

    public void alternarVisibilidad() {
        this.setVisible(!this.isVisible());
    }
}
