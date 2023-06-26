package Dibujos;

import java.awt.Graphics;

/**
 * "dibujar" una linea, seleccionar y arrastras a la pizarra
 * @param x1 entero que indica posicion inicial en eje x
 * @param x2 entero que indica posicion final en eje x
 * @param y1 entero que indica posicion inicial eje y 
 * @param y2 entero que indica posicion inicial eje y 
 */
public class Linea extends DrawableLine {
    /**
     * dibujar en la pizarra
     * @param g
     */
    
    @Override
    public void paint(Graphics g) {
        drawArrowLine(g, x1, y1, x2, y2, 0, 0, false, false);
        g.fillOval(x1 -2, y1 - 2, 0, 0);
    }
}
