
package Vue;

import Connexion.Connexion;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author Thibaut
 */


public class PatientOnglet extends JPanel {
    
    private JButton ajoutPatient;
    private JTextField recherche;
    private JComboBox choix;
    private final String[] listechoix  = {"Nom", "Prénom", "Adresse", "Mutuelle"};
    private JButton rechercheBouton;
    private JScrollPane sp;
    private JTable tableau;
    
    public PatientOnglet(){
    
        /**
         * Création des différentrs objets constituant la fenêtre
         */
        
        ajoutPatient = new JButton("Ajouter un patient");
        ajoutPatient.setPreferredSize(new Dimension(100,30));
        
        recherche = new JTextField("Rechercher un patient");
        recherche.setPreferredSize(new Dimension(200,30));
       
        choix = new JComboBox(this.listechoix);
        choix.setPreferredSize(new Dimension(100,30));
        
        rechercheBouton = new JButton("Rechecher");
        rechercheBouton.setPreferredSize(new Dimension(100,30));
        
       //----------------------------------------------------------------
       //------------------------------------------------------------------
         try {
            //Fenetre f = new Fenetre();
            
            Connexion c = new Connexion("localhost", "root", "");
            Object[][] data = c.executeQuery2("SELECT * FROM malade");
     
        
        
        
        
       //--------------------------------------------------------------------
       //---------------------------------------------------------------------
       
        
        
        
        
        
        String[] champs = {"Numéro","Nom", "Prénom", "Adresse", "Numéro de tél", "Mutuelle"};
        tableau = new JTable(data, champs );
       
        
           } catch (SQLException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }
         
         
         
        sp = new JScrollPane(tableau);
        sp.setPreferredSize(new Dimension(600,400));
      
        
        //------------------------------------------
       
        
        //Création du layout Manager
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        
        //Création des contrainte du GridBagLayout
        GridBagConstraints gc = new GridBagConstraints();
        
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(10, 10, 10, 10);
        
        
        //Positionnement des différents éléments dans la fenêtre
        
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridheight = 1;
        gc.gridwidth = 2;
        this.add(ajoutPatient, gc);
        //------------------------------
        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridheight = 1;
        gc.gridwidth = 1;
        this.add(recherche, gc);
        //------------------------------
        gc.gridx = 1;
        gc.gridy = 1;
        gc.gridheight = 1;
        gc.gridwidth = 1;
        this.add(choix, gc);
        //------------------------------
        gc.gridx = 2;
        gc.gridy = 1;
        gc.gridheight = 1;
        gc.gridwidth = 1;
        this.add(rechercheBouton, gc);
        //------------------------------
        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridheight = 1;
        gc.gridwidth = 3;
        this.add(sp, gc);
     
       
        this.setVisible(true);
        
    }
    
    
}
