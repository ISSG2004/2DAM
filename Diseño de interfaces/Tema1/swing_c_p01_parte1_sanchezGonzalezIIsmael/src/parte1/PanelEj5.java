package parte1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class PanelEj5 extends JPanel{
    private JLabel panelTxt,img1,img2,img3,img4;
    private JSpinner spnrImgs;
    //añadimos las imagenes
    private ImageIcon imagen1 = new ImageIcon(getClass().getResource("../sources/MR.Satan.jpeg"));
    private ImageIcon imagen2 = new ImageIcon(getClass().getResource("../sources/Yamcha.png"));
    private ImageIcon imagen3 = new ImageIcon(getClass().getResource("../sources/Krilin.jpg"));
    private ImageIcon imagen4 = new ImageIcon(getClass().getResource("../sources/Chaoz.png"));
    //redimensionamos imagenes
    private Image imagen1Red = imagen1.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
    private Image imagen2Red = imagen2.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
    private Image imagen3Red = imagen3.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
    private Image imagen4Red = imagen4.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
    private Box cajaControles=Box.createHorizontalBox();
    private Box cajaImagenes=Box.createHorizontalBox();
    private String opcionesSpnr[]={"0","1","2","3","4"};
    private boolean visibilidad=false;
    public PanelEj5(){
        panelTxt= new JLabel("¿Cuántas imágenes quieres mostrar?");
        spnrImgs=new JSpinner(new SpinnerListModel(opcionesSpnr));
        //añadimos las imagenes en labels
        img1 = new JLabel(new ImageIcon(imagen1Red));
        img2 = new JLabel(new ImageIcon(imagen2Red));
        img3 = new JLabel(new ImageIcon(imagen3Red));
        img4 = new JLabel(new ImageIcon(imagen4Red));
        spnrImgs.addChangeListener(e -> {
            cajaImagenes.removeAll();
            String valorSeleccionado=spnrImgs.getValue().toString();
            switch (valorSeleccionado) {
                case "1":
                    cajaImagenes.add(Box.createHorizontalGlue());
                    cajaImagenes.add(img1);
                    cajaImagenes.add(Box.createHorizontalGlue());
                    break;
                case "2":
                    cajaImagenes.add(Box.createHorizontalGlue());
                    cajaImagenes.add(img1);
                    cajaImagenes.add(Box.createHorizontalGlue());
                    cajaImagenes.add(img2);
                    cajaImagenes.add(Box.createHorizontalGlue());
                    break;
                case "3":
                    cajaImagenes.add(img1);
                    cajaImagenes.add(Box.createHorizontalGlue());
                    cajaImagenes.add(img2);
                    cajaImagenes.add(Box.createHorizontalGlue());
                    cajaImagenes.add(img3);
                    break;
                case "4":
                    cajaImagenes.add(img1);
                    cajaImagenes.add(Box.createHorizontalGlue());
                    cajaImagenes.add(img2);
                    cajaImagenes.add(Box.createHorizontalGlue());
                    cajaImagenes.add(img3);
                    cajaImagenes.add(Box.createHorizontalGlue());
                    cajaImagenes.add(img4);
                    break;
                default:
                    break;
            }
            cajaImagenes.revalidate();
            cajaImagenes.repaint();
        });
        cajaControles.add(Box.createHorizontalGlue());
        cajaControles.add(panelTxt);
        cajaControles.add(Box.createHorizontalStrut(10));
        cajaControles.add(spnrImgs);
        cajaControles.add(Box.createHorizontalGlue());
        cajaControles.setPreferredSize(new Dimension(0,15));
        cajaControles.setMaximumSize(new Dimension(500, 20));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(cajaControles);
        this.add(cajaImagenes);
        this.setVisible(false); 
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    public void alternarVisibilidad() {
        this.setVisible(!this.isVisible());
    }
}
