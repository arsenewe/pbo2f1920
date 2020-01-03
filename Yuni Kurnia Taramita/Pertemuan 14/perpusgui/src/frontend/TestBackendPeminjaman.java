
package frontend;

import backend.Anggota;
import backend.Peminjaman;
import backend.Buku;
/**
 *
 * @author ASUS
 */
public class TestBackendPeminjaman {
    public static void main(String[] args) {
        Anggota agt = new Anggota().getById(4);
        Buku TimunMas = new Buku().getById(12);
        Peminjaman peminjaman1 = new Peminjaman(agt, TimunMas, "2019/12/26", "2019/12/28");
        peminjaman1.save();
        for (Peminjaman p : new Peminjaman().getAll()) {
            System.out.println("Nama Peminjam : " + p.getAnggota().getNama() + "\n"
                    +"Nama Buku : " + p.getBuku().getJudul() + "\n"
                    +"Tanggal Pinjam: " + p.getTanggalpinjam() + "\n"
                    +"Tanggal Kembali: " + p.getTanggalkembali());
        }
    }
}