
package Modele;

import Controleur.Generation;
import Controleur.MiseAJour;
import Controleur.Recherche;

/**
 *
 * @author Vince
 */
public class Malade extends Personne implements Generation, MiseAJour, Recherche {
    /**
     * Attributs
     */
    private int numero;
    private String mutuelle;

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
