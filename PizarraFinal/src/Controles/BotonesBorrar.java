package Controles;
import java.awt.*;
import javax.swing.*;
import pizarrafinal.*;

/**
 *
 * @author nwroot
 */
public class BotonesBorrar extends JPanel{
    
    private JButton object;    
    private JButton all;
    private Borrar borrar;
    
    /**
     * Creates a BotonesBorrar
     * @param b
     */
    public BotonesBorrar(Borrar b){
        
        borrar = b;                
        
        
        all = new JButton();
        all.setFocusable(false);
        all.setBounds(10,10,150, 150);
        all.setBackground(Color.GRAY);
        ImageIcon allIcon = new ImageIcon("basura.png");
        all.setIcon(allIcon);
        all.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Brorrar todo");
               setColor();
               all.setBackground(Color.GREEN);    
               Pestaña.clear();
            }
        });
        
    
        borrar.add(all);
    }
    
    /**
     * Set the color to gray
     */
    public void setColor(){
    
        all.setBackground(Color.GRAY);
             
        
    }
}
