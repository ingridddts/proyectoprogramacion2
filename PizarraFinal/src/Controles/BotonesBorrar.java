package Controles;
import java.awt.*;
import javax.swing.*;
import pizarrafinal.*;

/**
 * crear los botones para borrar
 * @param object akmacena info Jbutton 
 * @param all almacena info del Jbutton borrar
 * @param borrar contiene 
 */
public class BotonesBorrar extends JPanel{
    
    private JButton object;    
    private JButton all;
    private Borrar borrar;
    
    /**
     * constructor BotonesBorrar
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
     * cambia el color de fondo a gris
     */
    public void setColor(){
    
        all.setBackground(Color.GRAY);
             
        
    }
}
