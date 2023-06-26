package Dibujos;

import java.awt.Color;
import java.awt.Graphics;

/**
 * "dibujar" un ovalo
 * @param x entero que indica posicion eje x figura
 * @param y entero que indica posicion eje y figura
 * @param w indica ancho figura
 * @param h indica alto de la figura
 * @param color indica el color de la figura
 */
public class DrawableOval implements Drawable {
    private int x;
    private int y;
    private int w;
    private int h;
    private Color color;
    
    /**
     * Dibujar en la pizarra
     * @param g 
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, w, h);
    }

    /**
     * esquina superior derecha
     * @param x posicion eje x
     * @param y posicion eje y
     */
    @Override
    public void update_from_pos(int x, int y) {
        this.w = -this.x + x;
        this.h = -this.y + y;
    }

    /**
     * esquina izquierda superior
     * @param x posicion en eje x
     * @param y posisicion en eje y
     */
    @Override
    public void set_origin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * escoger color
     * @param color
     */
    @Override
    public void set_color(Color color) {    
        this.color=color;
    }

    /**
     * obtener color
     * @return
     */
    @Override
    public Color get_color() {
        return this.color;
    }
}
