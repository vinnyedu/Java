package org.example.application;

import org.example.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                            + "VALUES "
                            + "(?, ?, ?, ? ,?)",
                    Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, "Carl Purple");
            preparedStatement.setString(2, "carl@gmail.com");
            preparedStatement.setDate(3, new Date(sdf.parse("22/08/1985").getTime()));
            preparedStatement.setDouble(4, 3000.0);
            preparedStatement.setInt(5, 4);

            preparedStatement = connection.prepareStatement(
                    "insert into department (Name) values ('D1'),('D2')",
                    Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }

        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}