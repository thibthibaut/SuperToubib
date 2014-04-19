/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vue;

import javax.swing.*;

/**
 *
 * @author Thibaut
 */
public class Fenetre extends JFrame {
    
    JPanel connexionPanel; //Panneau de connexion
    
    public Fenetre(){
       
    this.connexionPanel = new ConnexionPanel();    
    
    this.setTitle("SuperToubib!");
    this.setSize(600, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    
    this.setContentPane(this.connexionPanel);
    
    this.setVisible(true);
        
        
        
    }
    
}
