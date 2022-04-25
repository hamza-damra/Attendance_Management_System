/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amsystem;

import java.sql.*;

/**
 *
 * @author hamzadamra
 */
public class ConnectionClass {
    public ConnectionClass() throws ClassNotFoundException, SQLException
    {
        AddStudent std = new AddStudent();
        String name = std.
        Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con = (java.sql.Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/attendence_ms","root","");
         PreparedStatement  ps = con.prepareStatement("insert into studentb(Name, fName, hContact, Dept, Sem, Address, Email, Contact) value(?,?,?,?,?,?,?,?)");
    }
    
}
