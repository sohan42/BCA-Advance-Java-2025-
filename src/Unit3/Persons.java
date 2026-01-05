package Unit3;

//WAP to view information about the Person bean class using BeanInfo interface.

import java.awt.Image;
import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.io.Serializable;

class Persons implements Serializable{
    private String name;
    private int age;
    
    public Persons(){}
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }   
}

class PersonsBeanInfo implements BeanInfo{
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return new BeanDescriptor(Persons.class); //edit
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        PropertyDescriptor name, age;
        try {
            name = new PropertyDescriptor("uname", Persons.class);
            age = new PropertyDescriptor("uage", Persons.class);
            return new PropertyDescriptor[] {name,age};
        } catch (IntrospectionException ex) {
            System.out.println(ex);
            return null;
        }
    }   

    @Override
    public int getDefaultPropertyIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BeanInfo[] getAdditionalBeanInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Image getIcon(int iconKind) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getDefaultEventIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}

class Main{
    public static void main(String[] args) throws IntrospectionException{
        BeanInfo info = Introspector.getBeanInfo(Persons.class); //Will use the PresonBeanInfo
        
        BeanDescriptor beanDescriptor = info.getBeanDescriptor();
        System.out.println("Class name:  " + beanDescriptor.getName());
        
        PropertyDescriptor[] propertyDescriptors = info.getPropertyDescriptors();
        
         System.out.println("Properties:");
            for (PropertyDescriptor pd : propertyDescriptors) { //for-each loop
                System.out.println("Name: " + pd.getName()); //Return the name of the property
                System.out.println("   Type: " + pd.getPropertyType()); //Returns the type of the property (e.g. String)
                System.out.println("   Read Method: " + pd.getReadMethod()); //Returns the getter method 
                System.out.println("   Write Method: " + pd.getWriteMethod()); //Return the setter method
                System.out.println();
            }
    }
}
