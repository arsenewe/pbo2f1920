/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;
/**
 *
 * @author ASUS
 */
public class TestBackendBuku {
  
    public static void main(String[] args) {
        Kategori novel = new Kategori().getById(1);
        Kategori referensi = new Kategori().getById(2);
        Buku buku1 = new Buku(referensi, "Pemrograman Phyton", "Andi", "Widodo Budiharto, SSi, MKom");
        Buku buku2 = new Buku(novel, "Senja&Pagi", "Gramedia", "Awwalur Rizqi Al-firori");
        Buku buku3 = new Buku(referensi, "Pemrograman C++", "Andi", "Abdul Kadir");
// test insert
        buku1.save();
        buku2.save();
// test update
        buku2.setJudul("Bumi Manusia");
        buku2.save();
// test delete
        buku3.delete();
// test select all
        for (Buku b : new Buku().getAll()) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
// test search
        for (Buku b : new Buku().search("Phyton")) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }}