package pizarrafinal;

import Dibujos.Drawable;
import Dibujos.DrawableOval;
import Dibujos.DrawableStickman;
import Dibujos.Flecha;
import Dibujos.Flechapunt;
import Dibujos.Linea;
import Dibujos.Ovalrelleno;
import  Dibujos.DrawableLine;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;


public class Pizarra extends JPanel {

    private static int mode = 1;
    private static Color color;

    /**
     * Save buffer for undo/redo
     */
    public static ArrayList<Drawable> save;
    private ArrayList<Drawable> drawn;
    private Drawable curr;

    /**
     * Creates a Pizarra
     * @throws IOException
     */
    public Pizarra() throws IOException {
        this.drawn = new ArrayList<>();
        save = new ArrayList<>();

        this.setPreferredSize(new Dimension(975, 600));
        this.setBackground(new Color(250, 250, 250));
        Listener listener = new Listener();
        this.addMouseListener(listener);
        this.addMouseMotionListener(listener);
    }

    class Listener extends MouseInputAdapter {

        @Override

        public void mousePressed(MouseEvent m) {

            if (mode == 1) {
                curr = new DrawableOval  ();
            }
            if (mode ==2){
                curr = new Ovalrelleno  ();
            }
            if (mode == 3) {
                curr = new Flecha();
            }
            if (mode== 4){
                curr = new Linea();
            }
            if (mode == 5) {
              curr = new DrawableStickman();
            }
            if (mode == 6) {
                curr = new Flechapunt();
            }
          
            curr.set_color(color);
            curr.set_origin(m.getX(), m.getY());
            repaint();

            System.out.println(mode);
        }

        @Override
        public void mouseDragged(MouseEvent m) {
            curr.update_from_pos(m.getX(), m.getY());
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            drawn.add(curr);
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent me) {

        }

        @Override
        public void mouseExited(MouseEvent me) {

        }
    }

    /**
     * Paint the Pizarra
     * @param g Swing graphics
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i < drawn.size(); i++) {
            drawn.get(i).paint(g);
        }
        if (this.curr != null) {
            curr.paint(g);
        }
    }

    /**
     * Setter for mode
     * @param m mode
     */
    public static void setMode(int m) {
        mode = m;
    }

    /**
     * Setter for color
     * @param c color
     */
    public static void setColor(Color c) {
        color = c;
    }

    /**
     */
    public void remove() {
        if (!drawn.isEmpty()) {
            save.add(drawn.remove(drawn.size() - 1));
            curr = null;
            repaint();
        } else {
            System.out.println("Drawn Null");
        }
    }

    /**
     */
    public void restore() {
        if (!save.isEmpty()) {
            curr = save.remove(save.size() - 1);
            drawn.add(curr);
            repaint();
            System.out.println("redo");
        } else {
            System.out.println("Save is Null");
        }

    }

    /**
     */
    public void clear() {
        drawn.clear();
        curr = null;
        repaint();
    }
}
