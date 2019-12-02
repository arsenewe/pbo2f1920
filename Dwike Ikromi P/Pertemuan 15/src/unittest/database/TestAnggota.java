/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;
import unittest.database.DBHelper;
/**
 *
 * @author user
 */
public class TestAnggota {
    public static void main(String[] args) {
        Anggota angg1 = new Anggota("Livia", "Jl Ikan", "03414123456");
        Anggota angg2 = new Anggota("Yurike", "Jl Ikan Piranha", "03414123457");
        Anggota angg3 = new Anggota("Khuril", "Jl Ikan Piranha Atas", "0341412345");
        
        // test insert
        angg1.save();
        angg2.save();
        angg3.save();
        
        // test update
        angg2.setAlamat("Jl Ikan Piranha Atas");
        angg2.save();
        
        // test delete
        angg3.delete();
        
        // test select all
        for(Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
        
        // test search
        for(Anggota a : new Anggota().search("Piranha")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
    }
}
