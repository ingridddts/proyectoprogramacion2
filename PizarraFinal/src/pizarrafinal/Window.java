package pizarrafinal;
import Controles.MenuBar;

import java.awt.BorderLayout;
import java.awt.Color;  
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author nwroot
 */
public class Window extends JFrame {
    private PizarraContainer pizarracont;
    private Barra barra;
   
    /**
     * Creates the main window
     * @throws IOException
     */
    
    public Window() throws IOException{
        pizarracont = new PizarraContainer();
        new MenuBar(this, pizarracont);        
        barra = new Barra(this, pizarracont);                        

        this.setLayout(new BorderLayout());
        
        this.setTitle("Pizarra Casos De Usos");
        this.setSize(1300, 700);
        this.setMinimumSize(new Dimension(1000, 600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.getContentPane().setBackground(new Color(126, 114, 159));                

        this.add(barra, BorderLayout.WEST);
        this.add(pizarracont, BorderLayout.CENTER);
                
        this.setVisible(true);
        
        
    }

    /**
     * Getter for PizarraContainer
     * @return PizarraContainer
     */
    public PizarraContainer getPiz(){
        return pizarracont;
    }
}

  
