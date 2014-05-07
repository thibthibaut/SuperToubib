package Connexion;

/*
*
* Librairies importées
*/
import java.sql.*;
import java.util.ArrayList;

/*
*
* Connexion a votre BDD (Pour l'instant la BDD est locale
* J'ai utilisé easyPHP pour créer une base de donnée sur mon ordinateur
*
* @author Thibaut Vercueil
*/
public class Connexion {
    
    /**
     * Attributs prives : connexion JDBC, statement, ordre requete et resultat requete
     */
    private Connection conn;
    private Statement stmt;
    private ResultSet rset;
    private ResultSetMetaData rsetMeta;
    
    
    
    public Connexion(String adresse,String loginDatabase, String passwordDatabase) throws SQLException, ClassNotFoundException {
        // chargement driver "com.mysql.jdbc.Driver"
        Class.forName("com.mysql.jdbc.Driver");
        

        

        String urlDatabase = "jdbc:mysql://" + adresse + "/bdd";

        
        //création d'une connexion JDBC à la base
        conn = DriverManager.getConnection(urlDatabase, loginDatabase, passwordDatabase);
        
        // création d'un ordre SQL (statement)
        stmt = conn.createStatement();
        
        // initialisation de la liste des requetes de selection et de MAJ
    }
    
    
    /**
     * Execute une requête de mise à jour sur la BDD
     * @param requeteMaj requête de mise à jour
     * @throws SQLException 
     */
    public void executeUpdate(String requeteMaj) throws SQLException {
        stmt.executeUpdate(requeteMaj);
    }




    /**
     * Methode qui retourne l'ArrayList des champs de la requete en parametre
     * @param requete
     * @return ArrayList comportant les résulats de la requete
     * @throws java.sql.SQLException
     */
    public Object[][] executeQuery(String requete) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery(requete);
        ResultSetMetaData rsMetaData = rset.getMetaData();
        int columnCount = rsMetaData.getColumnCount();
        ArrayList<Object[]> result = new ArrayList<Object[]>();
        Object[] header = new Object[columnCount];
        for (int i=1; i <= columnCount; ++i){
            Object label = rsMetaData.getColumnLabel(i);
            header[i-1] = label;
        }
        while (rset.next()){
            Object[] str = new Object[columnCount];
            for (int i=1; i <= columnCount; ++i){
                Object obj = rset.getObject(i);
                str[i-1] = obj;
            }
            result.add(str);
        }
       int resultLength = result.size();
        Object[][] finalResult = new Object[resultLength][columnCount];
        finalResult[0] = header;
        for(int i=1;i<resultLength;++i){
            Object[] row = result.get(i);
            finalResult[i] = row;
        }
        return finalResult;
    }
    
    
    
    
    
    
    
    
    //-------TEST--------
    
    public Object[][] executeQuery2(String requete) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery(requete);

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        Object[][] liste;
        liste = new Object[100][nbColonne];
        
        int k = 0;
        // tant qu'il reste une ligne 
        while (rset.next()) {
            String champs;
             // ajouter premier champ
            
            // Concatener les champs de la ligne separes par ,
            for (int i = 1; i < nbColonne; i++) {
                
                liste[k][i-1] = rset.getString(i);
                
            }
           
        }
        
        
        
        // Retourner l'ArrayList
        return liste;
    }
    
    
    
    
    
    
}
