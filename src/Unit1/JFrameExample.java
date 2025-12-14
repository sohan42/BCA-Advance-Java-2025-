
package Unit1;

import javax.swing.JFrame;

//WAP to create a frame. 
public class JFrameExample{
    JFrame f = new JFrame(); 
    JFrameExample(){
        f.setTitle("Example"); //create title
        //f.setSize(400,400); //size wifht x hight
        //f.setLocation(400, 400);
        f.setResizable(false);
        f.setBounds(20, 20, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //decide what to do while closing
        f.setVisible(true); //make frame visible
    }
    public static void main(String args[]){
        JFrameExample e = new JFrameExample();
    }
}
