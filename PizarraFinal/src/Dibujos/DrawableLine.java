package Dibujos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * "dibujar" una linea
 * @param x1 entero que indica posicion inicial en eje x
 * @param x2 entero que indica posicion final en eje x
 * @param y1 entero que indica posicion inicial eje y 
 * @param y2 entero que indica posicion inicial eje y 
 * @param d tamaño flecha
 * @param h altura flecha
 * @param fill triangulo en el destino
 * @param dotted linea punteada
 */
public class DrawableLine implements Drawable {
    /**
     * Origin X
     */
    protected int x1,

    /**
     * Origin Y
     */
    y1,

    /**
     * Destination X
     */
    x2,

    /**
     * Destination Y
     */
    y2;

    /**
     * posicion destino
     * @param x posicion eje x
     * @param y posisicion eje y
     */
    @Override
    public void update_from_pos(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    /**
     * posicion inicial
     * @param x posicion eje x
     * @param y posicion eje y
     */
    @Override
    public void set_origin(int x, int y) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x;
        this.y2 = y;
    }

    /**
     * color de la linea
     * @param color
     */
    @Override
    public void set_color(Color color) {
    }

    /**
     * obetener el color
     * @return
     */
    @Override
    public Color get_color() {
        return null;
    }

    /**
     * dibujar linea
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }

    protected void drawArrowLine(Graphics g, int x1, int y1, int x2, int y2, int d, int h, boolean fill, boolean dotted) {
        int dx = x2 - x1, dy = y2 - y1;
        double D = Math.sqrt(dx * dx + dy * dy);
        double xm = D - d, xn = xm, ym = h, yn = -h, x;
        double sin = dy / D, cos = dx / D;

        x = xm * cos - ym * sin + x1;
        ym = xm * sin + ym * cos + y1;
        xm = x;

        x = xn * cos - yn * sin + x1;
        yn = xn * sin + yn * cos + y1;
        xn = x;

        int[] xpoints = {x2, (int) xm, (int) xn};
        int[] ypoints = {y2, (int) ym, (int) yn};

        if(!dotted) g.drawLine(x1, y1, x2, y2);
        else {
            Graphics2D g2d = (Graphics2D) g;
            Stroke old = g2d.getStroke();
            float dash[] = { 2f, 0f, 2f};
            g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 1.0f, dash, 2f));
            g.drawLine(x1, y1, x2, y2);
            g2d.setStroke(old);
        }
        g.drawLine(x2, y2, (int)xm, (int)ym);
        g.drawLine(x2, y2, (int)xn, (int)yn);
        if(fill) g.drawPolygon(xpoints, ypoints, 3);
    }
}
