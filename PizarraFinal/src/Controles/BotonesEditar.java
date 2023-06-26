package Controles;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import pizarrafinal.*;

/**
 * Panel para crear botones de edicion 
 * @param ovalo boton para seleccionar entidad UML
 * @param flecha boton para crear flecha
 * @param comp boton para crear
 * @param gene boton para crear linea generalizacion
 * @param depe boton para crear linea dependencia
 * @param undo boton para volver atras
 * @param redo boton paara 
 * @param editar boton editar}
 * @param ova
 */
public class BotonesEditar {
    private JButton ovalo;
    private JButton flecha;    
    private JButton comp;
    private JButton gene;
    private JButton depe;
   // private JButton text;
    private JButton undo;
    private JButton redo;
    private Editar editar;
    private JButton ova;
    
    /*
    *constructor
    */
    public BotonesEditar(Editar b, PizarraContainer p){
        editar = b;                                
            
        ovalo = new JButton();
        ovalo.setFocusable(false);
        ovalo.setBounds(10, 10,50, 50);
        ovalo.setBackground(Color.GREEN);
        ImageIcon OvaloIcon = new ImageIcon("ovalo.png");
        ovalo.setIcon(OvaloIcon);
        
        ovalo.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Ovalo Contorno" );
               setColor();
               ovalo.setBackground(Color.GREEN);
               Pizarra.setMode(1);
            }
        });
        ova = new JButton();
        ova.setFocusable(false);
        ova.setBounds(120,70,50,50);
        ova.setBackground(Color.GREEN);
        ImageIcon Ovaicon = new ImageIcon("ovalorelleno.png");
        ova.setIcon(Ovaicon);
        ova.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Ovalo Relleno" );
               setColor();
               ova.setBackground(Color.GREEN);
               Pizarra.setMode(2);
            }
        });
        
        flecha = new JButton();
        flecha.setFocusable(false);
        flecha.setBounds(65, 10, 50, 50);
        flecha.setBackground(Color.GRAY);
        ImageIcon flechaIcon = new ImageIcon("flecha.png");
        flecha.setIcon(flechaIcon);
        
        flecha.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println(" Flecha");
               setColor();
               flecha.setBackground(Color.GREEN); 
               Pizarra.setMode(3);
            }
        });
        
        
        comp = new JButton();
        comp.setFocusable(false);
        comp.setBounds(120,10,50,50);
        comp.setBackground(Color.GRAY);
        ImageIcon compIcon = new ImageIcon("linea.png");
        comp.setIcon(compIcon);
        
        comp.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Linea");
               setColor();
               comp.setBackground(Color.GREEN);
               Pizarra.setMode(4);
            }
        });
        
        gene = new JButton();
        gene.setFocusable(false);
        gene.setBounds(10,70,50,50);
        gene.setBackground(Color.GRAY);
        ImageIcon geneIcon = new ImageIcon("persona.png");
        gene.setIcon(geneIcon);
        
        gene.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Persona");
                setColor();
                gene.setBackground(Color.GREEN);
                Pizarra.setMode(5);
            }
        });
        
        depe = new JButton();
        depe.setFocusable(false);
        depe.setBounds(65,70,50,50);
        depe.setBackground(Color.GRAY);
        ImageIcon depeIcon = new ImageIcon("flechasegmentada.png");
        depe.setIcon(depeIcon);
        
        depe.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {               
                System.out.println("Flecha Punteada");               
                setColor();
                depe.setBackground(Color.GREEN);    
                Pizarra.setMode(6);
            }
        });
        /*
        text = new JButton();
        text.setFocusable(false);
        text.setBounds(120,70,50,50);
        text.setBackground(Color.GRAY);
        ImageIcon TIcon = new ImageIcon("text.png");
        text.setIcon(TIcon);
        
        text.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Text mode");
               NewText nuevo = new NewText(p);
               setColor();
               text.setBackground(Color.GREEN);               
            }
        });*/
      
        undo = new JButton();
        undo.setFocusable(false);
        undo.setBounds(10,130,50,50);
        undo.setBackground(Color.GRAY);
        ImageIcon undoIcon = new ImageIcon("Back.png");
        undo.setIcon(undoIcon);
        
        undo.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Atras");
                setColor();
                undo.setBackground(Color.GREEN);
                Pestaña.undo();               
            }
        });
        
        redo = new JButton();
        redo.setFocusable(false);
        redo.setBounds(65,130,50,50);
        redo.setBackground(Color.GRAY);
        ImageIcon redoIcon = new ImageIcon("adelante.png");
        redo.setIcon(redoIcon);
        
        redo.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Adelante");
                setColor();
                redo.setBackground(Color.GREEN);
                Pestaña.redo();               
            }
        });
        
        editar.add(flecha);
        editar.add(ovalo);
        editar.add(comp);
        editar.add(gene);
        editar.add(depe);
//        editar.add(text); 
   
        editar.add(undo);
        editar.add(redo);
        editar.add(ova);
    }
    
    /**
     * Set all the colors
     */
    public void setColor(){
        
        flecha.setBackground(Color.GRAY);
        ovalo.setBackground(Color.GRAY);
        comp.setBackground(Color.GRAY);
        depe.setBackground(Color.GRAY);
        gene.setBackground(Color.GRAY);
     //   text.setBackground(Color.GRAY);
      
        undo.setBackground(Color.GRAY);
        redo.setBackground(Color.GRAY);
        ova.setBackground(Color.GRAY);
    }}
    
