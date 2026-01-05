package Unit3;

import java.beans.*;
import java.io.Serializable;
//Program to demonstrate Constrained property using VetoableChengeSupport class.
public class Laptop implements Serializable{
    private String Lname;
    private float price;
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);

    public Laptop() {}
    public Laptop(String name, float price) {
        this.Lname = name;
        this.price = price;
    }
    public String getName() {
        return Lname;
    }
    public void setName(String name){
        this.Lname = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) throws PropertyVetoException {
        float oldPrice = this.price;
        PropertyChangeEvent event = 
          new PropertyChangeEvent(this, "price", oldPrice, price);
        vcs.fireVetoableChange(event);
        this.price = price;
    }
    public void addVCL(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }
}

class Main{
    public static void main(String[] args){
        Laptop l = new Laptop("Acer",70000);
        l.addVCL(new VetoableChangeListener(){
            @Override
            public void vetoableChange(PropertyChangeEvent e) throws PropertyVetoException {
                if ("price".equals(e.getPropertyName())){
                    float newPrice = (float) e.getNewValue();
                    if (newPrice < 65000) {
                        throw new PropertyVetoException("Price can not be less than 65000", e);
                    }
                }
                System.out.println(e.getPropertyName() + " cahanged from " +
                                   e.getOldValue() + " to " + e.getNewValue());
            }
        });
        try {  // Attempt to change properties
            l.setName("Aman");
            l.setPrice(68000);
            l.setPrice(64000); // This will throw a PropertyVetoException
        } catch (PropertyVetoException e) {
            System.out.println(e.getMessage());
        }

    }
}