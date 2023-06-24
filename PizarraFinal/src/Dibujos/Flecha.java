/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dibujos;
import java.awt.Color;
import java.awt.Graphics;


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
     * Get the color. Unused
     * @return
     */
    @Override
    public Color get_color() {
        return this.color;
    }
}