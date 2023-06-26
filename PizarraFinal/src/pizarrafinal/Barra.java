package pizarrafinal;
import Controles.Mode;

import java.awt.*;
import javax.swing.*;

/**
 * Crear Barra de opciones
 * @param barraEditar
 * @param barraBorrar
 * @param barraColores
 */
public class Barra extends JPanel{
    Editar barraEditar;
    Borrar barraBorrar;
    Colores barraColores;
    
    /**
     * Constructor
     * @param window_aux
     * @param p
     */
    public Barra(Window window_aux, PizarraContainer p){
        
        this.setPreferredSize(new Dimension(480, 450));
        this.setBackground(Color.getHSBColor(10, 50, 100));
                
        barraEditar = new Editar(p);
        barraBorrar = new Borrar();   
        barraColores = new Colores();
        
        new Mode(this);
        
        this.add(barraEditar, BorderLayout.SOUTH);
        this.add(barraBorrar, BorderLayout.SOUTH);
        this.add(barraColores, BorderLayout.SOUTH);
                        
        barraEditar.setVisible(true);
        barraBorrar.setVisible(false);   
    }

    /**
     * Obtener BarraBorrar
     * @return barraBorrar
     */
    public Borrar getBorrar(){
        return barraBorrar;
    }

    /**
     * Obtener BarraEditar
     * @return barraEditar
     */
    public Editar getEditar(){
        return barraEditar;
    }
}
