package parte1;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

public class PanelEj4 extends JPanel{
    private JSlider seekBar;
    private JLabel panelTxt;
    public PanelEj4(){
        seekBar=new JSlider(0,48);
        panelTxt=new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
        
    }
}
