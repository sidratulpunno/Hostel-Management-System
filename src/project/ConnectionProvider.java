package project;

import java.sql.*;

public class ConnectionProvider {

    public static Connection getCon() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "");
          return con;
        }
        catch(Exception e){
        return null;
        }
        }
    }