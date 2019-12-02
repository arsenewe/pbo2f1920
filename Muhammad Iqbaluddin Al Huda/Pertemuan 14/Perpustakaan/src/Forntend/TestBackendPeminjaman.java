/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forntend;

import Backend.*;

/**
 *
 * @author IQBAL
 */
public class TestBackendPeminjaman {

    public static void main(String[] args) {
        Kategori novel = new Kategori().getById(27);
        Kategori referensi = new Kategori().getById(28);
        Buku buku1 = new Buku(novel, "Ayat-ayat Cinta", " Bangku Kosong", "Laskar Pelangi");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer",
                "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        Anggota anggota1 = new Anggota("Iqbal", "Mojokerto", "0982363624");
        Anggota anggota2 = new Anggota("Fanani", "Qurtil", "007871231");
        Anggota anggota3 = new Anggota("Agung", "Aceh", "0865152112");

        Peminjaman peminjaman1 = new Peminjaman(anggota1, buku1, "2019/11/27", "2019/11/29");
        Peminjaman peminjaman2 = new Peminjaman(anggota2, buku2, "2019/11/27", "2019/11/29");
        Peminjaman peminjaman3 = new Peminjaman(anggota3, buku3, "2019/11/27", "2019/11/29");
// test insert

        novel.save();
        referensi.save();

        buku1.save();
        buku2.save();
        buku3.save();

        anggota1.save();
        anggota2.save();
        anggota3.save();

        peminjaman1.save();
        peminjaman2.save();
        peminjaman3.save();
// test select all
        for (Peminjaman b : new Peminjaman().getAll()) {
            System.out.println("Id Anggota :" + b.getAng().getIdanggota() + ", idbuku: " + b.getBuku().getIdbuku() + ", Tgl Pinjam: " + b.getTanggalPinjam() + ", Tgl Kembali: " + b.getTanggalKembali());
        }
    }
}
//	// test search
//	for (Peminjaman b : new Peminjaman().search("40")) {

