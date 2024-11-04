package parte1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton; 

public class PanelEj3 extends JPanel{
    private JLabel panelTxt = new JLabel("En un lugar de la Mancha, de cuyo nombre...");
    private Box cajaRadioBox=Box.createHorizontalBox();
    private Box cajaTxt=Box.createHorizontalBox();
    ButtonGroup group;//asignamos un grupo de botones
    private JRadioButton radioPeque, radioMedi,radioGrande,radioXGrande;
    private boolean visibilidad=false;
    public PanelEj3(){
        panelTxt.setFont(new Font("Arial", Font.PLAIN, 18));
        radioPeque = new JRadioButton("Pequeño");
        radioPeque.addActionListener(e -> panelTxt.setFont(new Font("Arial", Font.PLAIN, 8)));
        radioMedi = new JRadioButton("Mediano");
        radioMedi.addActionListener(e -> panelTxt.setFont(new Font("Arial", Font.PLAIN, 16)));
        radioGrande = new JRadioButton("Grande");
        radioGrande.addActionListener(e -> panelTxt.setFont(new Font("Arial", Font.PLAIN, 35)));
        radioXGrande = new JRadioButton("Muy Grande");
        radioXGrande.addActionListener(e -> panelTxt.setFont(new Font("Arial", Font.PLAIN, 50)));
        group = new ButtonGroup();
        group.add(radioGrande);
        group.add(radioXGrande);
        group.add(radioMedi);
        group.add(radioPeque);
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
