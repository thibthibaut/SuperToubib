/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package Vue;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Thibaut
 */
public class ConnexionPanel extends JPanel {
    
    private JTextField ip;
    private JTextField user;
    private JTextField password;
    
    private JButton connexion;
    
    private JLabel ipLabel;
    private JLabel userLabel;
    private JLabel passwordLabel;
    
    public ConnexionPanel(){
        
        this.ip = new JTextField("");
        this.ip.setPreferredSize(new Dimension(150,20));
        this.user = new JTextField("");
        this.user.setPreferredSize(new Dimension(150,20));
        this.password = new JTextField();
        this.password.setPreferredSize(new Dimension(150,20));
        
        this.ipLabel = new JLabel("Adresse de la BDD :");
        this.userLabel = new JLabel("Nom d'utilisateur");
        this.passwordLabel = new JLabel("Mot de passe");
        
        this.connexion = new JButton("Connexion");
        
        
        JLabel img = new JLabel(new ImageIcon("welcome.png")); 
        img.setBounds(0, 0, 200, 100); 
       
       GridBagLayout layout = new GridBagLayout();
       this.setLayout(layout);
       
       GridBagConstraints gc = new GridBagConstraints();
       
       gc.fill = GridBagConstraints.HORIZONTAL;
       gc.insets = new Insets(10, 10, 10, 10);
      
       gc.gridx = 0;
       gc.gridy = 0;
       gc.gridheight = 1;
       gc.gridwidth = 2;
       this.add(img, gc);
       //-----------------------
       gc.gridx = 0;
       gc.gridy = 1;
       gc.gridheight = 1;
       gc.gridwidth = 1;
       this.add(ipLabel, gc);
       //-----------------------
       gc.gridx = 1;
       gc.gridy = 1;
       this.add(ip, gc);
       //------------------------
       gc.gridx = 0;
       gc.gridy = 2;
       this.add(userLabel, gc);
       //-----------------------
       gc.gridx = 1;
       gc.gridy = 2;
       this.add(user, gc);
       //-----------------------
       gc.gridx = 0;
       gc.gridy = 3;
       this.add(passwordLabel, gc);
       //-----------------------
       gc.gridx = 1;
       gc.gridy = 3;
       this.add(password, gc);
       //-----------------------
       gc.gridx = 0;
       gc.gridy = 4;
       gc.gridheight = 1;
       gc.gridwidth = 2;
       this.add(connexion, gc);
       
       
       
       
       
       
       this.setVisible(true);
        
        
    }
    
    
}
