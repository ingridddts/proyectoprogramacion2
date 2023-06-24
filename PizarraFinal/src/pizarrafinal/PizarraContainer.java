package pizarrafinal;
import Controles.Pestaña;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;

//algo falta hacer para los textos
public class PizarraContainer extends JPanel {
    private Pestaña pestaña;

    /**
     * Creates a PizarraContainer
     * @throws IOException
     */

    public PizarraContainer() throws IOException{
        this.setLayout(new BorderLayout());
        pestaña = new Pestaña();
        this.add(pestaña, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    /**
     * Getter for pestana
     * @return pestana
     */
    public Pestaña getPestaña(){
        return pestaña;
    }

    
    }

