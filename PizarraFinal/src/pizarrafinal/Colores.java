package pizarrafinal;

import Controles.BotonesColores;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Colores extends JPanel {
    
    private BotonesColores botones;
    
    /**
     * Constructor de Colores
     */
    public Colores() {
        this.setPreferredSize(new Dimension(180, 300));
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        
        botones = new BotonesColores(this);
    }
    
    /**
     * Obtener el objeto BotonesColores
     * @return El objeto BotonesColores
     */
    public BotonesColores getBotones() {
        return botones;
    }
}
