package student;

import java.sql.*;

public class DBMethods {
    private static Connection con ;
    private static Statement st;
    private static CallableStatement cs;

    static{
        try{
            con = BaseConnection.createConnection();
            st = con.createStatement();
        }
        catch(SQLException e){
            System.out.println("Error in Connection !!!");
        }
    }

    public static void getDetails(){
        try{
            String sql = "select * from student;";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt(1) +" "+rs.getString(2));
            }
        }
        catch(Exception e){
            System.out.println("Error in fetching....");
            System.out.println(e.getMessage());
        }
    }
    
    public static void setDetails(int id,String name){
        try{
            String sql = "insert into student values("+id+",'"+name+"');";
            int flag = st.executeUpdate(sql);
            if(flag>0){
                System.out.println("Value inserted Successfully!");
            }
            else{
                System.out.println("Value not Inserted!");
            }
        }
        catch(Exception e){
            System.out.println("Error in Inserting....");
            System.out.println(e.getMessage());
        }
    }

    public static void callProcedure(String procedure){
        try{
            cs = con.prepareCall("{call "+procedure+"()}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1) +" "+rs.getString(2));
            }
        }
        catch(Exception e){
            System.out.println("Error in Calling....");
            System.out.println(e.getMessage());
        }
    }
}
