
package Controleur;

/**
 *
 * @author Vince
 */
public interface Recherche {
    /**
     * Méthode de recherche d'un élément d'une table (Malade, Docteur, Infirmier, ...)
     * @param numChamp Le champ que l'on souhaite modifier
     * @param value  La nouvelle valeur de ce champ
     */
    public void rechercher(int numChamp, String value);
}
