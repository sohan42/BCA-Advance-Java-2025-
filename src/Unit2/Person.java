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
        public static void main(String[] args){
            Person p = new Person();
            p.insert();
        }
}
