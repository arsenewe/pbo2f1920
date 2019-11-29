package Backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Windows
 */
public class Buku {

    private int idbuku;
    private Kategori kategori = new Kategori();
    private String judul;
    private String penerbit;
    private String penulis;

    public Buku() {

    }

    public Buku(Kategori kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
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
                + "b.idbuku as idbuku, "
                + "b.judul as judul, "
                + "b.penerbit as penerbit, "
                + "b.penulis as penulis, "
                + "k.idkategori as idkategori, "
                + "k.nama as nama, "
                + "k.keterangan as keterangan "
                + "from buku b left join kategori k on b.idkategori = k.idkategori where b.idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku> getAll() {
        ArrayList<Buku> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select "
                + "b.idbuku as idbuku, "
                + "b.judul as judul, "
                + "b.penerbit as penerbit, "
                + "b.penulis as penulis, "
                + "k.idkategori as idkategori, "
                + "k.nama as nama, "
                + "k.keterangan as keterangan "
                + "from buku b "
                + "left join kategori k on b.idkategori = k.idkategori");
        try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Buku> search(String keyword) {
        ArrayList<Buku> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select b.idbuku as idbuku, "
                + "b.judul as judul, "
                + "b.penerbit as penerbit, "
                + "b.penulis as penulis, "
                + "k.idkategori as idkategori, "
                + "k.nama as nama, "
                + "k.keterangan as keterangan "
                + "from buku b left join kategori k on b.idkategori = k.idkategori "
                + "where b.judul like '%" + keyword + "%' or b.penerbit like '%" + keyword + "%'"
                + " or b.penulis like '%" + keyword + "%'");
        try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void save() {
        if (getById(idbuku).getIdbuku() == 0) {
            String sql = "Insert into buku (judul, idkategori, penulis, penerbit) "
                    + "values ("
                    + "'" + this.judul + "', "
                    + "'" + this.getKategori().getIdkategori() + "',"
                    + "'" + this.penulis + "', "
                    + "'" + this.penerbit + "' "
                    + ")";
            this.idbuku = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "Update buku set "
                    + "judul = '" + this.judul + "', "
                    + "idkategori = '" + this.getKategori().getIdkategori() + "', "
                    + "penulis = '" + this.penulis + "', "
                    + "penerbit = '" + this.penerbit + "' "
                    + "where idbuku = '" + this.idbuku + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "Delete from buku where idbuku = '" + this.idbuku + "'";
        DBHelper.executeQuery(sql);
    }
}
