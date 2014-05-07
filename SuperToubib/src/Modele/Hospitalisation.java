package Modele;

import Connexion.Connexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Vince
 */

public class Hospitalisation {


    /**
     * Attributs
     */
    private Service service;
    private Chambre chambre;
    private Malade malade;
    private Connexion c;

    public Hospitalisation() {
        try {        
            this.c = new Connexion("localhost", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Hospitalisation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Hospitalisation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void ajoutHospitalisation() {
        try {
            c.executeUpdate("INSERT INTO Hospitalisation VALUES(" + this.malade.getNumero() + ", " + this.service.getCode() + ", '" + this.chambre.getNumero() + "', '" + this.chambre.getNbLits() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(Hospitalisation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
