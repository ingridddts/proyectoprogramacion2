package Dibujos;

import java.awt.Color;
import java.awt.Graphics;


public interface Drawable {

    /**
     * Paint to the screen
     * @param g
     */
    public void paint(Graphics g);

    /**
     * Update with a new position. Called when the mouse is dragged
     * @param x
     * @param y
     */
    public void update_from_pos(int x, int y);
    
    /**
     * Set the origin. Called when the mouse is clicked
     * @param x
     * @param y
     */
    public void set_origin(int x, int y);

    /**
     * Setter for color
     * @param color The new color
     */
    public void set_color(Color color);

    /**
     * Getter for color
     * @return The color
     */
    public Color get_color();
    }
