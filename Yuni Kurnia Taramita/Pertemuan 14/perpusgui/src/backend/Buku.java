/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Buku {
    private int idBuku;
    private Kategori kategori = new Kategori();
    private String judul;
    private String penulis;
    private String penerbit;
    
    public Buku() {
    }

    public Buku(Kategori kategori, String judul, String penulis, String penerbit) {
        this.kategori=getKategori();
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public Buku getById(int id) {
        Buku buku = new Buku();
        ResultSet rs = DBHelper.selectQuery("Select "
                + " b.idBuku as idBuku, "
                + " b.judul as judul,"
                + " b.penulis as penulis, "
                + " b.penerbit as penerbit, "
                + " k.idKategori as idkategori, "
                + " k.nama as nama, "
                + " k.keterangan as keterangan"
                + " FROM buku b "
                + " left join kategori k on b.idKategori = k.idKategori "
                + " where b.idBuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku();
                buku.setIdBuku(rs.getInt("idBuku"));
                buku.getKategori().setIdkategori(rs.getInt("idKategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setPenerbit(rs.getString("penerbit"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
    public ArrayList<Buku> getAll() {
        ArrayList<Buku> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select "
                + " b.idBuku as idBuku, "
                + " b.judul as judul, "
                + " b.penulis as penulis, "
                + " b.penerbit as penerbit, "
                + " k.idKategori as idkategori, "
                + " k.nama as nama, "
                + " k.keterangan as keterangan "
                + " from buku b "
                + " left join kategori k on b.idKategori = k.idKategori ");
        try{
            while(rs.next()){
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("idBuku"));
                buku.getKategori().setIdkategori(rs.getInt("idKategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setPenerbit(rs.getString("penerbit"));
                
                ListBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ListBuku;
    }
    public ArrayList<Buku> search(String keyword){
        ArrayList<Buku> ListBuku = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("Select "
                + " b.idBuku as idbuku,"
                + " b.judul as judul,"
                + " b.penulis as penulis, "
                + " b.penerbit as penerbit, "
                + " k.idKategori as idkategori,"
                + " k.nama as nama,"
                + " k.keterangan as keterangan "
                + " FROM buku b "
                + " left join kategori k on b.idKategori = k.idKategori "
                + " where b.judul like '%"+keyword+"%' "
                + " OR b.penerbit like '%"+keyword+"%' "
                + " OR b.penulis LIKE '%"+keyword+"%' ");
        try{
            while(rs.next()){
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idKategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setPenerbit(rs.getString("penerbit"));
                
                ListBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListBuku;
    }
    public void save(){
        if(getById(idBuku).getIdBuku() == 0){
            String SQL = "INSERT INTO buku (judul,idKategori, penulis, penerbit) VALUES("
                    + " '"+this.judul+"', "
                    + " '"+this.getKategori().getIdkategori()+"', "
                    + " '"+this.penulis+"', "
                    + " '"+this.penerbit+"' "
                    + " )";
            this.idBuku = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE buku set "
                    + " judul = '"+this.judul+"', "
                    + " idKategori = '"+this.getKategori().getIdkategori()+"', "
                    + " penulis = '"+this.penulis+"', "
                    + " penerbit = '"+this.penerbit+"' "
                    + " WHERE idBuku = '"+this.idBuku+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM buku where idBuku = '"+this.idBuku+"'";
        DBHelper.executeQuery(SQL);
    }
}
