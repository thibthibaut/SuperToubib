
package Modele;

/**
 *
 * @author Vince
 */
public class Chambre {
    /**
     * Attributs
     */
    private int numero;
    private Infirmier surveillant;
    private int nbLits;
    
    /**
     * 
     */
    public int getNumero() {
        return this.numero;
    }
    
    public int getNbLits() {
        return this.nbLits;
    }
}
