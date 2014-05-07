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
    
    public JPanel connexionPanel; //Panneau de connexion
    public JTabbedPane tabset;
    
    /**
     * Constructeur de la fenêtre pricipale
     */
    public Fenetre(){

       
        this.connexionPanel = new ConnexionPanel(this);    
        this.tabset = new JTabbedPane();

        this.tabset.add("Patient", new PatientOnglet());


        this.setTitle("SuperToubib!");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

        this.setContentPane(this.connexionPanel);

        this.setVisible(true);  

        
        this.connexionPanel = new ConnexionPanel(this);
        this.tabset = new JTabbedPane();
        
        this.tabset.add("Patient", new PatientOnglet());
        this.tabset.add("Docteur", new DocteurOnglet());
        
        
        this.setTitle("SuperToubib!");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(this.connexionPanel);
        
        this.setVisible(true);
    }

    
    
    public void goToMainMenu(){
  
        connexionPanel.setVisible(false);
        this.setContentPane(this.tabset);
    }
    
}
