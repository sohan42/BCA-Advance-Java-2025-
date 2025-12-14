package Unit1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class MouseEventExample{
    MouseEventExample(){
        JFrame f = new JFrame("MouseEvent Example");
        f.setLayout(null);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
               System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
            @Override
            public void mousePressed(MouseEvent e) {
               System.out.println("Mouse Pressed!");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released!");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered!");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited!");
            }
        });
        f.setVisible(true);
    }
    public static void main(String[] args){
        new MouseEventExample();
    }
}
