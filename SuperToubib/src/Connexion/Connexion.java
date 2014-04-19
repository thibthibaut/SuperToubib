package Connexion;

/*
 * 
 * Librairies importées
 */
import java.sql.*;
import java.util.ArrayList;

/*
 * 
 * Connexion a votre BDD via le tunnel SSH
 * 
 * @author Segado
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

            String urlDatabase = "jdbc:mysql://localhost/securechat";

            //création d'une connexion JDBC à la base
            conn = DriverManager.getConnection(urlDatabase, loginDatabase, passwordDatabase);

            // création d'un ordre SQL (statement)
            stmt = conn.createStatement();

            // initialisation de la liste des requetes de selection et de MAJ
      
        }
    }


