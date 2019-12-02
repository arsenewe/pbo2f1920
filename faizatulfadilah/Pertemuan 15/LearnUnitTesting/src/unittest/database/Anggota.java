package unittest.database;

import java.util.*;
import java.sql.*;

public class Anggota {
    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota(){
        
    }
    
    public Anggota(String nama, String alamat, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public int getIdAnggota() {
        return idanggota;
    }

    public void setIdAnggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public Anggota getById(int id){
        Anggota ag = new Anggota();
        ResultSet rs = DBHelper.selectQuery("Select * from anggota where idanggota = '" + id + "'");
        try{
            while(rs.next()){
                ag = new Anggota();
                ag.setIdAnggota(rs.getInt("idanggota"));
                ag.setNama(rs.getString("nama"));
                ag.setAlamat(rs.getString("alamat"));
                ag.setTelepon(rs.getString("telepon"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ag;
    }
    
    public ArrayList<Anggota> getAll(){
        ArrayList<Anggota> ListAnggota = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select * from anggota");
        try{
            while(rs.next()){
                Anggota ag = new Anggota();
                ag.setIdAnggota(rs.getInt("idanggota"));
                ag.setNama(rs.getString("nama"));
                ag.setAlamat(rs.getString("alamat"));
                ag.setTelepon(rs.getString("telepon"));
                ListAnggota.add(ag);
            }
        }catch(Exception e ){
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public ArrayList<Anggota> search(String keyword){
        ArrayList<Anggota> ListAnggota = new ArrayList();
        String sql = "Select * from anggota where nama like '%" + keyword + "%' or alamat like '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try{
            while(rs.next()){
                Anggota ag = new Anggota();
                ag.setIdAnggota(rs.getInt("idanggota"));
                ag.setNama(rs.getString("nama"));
                ag.setAlamat(rs.getString("alamat"));
                ag.setTelepon(rs.getString("telepon"));
                ListAnggota.add(ag);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public void save(){
        if(getById(idanggota).getIdAnggota() == 0){
            String sql = "Insert into anggota (nama, alamat, telepon) values ('" + this.nama +"','" + this.alamat +"','" + this.telepon + "')";
            this.idanggota = DBHelper.insertQueryGetId(sql);
        }else{
            String SQL = "Update anggota set nama = '" + this.nama + "', alamat = '" + this.alamat +"', telepon = '" + this.telepon + "'"
                    + "where idanggota = '" + this.idanggota +"'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "Delete from anggota where idanggota = '" + this.idanggota + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public ArrayList<Anggota> getByNamaAndAlamat(String nama, String alamat, String telp){
        ArrayList<Anggota> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (alamat.trim().length()>0) && (telp.trim().length()>0)){
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '"+ nama +"' and alamat = '"
                    + alamat+"' and telepon = '"+ telp+"'");
        } else if ((nama.trim().length()>0) && (alamat.trim().length()==0) && (telp.trim().length()>0)){
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '"+ nama+"'and telepon = '"+ telp +"'");
        } else if ((nama.trim().length()>0) && (alamat.trim().length()>0) && (telp.trim().length()==0)){
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '"+ nama+"'and alamat = '"+ alamat +"'");
        } else if ((nama.trim().length()==0) && (alamat.trim().length()>0) && (telp.trim().length()>0)){
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where alamat = '"+ alamat+"'and telepon = '"+ telp +"'");
        } else if ((nama.trim().length()>0)){
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '"+ nama+"'");
        } else if ((alamat.trim().length()>0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where alamat = '"+ alamat+"'");
        } else{
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where telepon = '"+ telp+"'");
        }
        try {
            while (rs.next()) {
                Anggota ang = new Anggota();
                ang.setIdAnggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
}