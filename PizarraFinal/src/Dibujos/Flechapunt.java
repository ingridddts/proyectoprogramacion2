/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dibujos;
import java.awt.Graphics;

/**
 * Dependency line for UML
 * @author nwroot
 */
public class Flechapunt extends DrawableLine {

    /**
     * Paint to the screen
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        drawArrowLine(g, x1, y1, x2, y2, 10, 10, true, true);
    }
}
