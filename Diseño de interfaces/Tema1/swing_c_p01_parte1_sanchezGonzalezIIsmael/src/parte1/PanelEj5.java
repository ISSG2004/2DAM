package parte1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class PanelEj5 extends JPanel{
    private JLabel panelTxt;
    private JSpinner spnrImgs;
    private Box cajaControles=Box.createHorizontalBox();
    private Box cajaImagenes=Box.createHorizontalBox();
    private String opcionesSpnr[]={"0","1","2","3","4"};
    private boolean visibilidad=false;
    public PanelEj5(){
        panelTxt= new JLabel("¿Cuántas imágenes quieres mostrar?");
        spnrImgs=new JSpinner(new SpinnerListModel(opcionesSpnr));
        cajaControles.add(Box.createHorizontalGlue());
        cajaControles.add(panelTxt);
        cajaControles.add(Box.createHorizontalStrut(10));
        cajaControles.add(spnrImgs);
        cajaControles.add(Box.createHorizontalGlue());
        cajaControles.setPreferredSize(new Dimension(0,15));
        cajaControles.setMaximumSize(new Dimension(500, 20));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(cajaControles);
        this.setVisible(false); 
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    public void alternarVisibilidad() {
        this.setVisible(!this.isVisible());
    }
}
