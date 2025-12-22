
package Unit2;

import java.sql.*;

//WAP to demonstrate concept of Scrollable and Updatable Result sets.
public class ScrollExample {
    private
        String url = "jdbc:mysql://localhost:3306/java2025";
        String user = "root";
        String password = ""; 
        Connection conn = null;
        Statement st= null;
        ResultSet rs = null;
    public
      ScrollExample(){
          try {
            conn = DriverManager.getConnection(url, user, password);
            // Create a scrollable and updatable Statement object
            st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String query = "SELECT id, name, salary, branch FROM employee";
            rs = st.executeQuery(query);
          }catch(SQLException ex){
            System.out.println(ex);
          }
      }
      void lastRowDisplay(){
          try {// Move the cursor to the last row
            rs.last();
            System.out.println("Last Row: ID = " + rs.getInt("id") + 
              ", Name = " + rs.getString("name")+ 
              ", Salary = " + rs.getDouble("salary")+
              ", branch = " + rs.getString("branch"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }  
      void firstRowDisplay(){
          try {// Move the cursor to the first row
            rs.first();
            System.out.println("First Row: ID = " + rs.getInt("id") + 
              ", Name = " + rs.getString("name")+ 
              ", Salary = " + rs.getDouble("salary")+
              ", branch = " + rs.getString("branch"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }
      void AbsoluteRowDisplay(int i){
          try {// Move the cursor to the specific row
            rs.absolute(i);
            System.out.println("Last Row: ID = " + rs.getInt("id") + 
              ", Name = " + rs.getString("name")+ 
              ", Salary = " + rs.getDouble("salary")+
              ", branch = " + rs.getString("branch"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }
      void UpdateAbsoluteRow(int i){
          try {// Move the cursor to the specific row
            rs.absolute(i);
            rs.updateString("name", "Jiwan");// Update the name of the current row
            rs.updateString("salary", "35000");
            rs.updateRow();
            System.out.println("ID = " + rs.getInt("id") + 
              ", Name = " + rs.getString("name")+ 
              ", Salary = " + rs.getDouble("salary")+
              ", branch = " + rs.getString("branch"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }
      void InsertRow(){
          try {
            // Insert a new row
            rs.moveToInsertRow();
            rs.updateString("name", "Aman Raj");
            rs.updateString("salary", "60000");
            rs.updateString("branch", "Ith");
            rs.insertRow();
            System.out.println("ID = " + rs.getInt("id") + 
              ", Name = " + rs.getString("name")+ 
              ", Salary = " + rs.getDouble("salary")+
              ", branch = " + rs.getString("branch"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }
      void deleteRow(int i){
          try {//Delete the row
            rs.absolute(i);
            rs.deleteRow();
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }
    public static void main(String[] args){
        ScrollExample s = new ScrollExample();
        s.deleteRow(13);
    }
}