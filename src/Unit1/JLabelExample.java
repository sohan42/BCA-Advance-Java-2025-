package Unit1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Example");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
        JPanel p = new JPanel();
        p.setBounds(0,0,400,200);
        p.setBackground(Color.GREEN);
        
        JLabel l = new JLabel("My JLabel Example!");
        p.add(l);
        
        f.add(p);
        f.setVisible(true);
    }
}
