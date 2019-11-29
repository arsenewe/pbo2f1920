package Forntend;

import Backend.*;

/**
 *
 * @author Windows
 */
public class TestBackend {

    public static void main(String[] args) {
        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori("Novel", "Komik anak-anak");

        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for (Kategori k : new Kategori().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for (Kategori k : new Kategori().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }

}
