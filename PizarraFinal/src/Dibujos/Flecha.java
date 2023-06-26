package Dibujos;
import java.awt.Color;
import java.awt.Graphics;

/**
 * "dibujar" una flecha, seleccionar y arrastras a la pizarra
 * @param x1 entero que indica posicion inicial en eje x
 * @param x2 entero que indica posicion final en eje x
 * @param y1 entero que indica posicion inicial eje y 
 * @param y2 entero que indica posicion inicial eje y 
 * @param color indica color seleccionado
 */
public class Flecha extends DrawableLine {
private Color color;
    
    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        drawArrowLine(g, x1, y1, x2, y2, 10, 10, false, false);
    }

public void set_color(Color color) {    
        this.color=color;
    }

    /**
     * obtener el color con que dibujar
     * @return la flecha en el color seleccionado
     */
    @Override
    public Color get_color() {
        return this.color;
    }
}
