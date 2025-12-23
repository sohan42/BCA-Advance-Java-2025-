package Unit3;

import java.io.Serializable;
//Program to dmonstrate concept of java beans following its basic rules.
public class Person implements Serializable{ //implements Serializable interface
    private
      String name;
      int age;
    public
      Person(){} //public no-arg constructor
      void setName(String name){ //setter for name
          this.name = name;
      }
      void setAge(int age){ //setter for age 
          this.age = age;
      }
      String getName(){ //getter for name
          return name;
      }
      int getAge(){ //getter for age
          return age;
      }
}
