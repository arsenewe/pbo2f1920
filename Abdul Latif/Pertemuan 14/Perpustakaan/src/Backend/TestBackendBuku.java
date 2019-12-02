/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import backend.*;

/*
 */
public class TestBackendBuku {
    public static void main(String[] args) {
        Kategori novel = new Kategori().getById(1);
        Kategori referensi = new Kategori().getById(3);

        Buku buku1 = new Buku(novel, "Sherlock Holmes", "Elex Media", "Sir Arthur Conan Doyle");

        buku1.save();

        for(Buku b : new Buku().getAll())
        {
        System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

        for(Buku b : new Buku().search("sherlock"))
        {
        System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

    }
}
