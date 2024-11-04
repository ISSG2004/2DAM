package parte1;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
    PanelBotones panelBtns;
    PanelActividades panelActs;
    PanelRecuentoEjs panelRecuento;
    PanelCabecera panelCabecera;
    public PanelPrincipal() {
        this.setLayout(new BorderLayout());
        panelActs = new PanelActividades(); // Crear primero PanelActividades
        panelBtns = new PanelBotones(panelActs.getPanelEj1(),panelActs.getPanelEj2(),panelActs.getPanelEj3(),panelActs.getPanelEj4(),panelActs.getPanelEj5()); // Pasar PanelEj1 a PanelBotones
        panelCabecera = new PanelCabecera();
        panelRecuento = new PanelRecuentoEjs(panelActs.getPanelEj1(),panelActs.getPanelEj2(),panelActs.getPanelEj3(),panelActs.getPanelEj4(),panelActs.getPanelEj5());
        this.add(panelCabecera , BorderLayout.NORTH);
        this.add(panelBtns, BorderLayout.WEST);
        this.add(panelActs, BorderLayout.CENTER);
        this.add(panelRecuento , BorderLayout.SOUTH);
    }
}
