package frontend;

import backend.Anggota;
import backend.Peminjaman;
import backend.Buku;
/**
 *
 * @author Wahyu devi
 */
public class TestBackendPeminjaman {

    public static void main(String[] args) {
        Anggota agt = new Anggota().getById(2);
        Buku KeongMas = new Buku().getById(8);
        Peminjaman peminjaman1 = new Peminjaman(agt, KeongMas, "2019/06/14", "2019/06/15");
        peminjaman1.save();
        for (Peminjaman p : new Peminjaman().getAll()) {
            System.out.println("Nama Peminjam : " + p.getAnggota().getNama() + "\n"
                    +"Nama Buku : " + p.getBuku().getJudul() + "\n"
                    +"Tanggal Pinjam: " + p.getTanggalpinjam() + "\n"
                    +"Tanggal Kembali: " + p.getTanggalkembali());
        }
    }
}
