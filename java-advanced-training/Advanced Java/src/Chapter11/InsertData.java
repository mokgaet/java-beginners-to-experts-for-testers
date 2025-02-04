package Chapter11;


import java.sql.*;

public class InsertData {
    static void insertDataToDatabase(){

        Connection connection = null;
        try {
           //Format: DriverManager.getConnection("jdbc:mysql://servername/database","root","password");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind_schema","root","30102024MySQL#");

           // String insertLine = "insert into shipper (companyName, phone) values ('PAXI Delivery Guy', '(275) 101-6774')";   //Same code for update , difference is this sql string statement
            String insertLine =" insert into shipper(companyName,Phone)  values ('PAXI Delivery Guy', '(275) 101-6774')";
            /*
            String insertLine = insert into shipper  values ('PAXI Delivery Guy', '(275) 101-6774')";
            ---> Error Column count doesn't match value count at row1
            ---> Explained: occurs in MySQL when the number of values provided in an INSERT statement does not match the number of columns specified.

             */

            Statement statement = connection.createStatement();

            statement.executeUpdate(insertLine);
            System.out.println("Data has been added , go check your database");
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        insertDataToDatabase();
    }

}
