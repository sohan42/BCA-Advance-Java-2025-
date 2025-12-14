package Unit1;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowEventExample {
    WindowEventExample(){
        JFrame f = new JFrame("WindowEvent Example");
        f.setLayout(null);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
            }
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
            }
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window iconified");
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window deiconified");
            }
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated");
            }            
        });
        f.setVisible(true);
    }
    public static void main(String[] args){
        new WindowEventExample();
    }
}
