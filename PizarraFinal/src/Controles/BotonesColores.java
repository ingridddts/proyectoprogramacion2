package Controles;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import pizarrafinal.*;

/**
 * Panel para crear botones de seleccion de color a traves del mousse
 * @param redButton boton para seleccionar color rojo
 * @param magentaButton boton para seleccionar color magenta
 * @param yellowButton boton para seleccionar color amarillo
 * @param blueButton boton para seleccionar color azul
 * @param blackButton boton para seleccionar color negro
 * @param orangeButton boton para seleccionar color naranjo
 * @param color contiene color seleccionado
 */
public class BotonesColores extends JPanel{

    private JButton redButton;
    private JButton magentaButton;
    private JButton yellowButton;
    private JButton blueButton;
    private JButton blackButton;
    private JButton orangeButton;

    private Colores color;
    private LineBorder gBorder;
    private LineBorder lBorder;
   
    /**
     * Constructor
     * @param color alamcena color principal
     */
    public BotonesColores(Colores c){
        color = c;        
        
        gBorder = new LineBorder(Color.GREEN);
        lBorder =  new LineBorder(Color.LIGHT_GRAY);
        
        blackButton = new JButton();
        blackButton.setFocusable(false);
        blackButton.setBounds(35,15,30,30);
        blackButton.setBackground(Color.BLACK);
        
        blackButton.setBorder(gBorder);
        
        blackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {               
                System.out.println("Black");               
                cleanColor();
                blackButton.setBorder(gBorder); 
                Pizarra.setColor(Color.BLACK);
            }
        });
        
        redButton = new JButton();
        redButton.setFocusable(false);
        redButton.setBounds(75,15,30,30);
        redButton.setBackground(Color.RED);                        
        
        redButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Red");
                cleanColor();
                redButton.setBorder(gBorder);
                Pizarra.setColor(Color.RED);             
            }
        });
        
        magentaButton = new JButton();
        magentaButton.setFocusable(false);
        magentaButton.setBounds(115, 15, 30, 30);
        magentaButton.setBackground(Color.MAGENTA);
        
        magentaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Magneta");
               cleanColor();
               magentaButton.setBorder(gBorder);
               Pizarra.setColor(Color.MAGENTA);
            }
        });
        
        
        yellowButton = new JButton();
        yellowButton.setFocusable(false);
        yellowButton.setBounds(35,55,30,30);
        yellowButton.setBackground(Color.YELLOW);
        
        yellowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Yellow");
               cleanColor();
               yellowButton.setBorder(gBorder);             
               Pizarra.setColor(Color.YELLOW);
            }
        });
        
        blueButton = new JButton();
        blueButton.setFocusable(false);
        blueButton.setBounds(75, 55, 30, 30);
        blueButton.setBackground(Color.BLUE);
        
        blueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Blue");
                cleanColor();
                blueButton.setBorder(gBorder);
                Pizarra.setColor(Color.BLUE);
            }
        });                
        
        orangeButton = new JButton();
        orangeButton.setFocusable(false);
        orangeButton.setBounds(115, 55, 30, 30);
        orangeButton.setBackground(Color.ORANGE);
        
        orangeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Orange");
               cleanColor();
               orangeButton.setBorder(gBorder);
               Pizarra.setColor(Color.ORANGE);
            }
        });
        
        color.add(blackButton);
        color.add(redButton);
        color.add(blueButton);
        color.add(magentaButton);
        color.add(yellowButton);       
        color.add(orangeButton); 
        
    }
    
    /**
     * limpiar colores
     */
    public void cleanColor(){
        
        redButton.setBorder(lBorder);
        magentaButton.setBorder(lBorder);
        yellowButton.setBorder(lBorder);
        blackButton.setBorder(lBorder);
        orangeButton.setBorder(lBorder);
        blueButton.setBorder(lBorder);
        
    }
    
    

    
}
