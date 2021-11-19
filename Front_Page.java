/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanegmentsystem;

/**
 *
 * @author gurja
 */
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;


 public class Front_Page implements ActionListener
 {
    
     JFrame f;
     JLabel l1,l2;
     JButton b;
     
  Front_Page(){
     f=new JFrame("Student M System");
     f.setBackground(Color.GREEN);
     f.setLayout(null);
     f.setBounds(55,30,1000,540);
     f.setResizable(false);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("studentmanegmentsystem/img/w.jpg"));
     Image i2=i1.getImage().getScaledInstance(1200,700, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
      l1=new JLabel(i3);
     
     l1.setBounds(58,111,870,370);
     f.add(l1);
     
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        
        l2 = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        l2.setFont(new Font("TAHOMA",Font.PLAIN,56));
        l2.setForeground(Color.RED);
        l2.setBounds(61,1,900,120);
        f.add(l2);
      
   
     b=new JButton("CLICK HERE TO CONTINUE");
     b.setBackground(Color.pink);
     b.setForeground(Color.black);
     b.setFont(new Font("TAHOMA",Font.PLAIN,19));
     b.setBounds(325, 415, 300, 60);
     b.setBorderPainted(true);
     b.setCursor(cur);
     b.addActionListener(this);
     f.add(b);
     
     
     f.setVisible(true);
     
     while(true){
            l2.setVisible(false);
            try{
                   Thread.sleep(500);
                }
            catch(Exception ex){ }
            
            l2.setVisible(true);
            try{
                   Thread.sleep(1000);
                } 
            catch(Exception ex){ }
        }
       
     
 }

     @Override
   public void actionPerformed(ActionEvent e) {
       
  //       throw new UnsupportedOperationException("Not supported yet.");
      f.setVisible(false);
        new Login_window().setVisible(true);
        
    }
   // @Override
   /* public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
     public static void main(String[] args) {
         new Front_Page();

    }
}
