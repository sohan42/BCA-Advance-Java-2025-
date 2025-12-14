package Unit1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterExample {
     public static void main(String[] args) {
        JFrame f = new JFrame("MouseAdapter Example");
        f.setLayout(null);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l = new JLabel("Click Anywhere");
        l.setBounds(100, 100, 100,20);
        f.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });
        f.add(l);
        f.setVisible(true);
    }
}
