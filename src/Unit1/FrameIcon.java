package Unit1;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//WAP to change icon of the frame.
public class FrameIcon extends JFrame{
    FrameIcon(){
        setSize(400, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me"); //create button
        add(button);
        
        Image img = new ImageIcon("..//AdvanceJava_2025//src//Unit1//spider.png").getImage(); //to get path of the image
        setIconImage(img); //set image as an icon
        
        setLayout(new FlowLayout()); //change layout
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args){
        new FrameIcon();
    }    
}
