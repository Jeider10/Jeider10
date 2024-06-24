package com.jml.cloud.admin.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    Connection con;

    public Connection getConnection() {
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
            String user = "root";
            String password = "";

            con = DriverManager.getConnection(connectionUrl, user, password);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}