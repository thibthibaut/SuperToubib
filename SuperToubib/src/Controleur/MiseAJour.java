
package Controleur;

/**
 *
 * @author Vince
 */
public interface MiseAJour {
    /**
     * Méthode de mise à jour d'un élément d'une table (Malade, Docteur, Infirmier, ...)
     * @param numChamp Le champ que l'on souhaite modifier
     * @param value  La nouvelle valeur de ce champ 
     */
    public void mettreAJour(int numChamp, String value);
}
