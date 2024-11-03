package parte1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton; 

public class PanelEj3 extends JPanel{
    private JLabel panelTxt = new JLabel("En un lugar de la Mancha, de cuyo nombre...");
    private Box cajaRadioBox=Box.createHorizontalBox();
    private Box cajaTxt=Box.createHorizontalBox();
    private JRadioButton radioPeque, radioMedi,radioGrande,radioXGrande;
    private boolean visibilidad=false;
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
        cajaTxt.add(panelTxt);
        cajaTxt.add(Box.createHorizontalGlue());
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.add(cajaTxt);
        this.add(cajaRadioBox);
        this.setVisible(false);
        this.setBorder(BorderFactory.createLineBorder(Color.PINK));
        
    }

    public void alternarVisibilidad() {
        this.setVisible(!this.isVisible());
    }
}
