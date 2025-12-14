/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

//How can we draw(paint) on JFrame using JComponent, demonstrate using example?
class MyComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g){
        // Cast Graphics to Graphics2D 
        Graphics2D g2d = (Graphics2D) g;
        Font serifFont = new Font("Serif", Font.PLAIN, 24);
       
        g2d.setColor(Color.BLACK);
        
        g2d.setFont(serifFont);
        g2d.drawString("My Font", 10, 40);
        
        try {
            // Load the custom font from a file
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("F:\\Fonts\\BLKCHCRY.ttf")).deriveFont(30f);
            g2d.setFont(customFont);
            g2d.setColor(Color.BLACK);
            g2d.drawString("My Custom Font", 10, 80);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

        }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400); 
        // Set preferred size of the component
    }
}

public class MyPaint extends JFrame{
    public MyPaint() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyComponent mComponent = new MyComponent();
        add(mComponent);      
        pack(); 
        setVisible(true);
    } 
    public static void main(String args[]){
        EventQueue.invokeLater(()->{
            new MyPaint();
        });
    }
}


