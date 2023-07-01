package Controles;

import java.util.ArrayList;
import pizarrafinal.Pizarra;
import Dibujos.DrawableText;
import pizarrafinal.PizarraContainer;

/**
 * para agregar texto
 */
public class contenedorTexto {
    private PizarraContainer contenedor;
    private ArrayList<DrawableText> cuadros;
    private int index;
    
    //constructor
    public contenedorTexto(PizarraContainer cont){
        contenedor = cont;
        cuadros = new ArrayList<DrawableText>();
        index = contenedor.getPestaña().getIndex();   
    }
    
    public void addText(String texto, int x , int y, int index){
        DrawableText cuadro = new DrawableText(texto, x, y);
        cuadros.add(cuadro);
        Pizarra p = contenedor.getPestaña().getPizarra(index);
        p.add(cuadro);
    }
    
    public int getIndex(){
        return index;
    }
}
