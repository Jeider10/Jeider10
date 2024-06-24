package com.jml.cloud.admin.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

class ConexionDBTest {

    private ConexionDB conexionBD = new ConexionDB();

    @Test
    void getConnection_Success_Test() {
        Connection connection = conexionBD.getConnection();
        System.out.println("Conexion establecida");

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            Assertions.fail("No se pudo cerrar la conexión: " + e.getMessage());
        }
    }
}