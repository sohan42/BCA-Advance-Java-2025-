package Unit1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

//WAP to demonstrate Border Layout in a swing.
public class BorderLayoutExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Border Layout Example");
        f.setSize(300, 300); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());
        
        f.add(new JButton("North"), BorderLayout.NORTH);
        f.add(new JButton("South"), BorderLayout.SOUTH);
        f.add(new JButton("East"), BorderLayout.EAST);
        f.add(new JButton("West"), BorderLayout.WEST);
        f.add(new JButton("Center"), BorderLayout.CENTER);
       
        f.setVisible(true);
    }
}
