
package Unit2;

import java.sql.*;

public class Employees {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/java2025";
        String username = "root";
        String password = "";
        
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            //sql query
            String sql = "INSERT INTO employee (name, salary, branch) VALUES (?, ?, ?)";
           // Create the PreparedStatement object
            PreparedStatement ps = conn.prepareStatement(sql);
            // Set the parameters for the PreparedStatement
            ps.setString(1, "Aman Majhi");
            ps.setDouble(2, 45000);
            ps.setString(3, "BRT");
            // Execute the insert query
            ps.executeUpdate();
            
            String sql1 = "SELECT * FROM employee";
            ps= conn.prepareStatement(sql1);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
 