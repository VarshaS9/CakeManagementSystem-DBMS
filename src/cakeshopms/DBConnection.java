/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakeshopms;
import java.sql.*;

public class DBConnection {
   
    static final String DB_URL="jdbc:mysql://localhost:3306/cakedb";
    static final String USER="root";
    static final String PASS="";
    public static Connection connectDB()
    {
        Connection conn=null;
        try{
            //register jjdbc driver,not required for newer version of jdk
           Class.forName("com.mysql.cj.jdbc.Driver");
            //Open a connection
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }
        catch(Exception e)
        {
            System.out.println("There were errors while connecting to DB:");
            return null;
        }
    }
}
