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
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Cursor;
import javax.swing.*;
import java.awt.event.*;



public class StudentDetails implements ActionListener {
        
      JFrame f;
      JLabel l1,l2;
      JButton btn1,btn2,btn3,btn4,btn5;
      
      StudentDetails()
      {
          f=new JFrame("Student Details");
          f.setBounds(200,30,550,450);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setLayout(null);
          f.setResizable(false);
          f.getContentPane().setBackground(Color.WHITE);
         Cursor cur = new Cursor(Cursor.HAND_CURSOR);
         
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("studentmanegmentsystem/img/s1.jpg"));
         Image i2 = i1.getImage().getScaledInstance(550,450,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         l1=new JLabel(i3); 
         l1.setBounds(0,0,550,450);
         f.add(l1);
        
         l2=new JLabel("Student Details");
         l2.setBounds(22, 20, 300, 75);
         l2.setFont(new Font("serif",Font.BOLD,42));
          l2.setForeground(Color.red);
         l1.add(l2);
      
          btn1 = new JButton("Add");
          btn1.setBounds(25,130,120,35);
          btn1.setForeground(Color.BLACK);
          btn1.setFont(new Font("TAHOMA",Font.PLAIN,18));
          btn1.setCursor(cur);
          btn1.addActionListener(this);
          l1.add(btn1);
          
          btn2 = new JButton("View");
          btn2.setBounds(175,130,120,35);
          btn2.setForeground(Color.BLACK);
          btn2.setFont(new Font("TAHOMA",Font.PLAIN,18));
          btn2.setCursor(cur);
          btn2.addActionListener(this); 
          l1.add(btn2);
          
         
          btn3 = new JButton("Remove");
          btn3.setBounds(25,185,120,35);
          btn3.setForeground(Color.BLACK);
          btn3.setFont(new Font("TAHOMA",Font.PLAIN,18));
          btn3.setCursor(cur);
          btn3.addActionListener(this);
          l1.add(btn3);
        
          btn4 = new JButton("Update");
          btn4.setBounds(175,185,120,35);
          btn4.setForeground(Color.black);
          btn4.setFont(new Font("TAHOMA",Font.PLAIN,18));
          btn4.setCursor(cur);
          btn4.addActionListener(this);
          l1.add(btn4);
          
          btn5 = new JButton("Back");
          btn5.setBounds(100,250,120,35);
          btn5.setBackground(Color.BLACK);
          btn5.setForeground(Color.WHITE);
          btn5.setFont(new Font("TAHOMA",Font.PLAIN,16));
          btn5.setCursor(cur);
          btn5.addActionListener(this);
          l1.add(btn5);

      
      
           f.setVisible(true);
      }

       @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            f.setVisible(false);
            new AddStudent().setVisible(true);
        }
        
        
        if(e.getSource() == btn2){
            f.setVisible(false);
          new ViewStudent().setVisible(true);
        }
        
        
        if(e.getSource() == btn3){
              f.setVisible(false);
           new RemoveStudent().setVisible(true);
        }
        
        
        if(e.getSource() == btn4){
             f.setVisible(false);
           new UpdateStudent().setVisible(true);
        }
        
        if(e.getSource() == btn5){
             f.setVisible(false);
             new Login_window().setVisible(true);
        }
    }
      
 //   @Override
  /*  public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      */
    public static void main(String[] args) {
        new StudentDetails();
    }
    
    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
