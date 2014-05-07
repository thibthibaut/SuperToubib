
package Modele;

import Connexion.Connexion;
import Controleur.Generation;
import Controleur.MiseAJour;
import Controleur.Recherche;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vince
 */
public class Malade extends Personne implements Generation, MiseAJour, Recherche {
    /**
     * Attributs
     */
    private Connexion c;
    private int numero;
    private String mutuelle;

    /**
     * Constructeur
     */
    public Malade() {
        try {
            this.c = new Connexion("localhost", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Malade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Malade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Ajouter un Malade à la base de données
     */
    @Override
    public void ajouter() {       
        try {
            c.executeUpdate("INSERT INTO Malade VALUES(" + this.numero + ", '" + this.nom + "', '" + this.prenom + "', '" + this.adresse + "', '" + this.telephone + "', '" + this.mutuelle + "')");
        } catch (SQLException ex) {
            Logger.getLogger(Malade.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Supprimer un Malade de la base de données
     */
    @Override
    public void supprimer() {
        try {
            c.executeUpdate("DELETE FROM Malade");
        } catch (SQLException ex) {
            Logger.getLogger(Malade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Mettre à jour les données d'un Malade
     * @param values Nouvelles données
     */
    @Override
    public void mettreAJour(String[] values) {
        try {
            c.executeUpdate("UPDATE Malade SET nom='" + values[0] + "', prenom='" + values[1] + "', adresse='" + values[2] + "', tel='" + values[3] + "', mutuelle='" + values[4] + "' WHERE numero=" + this.numero);
        } catch (SQLException ex) {
            Logger.getLogger(Malade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Rechercher un Malade dans la base de données
     * @param champ
     * @param value 
     */
    @Override
    public void rechercher(String champ, String value) {
        try {
            c.executeUpdate("SELECT * FROM Malade WHERE " + champ + " LIKE '%" + value + "'");
        } catch (SQLException ex) {
            Logger.getLogger(Malade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
