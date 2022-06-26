package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String URL = "jdbc:mysql://localhost:3306/dbusers";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "As30051985";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение открыто");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void connectionClose() {
        try {
            connection.close();
            System.out.println("Соединение закрыто");
        } catch (NullPointerException | SQLException e) {
            e.printStackTrace();
        }
    }
}

