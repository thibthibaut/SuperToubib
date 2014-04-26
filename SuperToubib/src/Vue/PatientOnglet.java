
package Vue;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
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
        
        this.ajoutPatient = new JButton("Ajouter un patient");
        this.ajoutPatient.setPreferredSize(new Dimension(100,30));
        
        this.recherche = new JTextField("Rechercher un patient");
        this.recherche.setPreferredSize(new Dimension(200,30));
       // this.recherche.setBounds(new Rectangle(200,30));
        
        this.choix = new JComboBox(this.listechoix);
        this.choix.setPreferredSize(new Dimension(100,30));
        
        this.rechercheBouton = new JButton("Rechecher");
        this.rechercheBouton.setPreferredSize(new Dimension(100,30));
        
      
        
        Object[][] data = {
            {"Bob", "Dylan", "61 rue Vasco de Gama", "MACSS"},  
            {"Marine", "Leparquet", "Cocorico", "Mafff"},
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
