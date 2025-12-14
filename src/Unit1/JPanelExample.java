package Unit1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Example");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
        JPanel p = new JPanel();
        p.setBounds(0,0,400,200);
        p.setBackground(Color.GREEN);
        
        JButton b = new JButton("Click");
        b.setBackground(Color.blue);
        p.add(b);
        
        f.add(p);
        f.setVisible(true);
    }
}
