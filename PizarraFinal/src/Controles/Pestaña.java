package Controles;
import java.io.IOException;
import pizarraproject.*;
import javax.swing.*;
import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import pizarrafinal.Pizarra;

/**
 *
 * @author nwroot
 */
public class Pestaña extends JTabbedPane{
    
    private static ArrayList<Pizarra> pizarras;
    private ArrayList<String> names;

    /**
     * Index for current pestana
     */
    public static int index;
    private static Pizarra auxP;

    /**
     * Create a pestana manager
     * @throws IOException
     */
    public Pestaña() throws IOException{
        pizarras = new ArrayList<Pizarra>();
        names = new ArrayList<String>();
        AddPizarra("Pizarra Nueva");
        this.addChangeListener(changeListener);
    }
    
    /**
     * Add a new Pizarra
     * @param name Name for the new pizarra
     * @throws IOException
     */
    public void AddPizarra(String name) throws IOException{
        Pizarra aux = new Pizarra();
        pizarras.add(aux);
        names.add(name);
        this.add(names.get(names.size()-1), pizarras.get( pizarras.size()-1));
    }
    
    /**
     * Delete a Pizarra
     * @param ind Index to delete
     */
    public void DeletePizarra(int ind){
        this.remove(ind);
        pizarras.remove(ind);
        names.remove(ind);
    }
    
    /**
     * Get the current index
     * @return The index
     */
    public int getIndex(){
        return index;
    }
    
    /**
     * Get i'th Pizarra
     * @param i
     * @return
     */
    public Pizarra getPizarra(int i){
        return pizarras.get(i);                
    }
    
    /**
     * Undo an action
     */
    public static void undo(){        
        auxP = pizarras.get(index);
        auxP.remove(); 
    }
    
    /**
     * Redo an action
     */
    public static void redo(){        
        auxP = pizarras.get(index);
        auxP.restore();
    }
    
    /**
     * Clear the screen
     */
    public static void clear(){
        auxP = pizarras.get(index);
        auxP.clear();
    }
    
  ChangeListener changeListener = new ChangeListener() {
        public void stateChanged(ChangeEvent changeEvent) {
        JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
        index = sourceTabbedPane.getSelectedIndex();
        System.out.println("Tab changed to: " + sourceTabbedPane.getTitleAt(index));
      }
    };
    
    
}
