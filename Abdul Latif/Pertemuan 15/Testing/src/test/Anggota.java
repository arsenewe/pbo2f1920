
package test;

import java.util.ArrayList;
import java.sql.*;



public class Anggota {
    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
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

    public Anggota() {
    }

    public Anggota(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public Anggota getById(int id) {
        Anggota agt = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota();
                agt.setIdAnggota(rs.getInt("idAnggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota> getAll() {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota agt = new Anggota();
                agt.setIdAnggota(rs.getInt("idAnggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public ArrayList<Anggota> search(String keyword) {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota agt = new Anggota();
                agt.setIdAnggota(rs.getInt("idAnggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }
    
    public void save(){
        if(getById(idAnggota).getIdAnggota() == 0){
            String SQL = "Insert into anggota (nama,alamat,telepon) values(" 
                    + " '" +this.nama + "', "
                    + " '" +this.alamat + "', "
                    + " '"+this.telepon+"' "
                    + " )";
                    this.idAnggota = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "Update anggota set"
                   + " nama = '" +this.nama +"', "
                   + " alamat = '" +this.alamat +"', "
                   + " telepon = '"+this.telepon+"' "
                   +"Where idAnggota = '"+this.idAnggota+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM anggota WHERE idAnggota = '"+this.idAnggota+"'";
        DBHelper.executeQuery(SQL);
    }
    
    public ArrayList<Anggota> getByNamaAndAlamat(String nama, String alamat, String telp){
        ArrayList<Anggota> ListAnggota = new ArrayList();
ResultSet rs;
if ((nama.trim().length()>0) && (alamat.trim().length()>0) && (telp.trim().length()>0)){
rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '"+ nama +"' and alamat = '"+ alamat+"' and telepon = '"+ telp+"'");
}else if ((nama.trim().length()>0) && (alamat.trim().length()==0) && (telp.trim().length()>0)){
rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '"+ nama+"'and telepon = '"+ telp+"'");
}
else if ((nama.trim().length()>0) && (alamat.trim().length()>0) && (telp.trim().length()==0)){
rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '"+ nama+"'and alamat = '"+ alamat+"'");
}
else if ((nama.trim().length()==0) && (alamat.trim().length()>0) && (telp.trim().length()>0)){
rs = DBHelper.selectQuery("SELECT * FROM anggota Where alamat = '"+ alamat+"'and telepon = '"+ telp+"'");
}
else if ((nama.trim().length()>0)){
rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '"+ nama+"'");
}else if ((alamat.trim().length()>0)) {
rs = DBHelper.selectQuery("SELECT * FROM anggota Where alamat = '"+ alamat+"'");
}
else{
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
