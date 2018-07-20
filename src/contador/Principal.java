/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

/**
 *
 * @author PEDRO
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Vista v = new Vista();
        v.setVisible(true);
        
        Controlador t = new Controlador (v);
        
        
    }
    
}
