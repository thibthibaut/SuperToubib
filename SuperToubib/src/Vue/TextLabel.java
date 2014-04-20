
package Vue;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Thibaut
 */
public class TextLabel extends JLabel{

    Font police;
    String text;
    
    public TextLabel(String text){
       
        super(text);
        this.text = text;
        police = new Font("Arial", Font.PLAIN, 16);
        
        super.setFont(police);
        
    } 
    
}
