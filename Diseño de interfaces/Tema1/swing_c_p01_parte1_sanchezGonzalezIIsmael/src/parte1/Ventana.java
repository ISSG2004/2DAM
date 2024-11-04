package parte1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Ventana extends JFrame{
    PanelPrincipal mainPanel;
    Dimension dimensionesPantalla = Toolkit.getDefaultToolkit().getScreenSize();
    public Ventana(){
        super("Practica01_Compendio");
        mainPanel= new PanelPrincipal();
        ImageIcon icono = new ImageIcon(getClass().getResource("../sources/LogoCabecera.jpeg"));
        setIconImage(icono.getImage());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize((int)dimensionesPantalla.getWidth(),(int)dimensionesPantalla.getHeight());
        this.add(mainPanel);
        this.setVisible(true);
    }
}
