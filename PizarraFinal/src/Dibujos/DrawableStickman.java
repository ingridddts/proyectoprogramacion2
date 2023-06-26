package Dibujos;

import java.awt.Color;
import java.awt.Graphics;

/**
 * "dibujar" al usuario y lo posiciona en la pizarra
 * @param x entero que indica posicion eje x
 * @param y entero que indica posicion eje y
 * @param isDragging
 * @param mousseXOffset para posicionar en eje x
 * @param mousseYOffset posicionar en eje y
 */
public class DrawableStickman implements Drawable {

    private int x;
    private int y;
    private boolean isDragging;
    private int mouseXOffset;
    private int mouseYOffset;
    private Color color;

    /**
     * constructor
     */
    public DrawableStickman() {
        isDragging = false;
        mouseXOffset = 0;
        mouseYOffset = 0;
    }

    @Override
    public void paint(Graphics g) {
         g.setColor(color);
        // cabeza
        g.fillOval(x, y, 40, 40);

        // cuerpo
        g.drawLine(x + 20, y + 40, x + 20, y + 100);

        // brazos
        g.drawLine(x - 20, y + 60, x + 60, y + 60);

        // piernas
        g.drawLine(x + 20, y + 100, x - 20, y + 160);
        g.drawLine(x + 20, y + 100, x + 60, y + 160);
    }

    @Override
     /**
     * se actualiza la posicion del usuario en la pizarra
     */
    public void update_from_pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void set_origin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void set_color(Color color) {
        this.color=color;
    }

    @Override
    public Color get_color() {
        return this.color;
    }

    /**
     * se arrastra al usuario con el mouse
     * @param mouseX indica posiscion en eje x
     * @param mouseY indica posicion en eje y
     */
    public void startDrag(int mouseX, int mouseY) {
        if (mouseX >= x && mouseX <= x + 40 && mouseY >= y && mouseY <= y + 160) {
            isDragging = true;
            mouseXOffset = mouseX - x;
            mouseYOffset = mouseY - y;
        }
    }
    
    /**
     * se posiciona al usuario en la pizarra a traves del mouse
     * @param mouseX ubica al usuario en eje x
     * @param mouseY ubica al usuario en eje y
     */
    public void drag(int mouseX, int mouseY) {
        if (isDragging) {
            x = mouseX - mouseXOffset;
            y = mouseY - mouseYOffset;
        }
    }
    
    public void stopDrag() {
        isDragging = false;
    }
}
