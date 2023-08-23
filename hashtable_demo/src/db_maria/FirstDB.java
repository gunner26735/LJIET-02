package db_maria;

import java.sql.*;

public class FirstDB {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","sid","sid123");
        if(con != null){
            System.out.println("Success!");
        }else{
           System.out.println("FAIL!"); 
        }
    }
}
