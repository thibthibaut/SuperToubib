
package Modele;

import Controleur.Generation;
import Controleur.MiseAJour;
import Controleur.Recherche;

/**
 *
 * @author Vince
 */
public class Docteur extends Employe implements Generation, MiseAJour, Recherche {
    /**
     * Attributs
     */
    private String specialite;
    private boolean disponible;

    @Override
    public void ajouter() {
        // Executer Requête
    }

    @Override
    public void supprimer() {
        // Executer Requête
    }

    @Override
    public void mettreAJour(int numChamp, String value) {
        // Executer Requête
    }

    @Override
    public void rechercher(int numChamp, String value) {
        // Executer Requête
    }
    
}
