package Unit3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

//Program to demonstrate bound property using PropertyChangeListener. 
public class Car implements Serializable{
    private String name;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    public Car(){}
    public Car(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        pcs.firePropertyChange("name", oldName, name);
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
}

class Main{
    public static void main(String[] args){
        Car c = new Car("Ferrari");
        c.addPropertyChangeListener(new PropertyChangeListener(){
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                System.out.println("Property " + e.getPropertyName() + " changed from " +
                   e.getOldValue() + " to " + e.getNewValue());
            }
        });
        // Change properties
        c.setName("BMW");
    }
}
