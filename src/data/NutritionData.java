package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NutritionData {
    private Connection connection;
    private PreparedStatement loginStatement;

    public NutritionData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Establish a connection and login
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/champions_path", "root", "");
            System.out.println("Connection Established");
            loginStatement = connection.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ?");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean loginUser(String email, String password) {
        try {
            loginStatement.setString(1, email);
            loginStatement.setString(2, password);
            ResultSet resultSet = loginStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
