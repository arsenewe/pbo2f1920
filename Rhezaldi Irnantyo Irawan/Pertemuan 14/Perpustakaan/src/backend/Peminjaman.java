/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.*;
import java.sql.*;

/**
 *
 * @author user
 */
public class Peminjaman {
    private int idpeminjaman, idanggota, idbuku;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalpinjam;
    private String tanggalkembali;

    public Peminjaman() {
    
    }
    
    public Peminjaman(Anggota anggota, Buku buku, String tanggalpinjam, String tanggalkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }
    public int getIdanggota() {
        return idanggota;
    }
    
    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }
    
    public int getIdbuku() {
        return idbuku;
    }
    
    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }
    
    public int getIdpeminjaman() {
        return idpeminjaman;
    }
    
    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }
    
    public Anggota getAnggota() {
        return anggota;
    }
    
    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }
    
    public Buku getBuku() {
        return buku;
    }
    
    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    
    public String getTanggalpinjam() {
        return tanggalpinjam;
    }
    
    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }
    
    public String getTanggalkembali() {
        return tanggalkembali;
    }
    
    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }
    
    public Peminjaman getById(int id) {
        Peminjaman pinjam = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + " p.idpeminjaman AS idpeminjaman, "
                                            + " p.tanggalpinjam AS tanggalpinjam, "
                                            + " p.tanggalkembali AS tanggalkembali, "
                                            + " a.idanggota AS idanggota, "
                                            + " b.idbuku AS idbuku "
                                            + " FROM Peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                            + " LEFT JOIN Buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while(rs.next()) {
            pinjam = new Peminjaman();
            pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
            pinjam.setIdanggota(rs.getInt("idanggota"));
            pinjam.setIdbuku(rs.getInt("idbuku"));
            pinjam.setTanggalpinjam(rs.getString("tanggalpinjam"));

            pinjam.setTanggalkembali(rs.getString("tanggalkembali"));
            pinjam.setAnggota(new Anggota().getById(pinjam.getIdanggota()));
            pinjam.setBuku(new Buku().getById(pinjam.getIdbuku()));
        }
    }
        catch(Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }
    
    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + "p.idpeminjaman AS idpeminjaman, "
                                            + "p.tanggalpinjam AS tanggalpinjam, "
                                            + "p.tanggalkembali AS tanggalkembali, "
                                            + "a.idanggota AS idanggota, "
                                            + "b.idbuku AS idbuku "
                                            + "FROM Peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                            + "LEFT JOIN Buku b ON p.idbuku = b.idbuku"); 
        try {
            while(rs.next()) {
            Peminjaman pinjam = new Peminjaman();
            pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
            pinjam.setIdanggota(rs.getInt("idanggota"));
            pinjam.setIdbuku(rs.getInt("idbuku"));
            pinjam.setTanggalpinjam(rs.getString("tanggalpinjam"));

            pinjam.setTanggalkembali(rs.getString("tanggalkembali"));
            pinjam.setAnggota(new Anggota().getById(pinjam.getIdanggota()));
            pinjam.setBuku(new Buku().getById(pinjam.getIdbuku()));

            ListPinjam.add(pinjam);
            }
        }
        catch(Exception e) {
             e.printStackTrace();
        }
        return ListPinjam;
    }
    
    public void save() {
        if(getById(idpeminjaman).getIdpeminjaman()== 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                        + "values ("
                        + "'" + this.getAnggota().getIdAnggota() + "', "
                        + "'" + this.getBuku().getIdbuku()+ "',"
                        + "'" + this.tanggalpinjam + "', "
                        + "'" +this.tanggalkembali + "' "
                        + ")";
            this.idpeminjaman = DBHelper.insertQueryGetId(sql);
        }
        else {
            String sql = "UPDATE buku SET "
                        + "idAnggota = '" + this.getAnggota().getIdAnggota() + "', "
                        + "idBuku = '" + this.getBuku().getIdbuku() + "', "
                        + "tanggalpinjam = '" + this.tanggalpinjam + "', "
                        + "tanggalkembali = '" + this.tanggalkembali + "'";
            DBHelper.executeQuery(sql);
        }
    }
    
    public void cariAnggota(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while(rs.next()) {
                getAnggota().setIdAnggota(rs.getInt("idanggota"));
                getAnggota().setNama(rs.getString("nama"));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cariBuku(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM buku WHERE idbuku = '" + id + "'");
        
        try {
            while(rs.next()) {
                getBuku().setIdbuku(rs.getInt("idbuku"));
                getBuku().setJudul(rs.getString("judul"));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(sql);
    }
 }