package parte1;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton; 

public class PanelEj3 extends JPanel{
    private JLabel panelTxt = new JLabel("En un lugar de la Mancha, de cuyo nombre...");
    private Box cajaRadioBox=Box.createHorizontalBox();
    private JRadioButton radioPeque, radioMedi,radioGrande,radioXGrande;
    public PanelEj3(){
        radioPeque = new JRadioButton("Pequeño");
        radioMedi = new JRadioButton("Mediano");
        radioGrande = new JRadioButton("Grande");
        radioXGrande = new JRadioButton("Muy Grande");
        cajaRadioBox.add(Box.createHorizontalGlue());
        cajaRadioBox.add(radioPeque);
        cajaRadioBox.add(radioMedi);
        cajaRadioBox.add(radioGrande);
        cajaRadioBox.add(radioXGrande);
        cajaRadioBox.add(Box.createHorizontalGlue());
        
        this.setLayout(new BorderLayout(0,0));
        this.add(panelTxt, BorderLayout.NORTH);
        this.add(cajaRadioBox, BorderLayout.CENTER);
        // añadir el metodo combo.box.getSelectedItem para obtener el texto
    }
}
