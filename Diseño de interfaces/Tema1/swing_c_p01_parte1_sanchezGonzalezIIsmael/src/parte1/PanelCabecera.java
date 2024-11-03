package parte1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCabecera extends JPanel{
    private ImageIcon imagen;
    private Box cajaCabecera= Box.createHorizontalBox();
    private JLabel txtCabecera,contImg;
    public PanelCabecera(){
        imagen = new ImageIcon(getClass().getResource("../sources/logoAlandalus.jpg"));
        contImg = new JLabel(imagen);
        txtCabecera = new JLabel("Alumno: Ismael Sánchez González");
        cajaCabecera.add(Box.createHorizontalGlue());
        cajaCabecera.add(contImg);
        cajaCabecera.add(Box.createHorizontalStrut(20));
        cajaCabecera.add(txtCabecera);
        cajaCabecera.add(Box.createHorizontalGlue());
        cajaCabecera.setMaximumSize(new Dimension(3000,200) );
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(cajaCabecera);
        this.setBorder(BorderFactory.createLineBorder(Color.RED));
    }
}
