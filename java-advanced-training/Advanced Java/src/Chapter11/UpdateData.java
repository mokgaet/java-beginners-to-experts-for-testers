package Chapter11;

import java.sql.*;

public class UpdateData {

    static void UpdateData(){
        try {

            Connection con = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind_schema","root","30102024MySQL#");

            String updateLine = "update shipper set companyName =  'Internet Express' where shipperId = 2";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(updateLine);

            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        UpdateData();
    }

}
