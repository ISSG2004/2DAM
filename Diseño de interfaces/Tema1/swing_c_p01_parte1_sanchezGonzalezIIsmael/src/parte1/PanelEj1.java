package parte1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelEj1 extends JPanel {
    private JLabel panelTxt;
    private JCheckBox checkNegrita;
    private JCheckBox checkCursiva;
    private Box cajaTxt = Box.createHorizontalBox();
    private Box cajaBotones = Box.createHorizontalBox();
    
    public PanelEj1() {
        // Configuramos el panel con un BoxLayout en orientación vertical
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        // Inicializamos los componentes
        checkCursiva = new JCheckBox("Cursiva");
        checkNegrita = new JCheckBox("Negrita");
        panelTxt = new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
        panelTxt.setFont(new Font("Arial", Font.PLAIN, 24));
        
        checkCursiva.addActionListener(e -> {
            if (checkCursiva.isSelected() && checkNegrita.isSelected()) {
                panelTxt.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 24));
            } else if (checkCursiva.isSelected()) {
                panelTxt.setFont(new Font("Arial", Font.ITALIC, 24));
            } else if (checkNegrita.isSelected()) {
                panelTxt.setFont(new Font("Arial", Font.BOLD, 24));
            } else {
                panelTxt.setFont(new Font("Arial", Font.PLAIN, 24));
            }
        });
        
        checkNegrita.addActionListener(e -> {
            if (checkCursiva.isSelected() && checkNegrita.isSelected()) {
                panelTxt.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 24));
            } else if (checkNegrita.isSelected()) {
                panelTxt.setFont(new Font("Arial", Font.BOLD, 24));
            } else if (checkCursiva.isSelected()) {
                panelTxt.setFont(new Font("Arial", Font.ITALIC, 24));
            } else {
                panelTxt.setFont(new Font("Arial", Font.PLAIN, 24));
            }
        });
        // Caja horizontal para los botones
        cajaTxt.add(panelTxt);
        cajaTxt.add(Box.createHorizontalGlue());
        cajaBotones.add(Box.createHorizontalGlue());
        cajaBotones.add(checkCursiva);
        cajaBotones.add(checkNegrita);
        cajaBotones.add(Box.createHorizontalGlue());
        this.add(Box.createVerticalGlue());
        this.add(cajaTxt);
        this.add(Box.createVerticalStrut(30));
        this.add(cajaBotones);
        this.add(Box.createVerticalGlue());
        this.setVisible(false); 
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public void alternarVisibilidad() {
        this.setVisible(!this.isVisible());
    }
}