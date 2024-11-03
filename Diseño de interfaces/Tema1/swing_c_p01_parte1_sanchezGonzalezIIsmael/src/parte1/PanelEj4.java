package parte1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

public class PanelEj4 extends JPanel{
    private JSlider seekBar;
    private JLabel panelTxt;
    private Box cajaTxt= Box.createHorizontalBox();
    private Box cajaSeek = Box.createHorizontalBox();
    private boolean visibilidad=false;
    public PanelEj4(){
        seekBar=new JSlider(0,48);
        panelTxt=new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
        cajaTxt.add(panelTxt);
        cajaTxt.add(Box.createHorizontalGlue());
        cajaSeek.add(Box.createHorizontalGlue());
        cajaSeek.add(seekBar);
        cajaSeek.add(Box.createHorizontalGlue());
        cajaSeek.setPreferredSize(new Dimension(0,20));
        cajaSeek.setMaximumSize(new Dimension(500, 25));
        this.setLayout(new BoxLayout(this , BoxLayout.Y_AXIS));
        this.add(cajaSeek);
        this.add(cajaTxt);
        this.setVisible(false); 
        this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.ORANGE), "Ejercicio 4"));
    }

    public void alternarVisibilidad() {
        this.setVisible(!this.isVisible());
    }
}
