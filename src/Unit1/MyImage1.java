package Unit1;

import java.awt.*;
import javax.swing.*;

//Displaying image on JFrame using ImageIcon.
public class MyImage1 extends JFrame{
    MyImage1(){
        ImageIcon icon = new ImageIcon("..//MyJavaSwing//src//main//java//spider.png");
        JLabel label = new JLabel(icon);
        // Set the layout and add the label to this component.
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new MyImage1();
    }
}
