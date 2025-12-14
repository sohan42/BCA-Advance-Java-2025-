package Unit1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Example");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Button 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(new JButton("Button 1"), gbc);
        
        //Button 2
        gbc.gridx = 1;
        gbc.gridy = 0;
        f.add(new JButton("Button 2"), gbc);
        
        //Button 3
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // Span two columns
        f.add(new JButton("Button 3"), gbc);
        
        f.setVisible(true);
    }
}
