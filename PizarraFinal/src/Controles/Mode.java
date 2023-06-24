
package Controles;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JButton;
import pizarrafinal.Barra;
import pizarraproject.*;

/**
 *
 * @author nwroot
 */
public class Mode extends JButton{
    
    JButton editar;
    JButton borrar;
    Barra barra;
    JPanel auxPanel;
    JPanel sPanel;
    
    /**
     * Create a Mode
     * @param barraAux
     */
    public Mode(Barra barraAux){
        barra = barraAux;
        
        auxPanel = new JPanel();
        sPanel = new JPanel();
        
        auxPanel.setPreferredSize(new Dimension(0,0));
        auxPanel.setBackground(Color.LIGHT_GRAY);
        barra.add(auxPanel,BorderLayout.NORTH);
        
        sPanel.setPreferredSize(new Dimension(0,100));
        sPanel.setBackground(Color.LIGHT_GRAY);
        
                
        editar = new JButton("Herramientas");
        editar.setBackground(Color.GREEN);
        editar.setPreferredSize(new Dimension(280,40));     
        editar.setFocusable(false);

        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               
                editar.setBackground(Color.GREEN);
                borrar.setBackground(Color.gray);
                barra.getBorrar().setVisible(true);
                barra.getEditar().setVisible(true);
                System.out.println("Herramientas");
            }
        });
        
        barra.add(editar, BorderLayout.AFTER_LAST_LINE);
                        
        borrar = new JButton("Borrar");
        borrar.setBackground(Color.gray);
        borrar.setPreferredSize(new Dimension(180,40));

        borrar.setFocusable(false);

        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               
                borrar.setBackground(Color.GREEN);
                editar.setBackground(Color.GRAY);
                barra.getBorrar().setVisible(true);
                barra.getEditar().setVisible(false);
                System.out.println("Borrar");
            }
        });
         
        barra.add(borrar, BorderLayout.EAST);
        
        barra.add(sPanel,BorderLayout.SOUTH);
    }

   
}

