
package Vue;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Vincent (largely inspired from Thibaut's PatientOnglet class)
 */


public class DocteurOnglet extends JPanel {
    
    
    private JButton ajoutDocteur;
    private JTextField recherche;
    private JComboBox choix;
    private final String[] listechoix  = {"Nom", "Prénom", "Adresse", "Spécialité"};
    private JButton rechercheBouton;
    private JScrollPane sp;
    private JTable tableau;
    
    public DocteurOnglet(){
        
        this.ajoutDocteur = new JButton("Ajouter un docteur");
        this.ajoutDocteur.setPreferredSize(new Dimension(100,30));
        
        this.recherche = new JTextField("Rechercher un docteur");
        this.recherche.setPreferredSize(new Dimension(200,30));
       // this.recherche.setBounds(new Rectangle(200,30));
        
        this.choix = new JComboBox(this.listechoix);
        this.choix.setPreferredSize(new Dimension(100,30));
        
        this.rechercheBouton = new JButton("Rechecher");
        this.rechercheBouton.setPreferredSize(new Dimension(100,30));
        
      
        
        Object[][] data = {
            {"Jackson", "Michael", "Washington DC, 5th Avenue", "Chirurgie esthétique du nez"},  
            {"Hémique", "Paul", "Paris, 10 place Edith Orial", "Chirurgien dentiste"},
       };
        
        this.tableau = new JTable(data, this.listechoix);
        
        
        this.sp = new JScrollPane(tableau);
        sp.setPreferredSize(new Dimension(600,400));
      
        
        
        //------------------------------------------
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        
        GridBagConstraints gc = new GridBagConstraints();
        
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(10, 10, 10, 10);
        
        
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridheight = 1;
        gc.gridwidth = 2;
        this.add(ajoutDocteur, gc);
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
