package Chapter11;


import java.sql.*;

public class ConnectToDatabase {

    static  void readData(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind_schema","root","30102024MySQL#");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

            System.out.println("ID\tCompany Name\tContact Name");

            while(resultSet.next()){
                // Col index starts at 1
                System.out.println(resultSet.getInt(1) +"\t"+resultSet.getString(2) + "\t"+resultSet.getString(3));

            }

        }catch (SQLException exception){
            System.out.println("Connection to database failed : " + exception.toString());
        }
    }

    public static void main(String[] args) {
        readData();
    }
}
