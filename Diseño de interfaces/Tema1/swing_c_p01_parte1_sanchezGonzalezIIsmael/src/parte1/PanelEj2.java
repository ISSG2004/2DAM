package parte1;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class PanelEj2 extends JPanel{
    private JComboBox selectorFuente;
    private JLabel panelTxt=new JLabel("En un lugar de la Mancha, de cuyo nombre...");
    private String[] fuentesTxt={"-","Arial","Calibri","Comic Sans"};
    public PanelEj2(){
        selectorFuente= new JComboBox<>(fuentesTxt);
        selectorFuente.setPreferredSize(new Dimension(0,25));
        panelTxt.setHorizontalAlignment(SwingConstants.CENTER);
        this.setLayout(new BorderLayout());
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.add(Box.createVerticalStrut(30));
        this.add(selectorFuente);
        this.add(Box.createVerticalStrut(30));
        this.add(panelTxt);
        //añadir el metodo combo.box.getSelectedItem para obtener el texto
    }
}
