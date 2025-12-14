package Unit1;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonExample {
        public static void main(String[] args) {
        JFrame f = new JFrame("Example");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null); 
        
        JRadioButton r1,r2;
        r1 = new JRadioButton("Male");
        r1.setBounds(40,10,100,40);
        
        r2 = new JRadioButton("Female");
        r2.setBounds(40,60,100,40);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        f.add(r1);
        f.add(r2);
        f.setVisible(true);
        }
}
