package parte1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelEj2 extends JPanel{
    private JComboBox selectorFuente;
    private JLabel panelTxt=new JLabel("En un lugar de la Mancha, de cuyo nombre...");
    private String[] fuentesTxt={"-","Arial","Calibri","Comic Sans"};
    private Box cajaTxt= Box.createHorizontalBox();
    private boolean visibilidad=false;
    public PanelEj2(){
        selectorFuente= new JComboBox<>(fuentesTxt);
        cajaTxt.add(panelTxt);
        cajaTxt.add(Box.createHorizontalGlue());
        selectorFuente.setPreferredSize(new Dimension(0,20));
        selectorFuente.setMaximumSize(new Dimension(4000, 25));
        //panelTxt.setHorizontalAlignment(SwingConstants.CENTER);
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
