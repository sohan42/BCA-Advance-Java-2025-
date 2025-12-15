package Unit2;

import java.sql.*;
/*Store Procedure: To create a store procedure on XAMPP follow the following steps: 
    1. Click on the newly created database name (e.g., test) in the left sidebar.
    2. Click on the "SQL" tab to open the SQL query editor.
    3. Enter the following SQL code to create the stored procedure:
        DELIMITER //
        CREATE PROCEDURE insertEmployee(IN ename VARCHAR(100), IN esalary double)
        BEGIN
        INSERT INTO employee (name, salary) VALUES (ename, esalary);
        END 
    4. Click the "Go" button to execute the SQL code.*/

//WAP to call the store procedure to store employee details in the employee table.

public class StoreProcedure {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/java2025";
        String username = "root";
        String password = "";
        Connection conn;
        CallableStatement cs;
        try {
            conn = DriverManager.getConnection(url, username, password);
            // Define the SQL query to call the stored procedure
            String sql = "{CALL insertEmployee(?, ?, ?)}";
            
            // Create the CallableStatement object
            cs = conn.prepareCall(sql);
            
            cs.setString(1, "Rajiv Bista");
            cs.setDouble(2, 50000.00);
            cs.setString(3, "KTM");
            
            cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
