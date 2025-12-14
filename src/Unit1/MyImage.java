/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.*;
import javax.swing.*;

class MyComponents extends JComponent{
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Image img = new ImageIcon("..//AdvanceJava_2025//src//Unit1//spider.png").getImage();
        g2d.drawImage(img, 0,0, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400,400);
    }
}

public class MyImage extends JFrame{
    public MyImage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyComponents mComponent = new MyComponents();
        add(mComponent);      
        pack(); 
        setVisible(true);
    } 
    public static void main(String args[]){
        new MyImage();
    }
}
