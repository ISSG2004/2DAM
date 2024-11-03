package parte1;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{
    PanelBotones panelBtns;
    PanelActividades panelActs;
    public PanelPrincipal(){
        this.setLayout(new BorderLayout());
        this.add(panelBtns = new PanelBotones(), BorderLayout.WEST);
        this.add(panelActs = new PanelActividades(), BorderLayout.CENTER);
    }
}
