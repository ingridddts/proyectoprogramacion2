/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dibujos;

import java.awt.Color;
import java.awt.Graphics;

/**
 * "dibujar" un ovalo UML con color de fondo, seleccionar y arrastrar a la pizarra
 * @param x entero que indica posicion eje x
 * @param y entero que indica posicion eje y 
 * @param w indica el ancho del ovalo 
 * @param h indica la altura del ovalo
 * @param color indica color seleccionado
 */
public class Ovalrelleno implements Drawable {
    private int x;
    private int y;
    private int w;
    private int h;
    private Color color;
    
    /**
     * Dibuja en la pizarra
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, w, h);
    }

    /**
     * esquina inferior derecha
     * @param x posicion en eje x
     * @param y posicion en eje y
     */
    @Override
    public void update_from_pos(int x, int y) {
        this.w = -this.x + x;
        this.h = -this.y + y;
    }

    /**
     * esquina superior izquierda
     * @param x posicion en eje x
     * @param y posicion en eje y
     */
    @Override
    public void set_origin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Seleccionar color
     * @param color almacena color elegido
     */
    @Override
    public void set_color(Color color) {    
        this.color=color;
    }

    /**
     * Obitene color seleccionado
     * @return color
     */
    @Override
    public Color get_color() {
        return this.color;
    }
}
