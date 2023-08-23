package student;

import java.sql.*;

public class BaseConnection {
    public static Connection createConnection() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","sid","sid123");
        if(con != null){
            System.out.println("Success!");
            return con;
        }else{
           System.out.println("FAIL!");
           return null; 
        }
    }
}
