/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Crazian
 */
public class ConnTest {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/student_tracker?useSSL=false";
//gets rid of ssl warning
        String user = "root";
        String pass = "password";
        try {
            System.out.println("Connecting to database: " + jdbcUrl);
            
            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection successful, woot");
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    
}
