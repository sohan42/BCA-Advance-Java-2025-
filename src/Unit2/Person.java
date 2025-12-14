/* Create a table Person (id,name,age,address). Create a java program and connect with the database. 
Then perform varoius opration on the table using different functions:
	a) Insert person details
	b) delete person details
	c) display person details
	d) display details of person whose age>=18
	e) update age of the person */ 

package Unit2;

import java.sql.*;
import java.util.Scanner;

public class Person {
    private
        String url = "jdbc:mysql://localhost:3306/java2025";
        String username = "root";
        String password = "";
        Connection conn;
        PreparedStatement ps;
        String sql;
    public    
        Person(){
            try{
                conn = DriverManager.getConnection(url, username, password);
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        //Insert person details
        void insert(){
            try{
            sql = "INSERT INTO Person (name, age, address) VALUES (?, ?, ?)";
            ps= conn.prepareStatement(sql);
            
            Scanner sc = new Scanner(System.in);   
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Enter address: ");
            String address = sc.next();
            
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, address);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
        }
        //delete person details
        void delete(){
           try{
            sql = "DELETE FROM person WHERE id = ?";
            ps= conn.prepareStatement(sql);
            
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
        //display person details
        void display(){
           try{
           sql = "SELECT * FROM person";
           ps= conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                System.out.println("ID: " + id + "\nName: " + name+ "\nAge: " + age+ "\nAddress: " + address);
            }
           }
           catch(SQLException e){
               e.printStackTrace();
           }
       }
        //display details of person whose age>=18
        void display18(){
           try{
           sql = "SELECT * FROM person WHERE age>= ?";
           ps= conn.prepareStatement(sql);
           
           ps.setInt(1, 18);
           ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                System.out.println("ID: " + id + "\nName: " + name+ "\nAge: " + age+ "\nAddress: " + address);
            }
           }
           catch(SQLException e){
               e.printStackTrace();
           }
       }
        //update age of the person 
        void updateAge(){
          try{
            sql = "UPDATE person SET age = ? WHERE id = ?";
            ps= conn.prepareStatement(sql);
            
            Scanner sc = new Scanner(System.in);   
            System.out.println("Enter id:");
            int id = sc.nextInt();
            System.out.println("Enter new age:");
            int age = sc.nextInt();
            
            ps.setDouble(1, age);
            ps.setInt(2, id);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
      }
        public static void main(String[] args){
            Person p = new Person();
            //p.insert();
            //p.display18();
            //p.updateAge();
            p.delete();
            p.display();
        }
}
