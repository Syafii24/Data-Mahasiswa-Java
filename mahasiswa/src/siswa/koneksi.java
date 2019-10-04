/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siswa;
import java.sql.*;
/**
 * 
 *
 * @author Abdullah Syafii
 */
public class koneksi {
    Connection con;
    public Connection getConnection(){
        try{
            con =DriverManager.getConnection("jdbc:mysql://localhost/universitas","root","");
            
        } catch (Exception e){
            
        }
        return con;
    }
}
