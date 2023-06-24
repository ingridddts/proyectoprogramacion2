package pizarrafinal;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class NewPizarra extends JFrame {
    private String name;

    
    public NewPizarra(JFrame frame, PizarraContainer cont){
        this.setTitle("Nombre de Pizarra");
        this.setPreferredSize(new Dimension(300, 100));
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
       
        JButton submit = new JButton("Nuevo");
        submit.setSize(100, 150);
        this.add(submit, BorderLayout.SOUTH);

        
        JTextField namer = new JTextField();
        namer.setSize(400, 300);
        this.add(namer, BorderLayout.CENTER);
        this.pack();
        
                
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                name = namer.getText();
                try {
                    cont.getPestaña().AddPizarra(name);
                    dispose();
                } catch (IOException ex) {
                    Logger.getLogger(NewPizarra.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
        
        
        this.setVisible(true);
    }

    /**
     * Getter for name
     * @return name
     */
    @Override
    public String getName(){
        return name;
    }

}
