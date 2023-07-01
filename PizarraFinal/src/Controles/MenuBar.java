package Controles;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import pizarrafinal.NewPizarra;
import pizarrafinal.Pizarra;
import pizarrafinal.PizarraContainer;

/**
 * Panel para crear botones barra izquierda
 * @param mb
 * @param load
 * @param delete
 * @param file
 * @param addW
 * @param wind
 */
public class MenuBar extends JMenuBar {
    private JMenuBar mb;
    private JMenuItem load;
    private JMenuItem save;
    private JMenuItem delete;
    private JMenu file;
    private JMenu addW;
    private JFrame wind;    
   
    public MenuBar(JFrame w, PizarraContainer cont){
        w.setLayout(null);
        wind = w;
        mb = new JMenuBar();
        load = new JMenu("Cargar");
        save = new JMenu("Guardar");
        delete = new JMenu("Borrar Pizarra Actual");
        addW = new JMenu("Nueva Pizarra");
        
        addW.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               NewPizarra nueva = new NewPizarra(w, cont);
               System.out.println("Nueva");
            }
        });
        
        load.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Cargar");
            }
        });
        
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               int index = cont.getPestaña().getIndex();
               Pizarra curr_pizarra = cont.getPestaña().getPizarra(index);
               ImageSaver saver = new ImageSaver(curr_pizarra);
                try {
                    BufferedImage image = saver.printScreen(curr_pizarra);
                    saver.save(image);
                } catch (AWTException ex) {
                    Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
                }
               System.out.println("Guardar");
            }
        });
         
         delete.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               int index = cont.getPestaña().getIndex();
               cont.getPestaña().DeletePizarra(index);
               System.out.println("Borrar");
            }
        });
                  */
        w.setJMenuBar(mb);

        
        mb.add(load);
        mb.add(addW);
        mb.add(save);
        mb.add(delete);
        
    }
}
