package Dibujos;

import java.awt.Color;
import java.awt.Graphics;

public class DrawableStickman implements Drawable {

    private int x;
    private int y;
    private boolean isDragging;
    private int mouseXOffset;
    private int mouseYOffset;
private Color color;
    public DrawableStickman() {
         
        isDragging = false;
        mouseXOffset = 0;
        mouseYOffset = 0;
        
    }

    @Override
    public void paint(Graphics g) {
         g.setColor(color);
        // Draw head
        g.fillOval(x, y, 40, 40);

        // Draw body
        g.drawLine(x + 20, y + 40, x + 20, y + 100);

        // Draw arms
        g.drawLine(x - 20, y + 60, x + 60, y + 60);

        // Draw legs
        g.drawLine(x + 20, y + 100, x - 20, y + 160);
        g.drawLine(x + 20, y + 100, x + 60, y + 160);
    }

    @Override
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
        // You can implement color functionality if needed
    }

    @Override
    public Color get_color() {
        // You can implement color functionality if needed
        return this.color;
    }
    
    public void startDrag(int mouseX, int mouseY) {
        if (mouseX >= x && mouseX <= x + 40 && mouseY >= y && mouseY <= y + 160) {
            isDragging = true;
            mouseXOffset = mouseX - x;
            mouseYOffset = mouseY - y;
        }
    }
    
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
