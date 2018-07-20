/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author PEDRO
 */
public class Controlador implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    Vista vista;
    Timer t;
    int inicio;

    public Controlador(Vista vista) {
        this.vista = vista;
        vista.BotonStart.addActionListener(this);
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        inicio = 59;
             
        t = new Timer (1000, new ActionListener(){
            
           
         
            public void actionPerformed(ActionEvent e){
                
                vista.BotonStart.setVisible(false);
                
               vista.Display.setText(Integer.toString(inicio)); 
                
               inicio--;
 
            }
  
        });
        
        t.start();
        
    }
  
}
