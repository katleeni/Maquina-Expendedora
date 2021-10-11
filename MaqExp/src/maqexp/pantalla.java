/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maqexp;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author juand
 */
public class pantalla extends Thread{
    javax.swing.JLabel lblSaldo;
    public int saldo;
    
    
    public pantalla(){
        saldo=0;
    }
    
    public void run(){
        while(true){
        
            lblSaldo.setText(String.valueOf(saldo));
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(pantalla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
    }
    
    public void recibeJLabel(javax.swing.JLabel lblSaldo){
        this.lblSaldo = lblSaldo; 
    }
}
