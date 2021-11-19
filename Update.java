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
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.ResultSet;

public class Update implements ActionListener {
   
    
    JFrame f;
    JLabel lab,lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11;
    JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11;
    JButton btn,btn1;
     String a,b,c,d,e,ff,g,h,i,j,id;
     boolean typing=false;
    Update(String empid){
      
        try{
             Connection con = Conn.dbconnect();
                id=empid;
                
                PreparedStatement pst = con.prepareStatement("select * from studentdetails where studentid=?");
                pst.setString(1, id);
                ResultSet rs=pst.executeQuery();
                
                if(rs.next()){
                  //name,fathername,age,address,email,phone,studentid,dathofbirth,aadhar,standard
                    a=rs.getString("name");
                    b=rs.getString("fathername");
                    c=rs.getString("age");
                    d=rs.getString("address");
                    e=rs.getString("email");
                    ff=rs.getString("phone");
                    g=rs.getString("studentid");
                    h=rs.getString("dathofbirth");
                    i=rs.getString("aadhar");
                    j=rs.getString("standard");
                    
                    txt1.setText(rs.getString("name"));
                    txt2.setText(rs.getString("fathername"));
                    txt3.setText(rs.getString("age"));
                    txt4.setText(rs.getString("address"));
                    txt5.setText(rs.getString("email"));
                    txt6.setText(rs.getString("phone"));
                    txt7.setText(rs.getString("studentid"));
                    txt8.setText(rs.getString("dathofbirth"));
                    txt9.setText(rs.getString("aadhar"));
                    txt10.setText(rs.getString("standard"));
                }
        }
        catch(Exception en){
            en.printStackTrace();
        }
        
        
        f = new JFrame("Update Student");
        
        f.setBounds(100,0,900,690);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.WHITE);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("studentmanegmentsystem/img/add_employee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel la=new JLabel(i3); 
        la.setBounds(0,0,900,690);
        f.add(la);
        
        
        lab = new JLabel("Update Student Details");
        lab.setBounds(280,50,400,40);
        lab.setFont(new Font("Serif",Font.PLAIN,35));
        lab.setForeground(Color.BLACK);
        la.add(lab);
        
        lab1 = new JLabel("Name");
        lab1.setBounds(50,150,200,30);
        lab1.setFont(new Font("Serif",Font.BOLD,24));
        lab1.setForeground(Color.BLACK);
        la.add(lab1);
        
        lab2 = new JLabel("Father Name");
        lab2.setBounds(50,210,200,30);
        lab2.setFont(new Font("Serif",Font.BOLD,24));
        lab2.setForeground(Color.BLACK);
        la.add(lab2);
        
        lab3 = new JLabel("Age");
        lab3.setBounds(50,270,200,30);
        lab3.setFont(new Font("Serif",Font.BOLD,24));
        lab3.setForeground(Color.BLACK);
        la.add(lab3);
        
        lab4 = new JLabel("Address");
        lab4.setBounds(50,330,200,30);
        lab4.setFont(new Font("Serif",Font.BOLD,24));
        lab4.setForeground(Color.BLACK);
        la.add(lab4);
        
        lab5 = new JLabel("Email ID");
        lab5.setBounds(50,390,200,30);
        lab5.setFont(new Font("Serif",Font.BOLD,24));
        lab5.setForeground(Color.BLACK);
        la.add(lab5);
        
        lab6 = new JLabel("Phone");
        lab6.setBounds(50,450,200,30);
        lab6.setFont(new Font("Serif",Font.BOLD,24));
        lab6.setForeground(Color.BLACK);
        la.add(lab6);
        
        lab7 = new JLabel("Student ID");
        lab7.setBounds(430,150,200,30);
        lab7.setFont(new Font("Serif",Font.BOLD,24));
        lab7.setForeground(Color.BLACK);
        la.add(lab7);
        
       
        lab8 = new JLabel("Dath of Birth");
        lab8.setBounds(430,210,200,30);
        lab8.setFont(new Font("Serif",Font.BOLD,24));
        lab8.setForeground(Color.BLACK);
        la.add(lab8);
        
        lab9 = new JLabel("Aadhar");
        lab9.setBounds(430,270,200,30);
        lab9.setFont(new Font("Serif",Font.BOLD,24));
        lab9.setForeground(Color.BLACK);
        la.add(lab9);
        
        lab10 = new JLabel("Standard");
        lab10.setBounds(430,330,200,30);
        lab10.setFont(new Font("Serif",Font.BOLD,24));
        lab10.setForeground(Color.BLACK);
        la.add(lab10);
        
        
        txt1 = new JTextField(a);
        txt1.setBounds(190,150,180,30);
        txt1.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt1.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
             
        la.add(txt1);
        
        txt2 = new JTextField(b);
        txt2.setBounds(190,210,180,30);
        txt2.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt2.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
        la.add(txt2);
        
        txt3 = new JTextField(c);
        txt3.setBounds(190,270,180,30);
        txt3.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt3.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
        la.add(txt3);
        
        txt4 = new JTextField(d);
        txt4.setBounds(190,330,180,30);
        txt4.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt4.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
        la.add(txt4);
        
        txt5 = new JTextField(e);
        txt5.setBounds(190,390,180,30);
        txt5.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt5.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
        la.add(txt5);
        
        txt6 = new JTextField(ff);
        txt6.setBounds(190,450,180,30);
        txt6.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt6.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
        la.add(txt6);
         
        txt7 = new JTextField(g);
        txt7.setBounds(620,150,180,30);
        txt7.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt7.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
        la.add(txt7);
        
        txt8 = new JTextField(h);
        txt8.setBounds(620,210,180,30);
        txt8.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt8.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
        la.add(txt8);
        
        txt9 = new JTextField(i);
        txt9.setBounds(620,270,180,30);
        txt9.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt9.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
        la.add(txt9);
        
        txt10 = new JTextField(j);
        txt10.setBounds(620,330,180,30);
        txt10.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        txt10.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ep){
          
                typing = true;
                   if(typing == true){
                     btn1.setEnabled(true);
                   }           

                }
        });
        la.add(txt10);
     
        
          btn = new JButton("Back");
          btn.setBounds(220,495,130,39);
          btn.setBackground(Color.BLACK);
          btn.setForeground(Color.WHITE);
          btn.setFont(new Font("TAHOMA",Font.PLAIN,17));
          btn.setCursor(cur);
          btn.addActionListener(this);
          la.add(btn);
         
          btn1 = new JButton("Update");
          btn1.setBounds(490,495,130,39);
          btn1.setBackground(Color.BLACK);
          btn1.setForeground(Color.WHITE);
          btn1.setFont(new Font("TAHOMA",Font.PLAIN,17));
          btn1.setCursor(cur);
          btn1.addActionListener(this);
          btn1.setEnabled(false);
          la.add(btn1);
          
       f. setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            f.setVisible(false);
            new UpdateStudent().setVisible(true);
        }
        if(e.getSource() == btn1){
         
           try {
               
                  Connection cons = Conn.dbconnect();
                
                  String Name =txt1.getText();
                 String FatherName =txt2.getText();
                String Age =txt3.getText();
                String Address =txt4.getText();
                String EmailId=txt5.getText();
                String Phone=txt6.getText();  
                String StudentId=txt7.getText();
                String DathOfBirth =txt8.getText();
                String Aadhar=txt9.getText();
                String Standard=txt10.getText();
            
                
                  PreparedStatement pstm =cons.prepareStatement("update studentdetails set name=?,fathername=?,age=?,address=?,email=?,phone=?,studentid=?,dathofbirth=?,aadhar=?,standard=? where studentid='"+id+"'");
                
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
                   
                  JOptionPane.showMessageDialog(null, "Data Update Successfully");
                  
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");
                txt7.setText("");
                txt8.setText("");
                txt9.setText("");
                txt10.setText("");
            
            } catch(SQLException ex) {
                 ex.printStackTrace();
            }
        }
         
    }
    
    public static void main(String[] args){
        new Update("");
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}