package Unit1;

/*Create a frame with a button. Once you click the button dialog box will appear. Using the dialog box take two numbers
from the user and display sum of them on it.*/

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogSum {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setLayout(null); 
        
        JButton b1 = new JButton("Click");
        b1.setBounds(200, 200, 80, 25);
        f.add(b1);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog d;
                JLabel n1,n2,result;
                JTextField tn1,tn2;
                JButton display;
                
                d = new JDialog();
                d.setBounds(100, 100, 250, 200);
                d.setLayout(new FlowLayout());
                n1 = new JLabel("Number 1: ");
                tn1 = new JTextField(10);
                n2 = new JLabel("Number 2: ");
                tn2 = new JTextField(10);
                
                display = new JButton("Sum");
                result = new JLabel("Sum: ");
                display.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int num1, num2, add;
                        num1 = Integer.parseInt(tn1.getText());
                        num2 = Integer.parseInt(tn2.getText());
                        add = num1+num2;
                        result.setText("Sum: "+add);
                    }
                });
                d.add(n1); 
                d.add(tn1); 
                d.add(n2); 
                d.add(tn2); 
                d.add(display); 
                d.add(result);
                d.setVisible(true);
            }
        });
        f.setVisible(true);
    }
}
