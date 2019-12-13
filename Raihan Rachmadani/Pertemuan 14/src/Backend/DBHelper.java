/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hp
 */
public class DBHelper {
   private static Connection koneksi; 
   
    public static void bukaKoneksi(){
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/dbperpus";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());                 
                koneksi = (Connection) DriverManager.getConnection(url, user, password); 
            }catch (SQLException t){
                System.out.println("Error koneksi");
            }
        }
    }
    
    public static int insertQueryGetId(String query){
        bukaKoneksi();
        int num = 0;
        int result = -1;
        
        try{
            Statement stmt = (Statement) koneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
               result = rs.getInt(1); 
            }
            
            rs.close();
            stmt.close();
            
        } catch (Exception e) {
          e.printStackTrace();
          result = -1;
       }
        return result;
    }
    
    public static boolean executeQuery(String query) throws SQLException{
        bukaKoneksi();
        boolean result = false;
        
        try{
             Statement stmt = (Statement) koneksi.createStatement();
             stmt.executeUpdate(query);
             result = true;
             stmt.close(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public static ResultSet selectQuery(String query) {
        bukaKoneksi();         ResultSet rs = null;
        try         
        {             
            Statement stmt = (Statement) koneksi.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e)         
        {             
            e.printStackTrace();
        }                  
        return rs;
    }
    
    
    
    
}
