package Chapter11;

import java.sql.*;

public class DeleteData {

    static void DeleteDataFromDataBase(){
        try {

            Connection connection = null;

            //** **DriverManager.getConnection("jdbc:mysql://servername/database","root","password");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind_schema","root","30102024MySQL#");

            String deleteLine = "delete from shipper where shipperId = 4";

            Statement stmt=connection.createStatement();
            stmt.executeUpdate(deleteLine);

            connection.close();

        } catch (SQLException e) {
            System.out.println("Ooops!! Connection failed: " +  e.getMessage());
        }
    }

    public static void main(String[] args) {
        DeleteDataFromDataBase();
    }
}
