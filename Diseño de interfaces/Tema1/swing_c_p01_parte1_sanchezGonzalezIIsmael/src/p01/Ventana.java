package p01;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Ventana extends JFrame{
    PanelBotones panelBtns;
    Dimension dimensionesPantalla = Toolkit.getDefaultToolkit().getScreenSize();
    public Ventana(){
        super("Practica01_Compendio");
        this.setLayout(new BorderLayout());//Modificar y poner un gridBagLayout que se adapte a lo que necesitamos
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panelBtns = new PanelBotones() , BorderLayout.WEST);
        this.setSize((int)dimensionesPantalla.getWidth(),(int)dimensionesPantalla.getHeight());
        this.setVisible(true);
    }
}
