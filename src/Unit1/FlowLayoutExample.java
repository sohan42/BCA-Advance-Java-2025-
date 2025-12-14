package Unit1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

//WAP to demonstrate flowlayout in a swing.
public class FlowLayoutExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Flow Layout Example");
        f.setSize(300, 300); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        
        for (int i = 1; i <= 5; i++) {
            f.add(new JButton("Button " + i));
        } 
       
        f.setVisible(true);
    }
}
