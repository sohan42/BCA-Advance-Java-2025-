/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.*;
import javax.swing.*;

//WAP to draw in a frame using JComponent and its features.
class MyJComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        // Cast Graphics to Graphics2D 
        Graphics2D g2d = (Graphics2D) g;

        // Draw a custom shape
        g2d.setColor(Color.RED);
        g2d.fillOval(10, 10, 100, 100);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200); 
        // Set preferred size of the component
    }
}

 class MyJFrame extends JFrame {
     MyJComponent mComponent = new MyJComponent();
    public MyJFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mComponent);      
        pack();
        setVisible(true);
    }
    public static void main(String[] args){
        EventQueue.invokeLater(()->{new MyJFrame();});
    }
}

