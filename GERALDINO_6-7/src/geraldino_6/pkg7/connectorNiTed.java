/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geraldino_6.pkg7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class connectorNiTed {
    private static Connection connectionNiTed = null;

    public static Connection getConnection() {
        if (connectionNiTed == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connectionNiTed = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/simple_store_geraldino", //NAME SA DATA BASE
                        "root", "root"
                );
            } catch (ClassNotFoundException e) {
                System.out.println("MySQL JDBC Driver not found");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Connection failed! Check your database credentials and server.");
                e.printStackTrace();
            }
        }
        return connectionNiTed;
    }
}
