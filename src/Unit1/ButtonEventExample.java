/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Example of event handling using button.
public class ButtonEventExample {
    ButtonEventExample(){
        JFrame f = new JFrame("EventHandling");        
        f.setSize(300,300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);       
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b = new JButton("Click Here!");
        b.setBounds(100, 100, 100,20);
        f.add(b);
        
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed!");
            }
        });
        f.setVisible(true);
    }
    
    public static void main(String args[]){
        new ButtonEventExample();
    }
}
