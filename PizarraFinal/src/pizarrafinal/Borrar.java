package pizarrafinal;

import Controles.BotonesBorrar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Borrar extends JPanel{
    
    BotonesBorrar botones;

    public Borrar(){
        
        this.setBounds(50, 20, 100, 100);
        this.setPreferredSize(new Dimension(180, 300));
        this.setBackground(Color.LIGHT_GRAY);
        
        this.setLayout(null);        

        botones = new BotonesBorrar(this);
        
        this.revalidate();
        this.repaint();
    }
}
