package pizarrafinal;
import Controles.Pestaña;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;

//algo falta hacer para los textos
 /**
* Crear un PizarraContainer
* @throws IOException
*/
public class PizarraContainer extends JPanel {
    private Pestaña pestaña;

    /**
     * Constructor
     * @throws IOException
     */
    public PizarraContainer() throws IOException{
        this.setLayout(new BorderLayout());
        pestaña = new Pestaña();
        this.add(pestaña, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    /**
     * Obetener ventana actual
     * @return ventana
     */
    public Pestaña getPestaña(){
        return pestaña;
    }

}

