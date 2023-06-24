/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dibujos;

import java.awt.Color;
import java.awt.Graphics;


public class DrawableOval implements Drawable {

    private int x;
    private int y;
    private int w;
    private int h;
    private Color color;
    
    /**
     * Paint to the screen
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, w, h);
    }

    /**
     * Set the bottom right corner
     * @param x
     * @param y
     */
    @Override
    public void update_from_pos(int x, int y) {
        this.w = -this.x + x;
        this.h = -this.y + y;
    }

    /**
     * Set the top left corner
     * @param x
     * @param y
     */
    @Override
    public void set_origin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Set the color. Unused
     * @param color
     */
    @Override
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
