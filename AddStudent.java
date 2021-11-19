/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanegmentsystem;

//import com.sun.jdi.connect.spi.Connection;
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
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;




import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author gurja
 */
public class AddStudent implements ActionListener{
    
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton btn,btn1;
    
    AddStudent(){
        

    f =new JFrame("Add Student");
    f.setBounds(150,40,700,500);
    f.setResizable(false);
    f.setLayout(null);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.getContentPane().setBackground(Color.WHITE);
    
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        
        l1=new JLabel("New Student Details");
        l1.setBounds(180,20,400,40);
        l1.setFont(new Font("SERIF",Font.BOLD,38));
        f.add(l1);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("studentmanegmentsystem/img/add_employee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2=new JLabel(i3);
        l2.setBounds(0,0,700,500);
        f.add(l2);
        
        l3=new JLabel("Name");
        l3.setBounds(55,100,400,40);
        l3.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l3);
        
        l4=new JLabel("Fathre'sName");
        l4.setBounds(50,150,400,40);
        l4.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l4);
        
        l5=new JLabel("Age");
        l5.setBounds(55,210,400,40);
        l5.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l5);
        
        l6=new JLabel("Address");
        l6.setBounds(55,270,400,40);
        l6.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l6);
        
        l7=new JLabel("Email_Id");
        l7.setBounds(55,330,400,40);
        l7.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l7);
        
        l8=new JLabel("Phone");
        l8.setBounds(370,100,400,40);
        l8.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l8);
        
        l9=new JLabel("Student Id");
        l9.setBounds(370,150,400,40);
        l9.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l9);
        
        l10=new JLabel("Dath Of Birth");
        l10.setBounds(370,210,400,40);
        l10.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l10);
        
        l11=new JLabel("Aadhar no.");
        l11.setBounds(370,270,400,40);
        l11.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l11);
        
         l12=new JLabel("Standard");
        l12.setBounds(370,330,400,40);
        l12.setFont(new Font("SERIF",Font.BOLD,22));
        l2.add(l12);
        
        
        
          t1 = new JTextField();
          t1.setBounds(185,105,150,35);
          t1.setFont(new Font("TAHOMBO",Font.PLAIN,20));
          f.add(t1);
          
          t2 = new JTextField();
          t2.setBounds(185,160,150,35);
          t2.setFont(new Font("TAHOMBO",Font.PLAIN,20));
          f.add(t2);
          
          t3 = new JTextField();
          t3.setBounds(185,216,150,35);
          t3.setFont(new Font("TAHOMBO",Font.PLAIN,20));
          f.add(t3);
          
           t4 = new JTextField();
          t4.setBounds(185,275,150,35);
          t4.setFont(new Font("TAHOMBO",Font.PLAIN,20));
          f.add(t4);
          
           t5 = new JTextField();
          t5.setBounds(185,330,150,35);
          t5.setFont(new Font("TAHOMBO",Font.PLAIN,20));
          f.add(t5);
          
          t6 = new JTextField();
          t6.setBounds(520,105,150,35);
          t6.setFont(new Font("TAHOMBO",Font.PLAIN,20));
          f.add(t6);
          
          t7 = new JTextField();
          t7.setBounds(520,160,150,35);
          t7.setFont(new Font("TAHOMBO",Font.PLAIN,20));
          f.add(t7);
        
         t8 = new JTextField();
         t8.setBounds(520,216,150,35);
         t8.setFont(new Font("TAHOMBO",Font.PLAIN,20));
         f.add(t8);
         
         t9=new JTextField();
         t9.setBounds(520,275,150,35);
         t9.setFont(new Font("TAHOMBO",Font.PLAIN,20));
         f.add(t9);
         
         t10=new JTextField();
         t10.setBounds(520,330,150,35);
         t10.setFont(new Font("TAHOMBO",Font.PLAIN,20));
         f.add(t10);
         
        
          btn = new JButton("Back");
          btn.setBounds(200,385,140,40);
          btn.setBackground(Color.BLACK);
          btn.setForeground(Color.WHITE);
          btn.setFont(new Font("TAHOMA",Font.PLAIN,16));
          btn.setCursor(cur);
         btn.addActionListener(this);
          l2.add(btn);
         
          btn1 = new JButton("Submit");
          btn1.setBounds(370,385,140,40);
          btn1.setBackground(Color.BLACK);
          btn1.setForeground(Color.WHITE);
          btn1.setFont(new Font("TAHOMA",Font.PLAIN,16));
          btn1.setCursor(cur);
         btn1.addActionListener(this);
          l2.add(btn1);
         
         
         
     f.setVisible(true);
    }
    
    

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            f.setVisible(false);
            new StudentDetails().setVisible(true);
        }
        
        if(e.getSource() == btn1){
           
               Connection cons= (Connection) Conn.dbconnect();
            
                String Name =t1.getText();
                 String FatherName =t2.getText();
                String Age =t3.getText();
                String Address =t4.getText();
                String EmailId=t5.getText();
                String Phone=t6.getText();  
                String StudentId=t7.getText();
                String DathOfBirth =t8.getText();
                String Aadhar=t9.getText();
                String Standard=t10.getText();
            
          try{  
              
               
                PreparedStatement pstm =(PreparedStatement) cons.prepareStatement("insert into studentdetails(name,fathername,age,address,email,phone,studentid,dathofbirth,aadhar,standard) values(?,?,?,?,?,?,?,?,?,?)");
                pstm.setString(1,Name);
                pstm.setString(2,FatherName);
                pstm.setString(3,Age);
                pstm.setString(4,Address);
                pstm.setString(5,EmailId);
                pstm.setString(6,Phone);
                pstm.setString(7,StudentId);
                pstm.setString(8,DathOfBirth);
                pstm.setString(9,Aadhar);
                pstm.setString(10,Standard);
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student Details Added Successfully..!!");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                t10.setText("");
        
        } catch (SQLException ex) {
                 ex.printStackTrace();
            }
        
        }
    }
    
    public static void main(String[] args){
        new AddStudent();
    }

   

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}