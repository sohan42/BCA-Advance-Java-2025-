package Unit1;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Example");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setLayout(null);  
        
        JLabel l = new JLabel("Favourite sport..");
        l.setBounds( 10, 10, 100, 30);
        JCheckBox b1 = new JCheckBox("Football");
        b1.setBounds(10,40,100,30);
        JCheckBox b2 = new JCheckBox("Cricket");
        b2.setBounds(10,80,100,30);
        
        f.add(l);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
    }
}
