package Unit1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
//WAP to demonstrate KeyEvent in Swing.
public class KeyEventExample {
    KeyEventExample(){
        JFrame f = new JFrame("KeyEvent Example");
        f.setLayout(null);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                 System.out.println("Key typed: " + e.getKeyChar());
            }
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed: " + e.getKeyCode());
            }
            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released!");
            }
        });
        f.setVisible(true);
    }
    public static void main(String[] args){
        new KeyEventExample();
    }
}
