package pizarrafinal;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot; //obtener una imagen de la pantalla
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

 /**
     * Guarda una copia de la pizarra
     * @param pizarra contiene los datos del panel actual
     */
public class Guardado {
    private JPanel tab;
   
    public Guardado(JPanel pizarra) {
        tab = pizarra;
    }
    /**
     * crea ana BufferedImage
     * @param panel 
     * @return imagen del panel
     * @throws AWTException
     */
    public static BufferedImage capturarPantalla(JPanel panel) throws AWTException {
        Point p = panel.getLocationOnScreen();
        Dimension dim = panel.getSize();
        Rectangle rect = new Rectangle(p, dim);

        Robot robot = new Robot();
        return robot.createScreenCapture(rect);
    }

    /**
     * Guarda una BufferedImage (captura de pantalla)
     * @param image alamacena la captura de pantalla
     * @throws IOException
     */
    public void save(BufferedImage image) throws IOException {
        File outputfile = new File("image.png");
        ImageIO.write(image, "png", outputfile);
    }
}
