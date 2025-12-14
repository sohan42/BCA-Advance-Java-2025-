package Unit1;

//WAP to demonstrate usage of EDT for thread safety.
import java.awt.EventQueue;
import javax.swing.JFrame;

public class ThreadSafe extends JFrame{
    ThreadSafe(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400,400);
            setLocationRelativeTo(null);
            setVisible(true);
    }
    public static void main(String[] args){
        EventQueue.invokeLater(()->{new ThreadSafe();});
    }
}
