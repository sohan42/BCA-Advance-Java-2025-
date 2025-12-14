package Unit2;

import java.sql.*;

public class Employee {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/java2025";
        String username = "root";
        String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            
            String sql = "INSERT INTO employee (name, salary, branch) VALUES ('Raja Pokhrel', 20000, 'Brt')";
            // Execute the insert query
            stmt.executeUpdate(sql);
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                String branch = rs.getString("branch");
                
                System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary+" Branch: "+branch);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
