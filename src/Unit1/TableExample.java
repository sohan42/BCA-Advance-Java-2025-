package Unit1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableExample {
    public static void main(String args[]){
        JFrame f = new JFrame("Example");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        String title[]={"s.n","Name","Address"};
        String data[][]={{"1","Raj","Itahari-8"},{"2","Aman","Itahari-1"},{"3","Rajiv","Itahari-5"}};
        JTable t=new JTable(data,title);    
       // t.setBounds(30,40,200,300);          
        JScrollPane s = new JScrollPane(t);    
        f.add(s);          
        
        f.setVisible(true);
    }
}
