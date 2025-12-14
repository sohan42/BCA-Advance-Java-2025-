//To check connection..
package Unit2;

import java.sql.*;

public class Database {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/java2025";
        String username = "root";
        String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String grade = rs.getString("grade");
                
                System.out.println("Id: "+id+" Name: "+name+" Age: "+age+" Grade: "+grade);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//Create a program in java to retrive data from the employee(id,name,salary,branch) table.
