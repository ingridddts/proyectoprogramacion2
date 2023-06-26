package Dibujos;

import java.awt.Color;
import java.awt.Graphics;

/**
* Dibujar en la pizarra: arrastrar entidades y flechas y realizar acciones con el mouse
*/
public interface Drawable {

    /**
     * Dibujar en la pizarra
     * @param g
     */
    public void paint(Graphics g);

    /**
     * Actualización con una nueva posición cuando se arrastra el mouse
     * @param x posicion eje x
     * @param y posicion eje y
     */
    public void update_from_pos(int x, int y);
    
    /**
     * Establecer origen al hacer click
     * @param x posicion eje x 
     * @param y posicion eje y
     */
    public void set_origin(int x, int y);

    /**
     * escoger el color
     * @param color contiene el nuevo color
     */
    public void set_color(Color color);
    /**
     * obtiene el color
     * @return color seleccionado
     */
    public Color get_color();
    }
