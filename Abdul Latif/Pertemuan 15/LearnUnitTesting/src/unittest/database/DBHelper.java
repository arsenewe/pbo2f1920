/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.sql.*;

/**
 *
 * @author A S U S
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
               koneksi = DriverManager.getConnection(url, user, password);
            }
            catch (SQLException t){
                System.out.print("Koneksi Error!");
            }
        }
        
    }
    public static int insertQueryGetId(String query){
        bukaKoneksi();
        int num = 0;
        int result = -1;
        
        try{
            Statement smt = koneksi.createStatement();
            num = smt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = smt.getGeneratedKeys();
            
            if(rs.next()){
                result = rs.getInt(1);
            }
            rs.close();
            smt.close();
        }
        catch (Exception e){
            e.printStackTrace();
            result = -1;
        }
        return result;
    }
    public static boolean executeQuery(String query){
        bukaKoneksi();
        boolean result = false;
        
        try{
            Statement smt = koneksi.createStatement();
            smt.executeUpdate(query);
            
            result = true;
            smt.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public static ResultSet selectQuery(String query){
        bukaKoneksi();
        ResultSet rs = null;
        
        try{
            Statement smt = koneksi.createStatement();
            rs = smt.executeQuery(query);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
