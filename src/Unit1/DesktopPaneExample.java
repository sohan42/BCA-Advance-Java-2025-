package Unit1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class DesktopPaneExample extends JFrame{
    private JDesktopPane jd = new JDesktopPane();
    DesktopPaneExample(){
        setTitle("Main Window");
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setJInternalFrame(jd,"InternalFrame1",30,30);
        setJInternalFrame(jd,"InternalFrame2",60,60);
        add(jd);   
    }
    
    void setJInternalFrame(JDesktopPane jd,String name,int loc1,int loc2){
        JInternalFrame jn = new JInternalFrame(name,true,true,true,true);
        jn.setLayout(new FlowLayout());
        jn.setSize(300, 300);
        jn.add(new JButton("JButton"));
        jn.setLocation(loc2, loc2);
        jn.setVisible(true);
        jd.add(jn);
    }
    public static void main(String[] args){
        new DesktopPaneExample();
    }
}
