package Controles;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import pizarrafinal.PizarraContainer;

/**
 *
 * @author pepen
 */
public class DText extends JFrame{
    private String contenido;
    private boolean close = false;
    public DText(PizarraContainer cont){
        this.setTitle("Inserte Texto");
        this.setPreferredSize(new Dimension(300, 100));
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        
        JButton submit = new JButton("Añadir Cuadro de Texto");
        submit.setSize(50, 150);
        this.add(submit, BorderLayout.SOUTH);
        
        JTextField namer = new JTextField();
        namer.setSize(400, 300);
        this.add(namer, BorderLayout.CENTER);
        this.pack();
        
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                 contenido = namer.getText();
                 int index = cont.getTextos().getIndex();
                 int x = evt.getX();
                 int y = evt.getY();
                 cont.getTextos().addText(contenido, x, y, index);
                 close = true;
                 dispose();
            }
        });   
        this.setVisible(true);  
    }
    
    public String getText(){
        return contenido;
    }
}
