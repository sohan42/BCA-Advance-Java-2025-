package Unit1;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaExample {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(200, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
        JTextArea ta = new JTextArea();
        ta.setBounds(10,10,150,150);
        f.add(ta);
      
        f.setVisible(true);
    }
}
