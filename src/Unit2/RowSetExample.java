package Unit2;
//Program to demonstrate RowSet.

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class RowSetExample {
    private
        String url = "jdbc:mysql://localhost:3306/java2025";
        String user = "root";
        String password = ""; 
        JdbcRowSet rose = null;
    public 
        RowSetExample(){
            try{
                // Create a JdbcRowSet instance
                rose = RowSetProvider.newFactory().createJdbcRowSet();
                // Set database connection properties
                rose.setUrl(url);
                rose.setUsername(user);
                rose.setPassword(password);
                // Set the SQL query
                rose.setCommand("SELECT id, name, salary, branch FROM employee");
                // Execute the query
                rose.execute();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        void display(){
            try{ // Iterate through the results 
            while (rose.next()) {
                int id = rose.getInt("id");
                String name = rose.getString("name");
                double salary = rose.getDouble("salary");
                String branch = rose.getString("branch");
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary+ ", Branch: " + branch);
            }
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        void update(int r){
            try{
                rose.absolute(r); 
                rose.updateString("name", "Jiwan Adhikari");
                rose.updateRow();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        void insert(){
            try{
                rose.moveToInsertRow(); 
                rose.updateString("name", "Anita Rai");
                rose.updateDouble("salary", 38000);
                rose.updateString("branch", "DRN");
                rose.insertRow();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        void delete(int r){
            try{
                rose.absolute(r);
                rose.deleteRow();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    public static void main(String[] args){
        RowSetExample rs = new RowSetExample();
        rs.delete(2);
    }
}
