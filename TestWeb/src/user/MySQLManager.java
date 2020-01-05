package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLManager {

    private static MySQLManager instance;
    private Statement statement = null;
    private Connection connection = null;
    private String url = "jdbc:mysql://localhost:3306/blog?serverTimezone=Europe/Paris";
    private String utilisateur = "root";
    private String motDePasse = "";

    private MySQLManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, utilisateur, motDePasse);
            this.statement = this.connection.createStatement();
            System.out.println("Connexion open !");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    public static synchronized MySQLManager getInstance() {
        if (instance == null) {
            instance = new MySQLManager();
        }
        return instance;
    }
    
    public void getUserNb() {
        int i = 0;
        try {    
            ResultSet resultat = statement.executeQuery("SELECT id FROM User;");
            
            while(resultat.next()) {
                i++;
            }
            System.out.println("Il y à " + i + " membres inscrits sur votre site");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if(connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
