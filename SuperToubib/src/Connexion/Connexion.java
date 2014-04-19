package Connexion;

/*
*
* Librairies importées
*/
import java.sql.*;

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
    
    
    
    public Connexion(String loginDatabase, String passwordDatabase) throws SQLException, ClassNotFoundException {
        // chargement driver "com.mysql.jdbc.Driver"
        Class.forName("com.mysql.jdbc.Driver");
        
        String urlDatabase = "jdbc:mysql://127.0.0.1/vercueil";
        
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
}



