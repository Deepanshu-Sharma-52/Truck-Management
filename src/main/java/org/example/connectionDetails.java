package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDetails {
    public static final String Load_Driver="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/truckmgt";
    public static final String Username="root";
    public static final String Password="deepanshu@";

    public static Connection getConnection()throws SQLException {
        return DriverManager.getConnection(URL,Username,Password);
    }
}
