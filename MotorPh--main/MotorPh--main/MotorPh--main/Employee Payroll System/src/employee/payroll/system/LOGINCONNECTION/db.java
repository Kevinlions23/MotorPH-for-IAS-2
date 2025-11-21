/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system.LOGINCONNECTION;

/**
 *
 * @author Hyrex
 */

import java.sql.*;
import javax.swing.*;

public class db {

    public static Connection java_db() {
        try {
            Class.forName("org.sqlite.JDBC");

            // Load from project folder
            String path = System.getProperty("user.dir") + "/Database/mydata.sqlite";
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path);

            return conn;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

