
package Unit2;

/* Create a java program using employee table, your program's output should display choices, 
For example:
        Enter your choice...
        1. Insert employee
        2. update salary
        3. update name
        4. update branch
        5. delete employee
        6. display all employee
        7. exit
   Based on user choice your program should able to perform choosen opreation on employee table.     
*/ 
import java.sql.*;
import java.util.Scanner;

public class EmployeeOperations {
    private
        String url = "jdbc:mysql://localhost:3306/java2025";
        String username = "root";
        String password = "";
        Connection conn;
        PreparedStatement ps;
        String sql;
    public 
        //It returns connection
        Connection connect(){
            try{
                 conn = DriverManager.getConnection(url, username, password);
                 return conn;
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            return null;
        } 
        
       //display all employee details 
       void display(){
           try{
           sql = "SELECT * FROM employee";
           ps= connect().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                String branch = rs.getString("branch");
                System.out.println("ID: " + id + "\nName: " + name+ "\nSalary: " + salary+ "\nBranch: " + branch);
            }
           }
           catch(SQLException e){
               e.printStackTrace();
           }
       }
       
       //Insert into employee table
       void insert(){
           try{
            sql = "INSERT INTO employee (name, salary, branch) VALUES (?, ?, ?)";
            ps= connect().prepareStatement(sql);
            
            Scanner sc = new Scanner(System.in);   
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.println("Enter branch: ");
            String branch = sc.next();
            
            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, branch);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
        }     
       
      //delete employee   
      void delete(){
           try{
            sql = "DELETE FROM employee WHERE id = ?";
            ps= connect().prepareStatement(sql);
            
            Scanner sc = new Scanner(System.in);   
            System.out.println("Enter id:");
            int id = sc.nextInt();
            
            ps.setInt(1, id);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
      }
      
      //update salary
      void updateSalary(){
          try{
            sql = "UPDATE employee SET salary = ? WHERE id = ?";
            ps= connect().prepareStatement(sql);
            
            Scanner sc = new Scanner(System.in);   
            System.out.println("Enter id:");
            int id = sc.nextInt();
            System.out.println("Enter updated salary:");
            double salary = sc.nextDouble();
            
            ps.setDouble(1, salary);
            ps.setInt(2, id);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
      } 
      
      //update name
      void updateName(){
          try{
            sql = "UPDATE employee SET name = ? WHERE id = ?";
            ps= connect().prepareStatement(sql);
            
            Scanner sc = new Scanner(System.in);   
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
      } 
      
      //update name
      void updateBranch(){
          try{
            sql = "UPDATE employee SET branch = ? WHERE id = ?";
            ps= connect().prepareStatement(sql);
            
            Scanner sc = new Scanner(System.in);   
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            System.out.println("Enter new branch: ");
            String branch = sc.next();
            
            ps.setString(1, branch);
            ps.setInt(2, id);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
      }
       public static void main(String[] args){
           EmployeeOperations emp = new EmployeeOperations();
           boolean flag = true;
           while (flag==true){
               System.out.println("Enter your choice...\n" + "1. Insert employee\n" + "2. update salary\n" +
                "3. update name\n"+"4. update branch\n"+"5. delete employee\n" + "6. display all employee\n" +  
                "7. exit");
               Scanner sc = new Scanner(System.in);
               int choice = sc.nextInt();
               switch(choice){
                   case 1:
                       emp.insert();
                       break;
                   case 2:  
                       emp.updateSalary();
                       break;
                   case 3:  
                       emp.updateName();
                       break;    
                   case 4:  
                       emp.updateBranch();
                       break;    
                   case 5:  
                       emp.delete();
                       break;
                   case 6:  
                       emp.display();
                       break;
                   case 7:  
                       flag=false;
                       break;    
                   default:
                       System.out.println("Enter valid input!");
               }
           }
       }
}

