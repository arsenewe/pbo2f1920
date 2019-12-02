/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author A S U S
 */
public class Kategori {
    private int idkategori;
    private String nama, keterangan;
    
    public Kategori(){
        
    }

    public Kategori(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    
    public Kategori getById(int id){
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("select * from kategori where idkategori = '"+id+"'");
        try{
            while(rs.next()){
                kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return kat;
    }
    
    public Kategori getByName(String name){
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("select * from kategori where nama = '"+name+"'");
        try{
            while(rs.next()){
                kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return kat;
    }
    
    public ArrayList<Kategori> getAll(){
        ArrayList<Kategori> ListKategori = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select * from kategori");
        try{
            while(rs.next()){
                Kategori kat = new Kategori();
                kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ListKategori;
    }
    
    public ArrayList<Kategori> search(String keyword){
        ArrayList<Kategori> ListKategori = new ArrayList();
        
        String sql = "select * from kategori where nama like '%"+keyword+"%' "
                + "or keterangan like '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ListKategori;
    }
    
     public ArrayList<Kategori> getByNamaAndKeterangan(String keyword, String keterangan){
        ArrayList<Kategori> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (keterangan.trim().length()>0)){
            rs = DBHelper.selectQuery("SELECT * FROM kategori Where nama = '"+ nama +"' and keterangan = '"+ keterangan+"'");
        }else if ((nama.trim().length()>0) && (keterangan.trim().length()==0)){
            rs = DBHelper.selectQuery("SELECT * FROM kategori Where nama = '"+ nama+"'");
        }else {
            rs = DBHelper.selectQuery("SELECT * FROM kategori Where keterangan = '"+ keterangan+"'");
        }
        try {
            while (rs.next()) {
            Kategori kat = new Kategori();
            kat.setIdkategori(rs.getInt("idkategori"));
            kat.setNama(rs.getString("nama"));
            kat.setKeterangan(rs.getString("keterangan"));
            ListKategori.add(kat);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public void save(){
        if(getById(idkategori).getIdkategori()==0){
            String sql = "insert into kategori (nama, keterangan) values("
                    + "'"+this.nama+"', '"+this.keterangan+"')";
            this.idkategori = DBHelper.insertQueryGetId(sql);
        }
        else{
            String sql = "update kategori set nama = '"+this.nama+"', keterangan = '"+this.keterangan+"'"
                    + "where idkategori = '"+this.idkategori+"'";
            DBHelper.executeQuery(sql);
        }
    }
    
    public void delete(){
        String sql = "delete from kategori where idkategori = '"+this.idkategori+"'";
        DBHelper.executeQuery(sql);
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getIdkategori() {
        return idkategori;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    
}
