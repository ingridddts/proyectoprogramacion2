package Dibujos;
import java.awt.Graphics;

/**
 * "dibujar" una flecha punteada, seleccionar y arrastras a la pizarra
 * @param x1 entero que indica posicion inicial en eje x
 * @param x2 entero que indica posicion final en eje x
 * @param y1 entero que indica posicion inicial eje y 
 * @param y2 entero que indica posicion inicial eje y 
 * @param color indica color seleccionado
 */
public class Flechapunt extends DrawableLine {

    /**
     * dibujar en la pizarra
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        drawArrowLine(g, x1, y1, x2, y2, 10, 10, true, true);
    }
}
