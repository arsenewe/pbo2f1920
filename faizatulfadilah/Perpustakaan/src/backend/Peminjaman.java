package backend;
import java.util.*;
import java.sql.*;

public class Peminjaman {
    private int idpeminjaman, idanggota, idbuku;
    private Anggota ang = new Anggota();
    private Buku buku = new Buku();
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman(){
        
    }
    
    public Peminjaman(Anggota ang, Buku buku, String tanggalPinjam, String tanggalKembali){
        this.ang = ang;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
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
        return ang;
    }

    public void setAnggota(Anggota ang) {
        this.ang = ang;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
    
    public Peminjaman getById(int id){
        Peminjaman pem = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("Select "
                + "p.idpeminjaman as idpeminjaman, "
                + "p.tanggalpinjam as tanggalpinjam, "
                + "p.tanggalkembali as tanggalkembali, "
                + "a.idanggota as idanggota, "
                + "b.idbuku as idbuku "
                + "from peminjaman p left join anggota a on p.idanggota = a.idanggota "
                + "left join buku b on p.idbuku = b.idbuku where p.idpeminjam = '" + id + "'");
        try{
            while(rs.next()){
                pem = new Peminjaman();
                pem.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pem.setIdanggota(rs.getInt("idanggota"));
                pem.setIdbuku(rs.getInt("idbuku"));
                pem.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pem.setTanggalKembali(rs.getString("tanggalkembali"));
                pem.setAnggota(new Anggota().getById(pem.getIdanggota()));
                pem.setBuku(new Buku().getById(pem.getIdbuku()));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pem;
    }
    
    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select "
                + "p.idpeminjaman as idpeminjaman, "
                + "p.tanggalpinjam as tanggalpinjam, "
                + "p.tanggalkembali as tanggalkembali, "
                + "a.idanggota as idanggota, "
                + "b.idbuku as idbuku "
                + "from peminjaman p left join anggota a on p.idanggota = a.idanggota "
                + "left join buku b on p.idbuku = b.idbuku");
        try{
            while(rs.next()){
                Peminjaman pem = new Peminjaman();
                pem.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pem.setIdanggota(rs.getInt("idanggota"));
                pem.setIdbuku(rs.getInt("idbuku"));
                pem.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pem.setTanggalKembali(rs.getString("tanggalkembali"));
                pem.setAnggota(new Anggota().getById(pem.getIdanggota()));
                pem.setBuku(new Buku().getById(pem.getIdbuku()));
                
                ListPinjam.add(pem);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListPinjam;
    }
    
    public void save(){
        if(getById(idpeminjaman).getIdpeminjaman()== 0){
            String sql = "Insert into peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getAnggota().getIdAnggota() + "', "
                    + "'" + this.getBuku().getIdBuku()+ "',"
                    + "'" + this.tanggalPinjam + "', "
                    + "'" +this.tanggalKembali + "' "
                    + ")";
            this.idpeminjaman = DBHelper.insertQueryGetId(sql);
        }else{
            String sql = "Update buku set "
                    + "idanggota = '" + this.getAnggota().getIdAnggota() + "', "
                    + "idbuku = '" + this.getBuku().getIdBuku() + "', "
                    + "tanggalpinjam = '" + this.tanggalPinjam + "', "
                    + "tanggalkembali = '" + this.tanggalKembali + "'";
            DBHelper.executeQuery(sql);
        }
    }
    
    public void cariAnggota(int id){
        ResultSet rs = DBHelper.selectQuery("Select * from anggota where idanggota = '" + id + "'");
        try{
            while(rs.next()){
                getAnggota().setIdAnggota(rs.getInt("idanggota"));
                getAnggota().setNama(rs.getString("nama"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void cariBuku(int id){
        ResultSet rs = DBHelper.selectQuery("Select * from buku where idbuku = '" + id + "'");
        try{
            while(rs.next()){
                getBuku().setIdBuku(rs.getInt("idbuku"));
                getBuku().setJudul(rs.getString("judul"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void delete(){
        String sql = "Delete from peminjaman where idpeminjam = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(sql);
    }
}
