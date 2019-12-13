/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

import Backend.*;

/**
 *
 * @author hp
 */
public class Perpus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");         
         Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");         
         Kategori kat3 = new Kategori("Komik", "Komik anak-anak");                  
// test insert         
        kat1.save();         
        kat2.save();         
        kat3.save();                  
// test update         
kat2.setKeterangan("Koleksi buku referensi ilmiah");         
kat2.save();                  
// test delete         
kat3.delete();                  
// test select all         
for(Kategori k : new Kategori().getAll())         {             
    System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());         
}                  
// test search         
for(Kategori k : new Kategori().search("ilmiah"))         {            
    System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan()); 
}   
    }
    
}
