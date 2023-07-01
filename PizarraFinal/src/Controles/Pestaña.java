package Controles;
import java.io.IOException;
import javax.swing.*;
import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import pizarrafinal.Pizarra;

/**
 * crear/manejar ventana
 * @param index indice pestaña actual
 * @param auxP variable temporal para almacenar pizarra
 */
public class Pestaña extends JTabbedPane{
    private static ArrayList<Pizarra> pizarras;
    private ArrayList<String> names;
    public static int index;
    private static Pizarra auxP;

    /**
     * crear ventana constructor
     * @throws IOException
     */
    public Pestaña() throws IOException{
        pizarras = new ArrayList<Pizarra>();
        names = new ArrayList<String>();
        AddPizarra("Pizarra Nueva");
        this.addChangeListener(changeListener);
    }
    
    /**
     * Agregar nueva Pizarra
     * @param name nombre pizarra
     * @throws IOException
     */
    public void AddPizarra(String name) throws IOException{
        Pizarra aux = new Pizarra();
        pizarras.add(aux);
        names.add(name);
        this.add(names.get(names.size()-1), pizarras.get( pizarras.size()-1));
    }
    
    /**
     * Borrar pizarra
     * @param ind indice a borrar
     */
    public void DeletePizarra(int ind){
        this.remove(ind);
        pizarras.remove(ind);
        names.remove(ind);
    }
    
     /**
     * obtener index ventana actual
     * @return index
     */
    public int getIndex(){
        return index;
    }
    
    /**
     * obtener pizarra
     * @param i indice pizarra
     * @return la pizarra
     */
    public Pizarra getPizarra(int i){
        return pizarras.get(i);                
    }
    
     /**
     * volver hacia atras
     * @auxP variable temporal para guardar pizarra
     */
    public static void undo(){        
        auxP = pizarras.get(index);
        auxP.remove(); 
    }
    
    /**
     * Rehacer accion
     */
    public static void redo(){        
        auxP = pizarras.get(index);
        auxP.restore();
    }
    
    /**
     * limpiar pizarra
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
