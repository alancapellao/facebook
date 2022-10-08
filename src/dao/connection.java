package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class connection {

    public static Connection conector() {

        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/alans";
        String usuario = "root";
        String senha = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        } catch (Exception e) {
            return null;
        }
        
    }
}
