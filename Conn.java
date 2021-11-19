/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanegmentsystem;

import javax.swing.*;
//import javax.swing.tabel.DefaultTableModel;
//import com.mysql.jdbc.ResultSetMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;

public class Conn{

    

  public static Connection dbconnect(){
       Connection cons =null;
     
        try {
            
        
                   Class.forName("com.mysql.jdbc.Driver");
             
                   cons = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/loginform","root","");
        
        } catch (Exception ex) {  }    
       
        return(cons);
    }
    
}
       
    
    
