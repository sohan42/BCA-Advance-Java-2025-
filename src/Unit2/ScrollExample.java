
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
            System.out.println("Last Row: ID = " + rs.getInt("id") + 
              ", Name = " + rs.getString("name")+ 
              ", Salary = " + rs.getDouble("salary")+
              ", branch = " + rs.getString("branch"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }
    public static void main(String[] args){
        ScrollExample s = new ScrollExample();
        s.firstRowDisplay();
    }
}