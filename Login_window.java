/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanegmentsystem;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author gurja
 */
public class Login_window implements  ActionListener
{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton btn1 ,btn2;
    
    Login_window()
    {
        f=new JFrame("Login");
        f.setBounds(210,70,650,350);
        f.setBackground(Color.white);
        f.getContentPane().setBackground(Color.green);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        
        
        
        l1=new JLabel("Username");
        l1.setBounds(90, 54, 100, 30);
        l1.setFont(new Font("TAHOMA",Font.PLAIN,19));
        f.add(l1);
        
        l2=new JLabel("Password");
        l2.setBounds(90,105,100,30);
        l2.setFont(new Font("TAHOMA",Font.PLAIN,19));
        f.add(l2);
        
        t1 =new JTextField();
        t1.setBounds(260,54,120,30);
        t1.setFont(new Font("TAHOMA",Font.PLAIN,19));
        f.add(t1);
        
        t2=new JPasswordField();
        t2.setBounds(260,105 ,120,30);
        t2.setFont(new Font("TAHOMA",Font.PLAIN,19));
        f.add(t2);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("studentmanegmentsystem/img/login.jpg"));
         Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel l3 = new JLabel(i3);
         l3.setBounds(400,20,190,180);
         f.add(l3);
         
          btn1 = new JButton("Login");
          btn1.setBounds(260,190,120,35);
          btn1.setBackground(Color.BLACK);
          btn1.setForeground(Color.WHITE);
          btn1.setFont(new Font("TAHOMA",Font.PLAIN,18));
          btn1.setCursor(cur);
          btn1.addActionListener(this);
          f.add(btn1);
         
          btn2 = new JButton("Cancel");
          btn2.setBounds(80,190,120,35);
          btn2.setBackground(Color.BLACK);
          btn2.setForeground(Color.WHITE);
          btn2.setFont(new Font("TAHOMA",Font.PLAIN,18));
          btn2.setCursor(cur);
          btn2.addActionListener(this);
          f.add(btn2);
         
         
         
         f.setVisible(true);
     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == btn2){
             System.exit(0);
         }
         if(e.getSource() == btn1){
          
             try{
                  Connection con = Conn.dbconnect();
           
                  String user = t1.getText();
                  String pass =t2.getText();
          
                 PreparedStatement pst=( PreparedStatement)con.prepareStatement("select * from signin where Username=? and password=?");   
                 pst.setString(1, user);
                 pst.setString(2, pass);
                
                 ResultSet rs = pst.executeQuery();
                
                 if(rs.next()){
                     f.setVisible(false);
                     new StudentDetails().setVisible(true);
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"Invalid username Or Password");
                 }
                 t1.setText("");
                 t2.setText("");
             } catch (SQLException ex) {
                  ex.printStackTrace();
             }
           
         }
    }

    
    
    
  //  @Override
  /*  public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
     void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        new Login_window();
    }
}

 