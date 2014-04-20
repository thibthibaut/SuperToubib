
package Vue;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author Thibaut
 */
public class TextField extends JTextField {
    
    Font police;
    String text;
    
    public TextField()
    {
        super();
        police = new Font("Arial", Font.PLAIN, 16);
        super.setFont(police);
        super.setPreferredSize(new Dimension(200,25));
    }
    
    
    public TextField(String text)
    {
        super(text);
        police = new Font("Arial", Font.PLAIN, 16);
        super.setFont(police);
        super.setPreferredSize(new Dimension(200,25));
        
    }
    
}
