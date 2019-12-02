/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

/**
 *
 * @author PC
 */
public class TestBackend {
    public static void main(String[] args){
        Anggota a1 = new Anggota("Nilam", "Puloari", "082244259785");
        Anggota a2 = new Anggota("Yuniari", "Ngunut", "08282478345");
        Anggota a3 = new Anggota("Bella", "Srengat", "085232894429");

        // test insert
        a1.save();
        a2.save();
        a3.save();

        // test update
        a2.setAlamat("Kota Malang");
        a2.save();

        // test delete
        a3.delete();

        // test select all
        for(Anggota aa : new Anggota().getAll()){
        System.out.println("Nama: " + aa.getNama() + ", Ket: " + aa.getTelepon());
        }

        // test search
        for(Anggota aa : new Anggota().search("ilmiah")){
        System.out.println("Nama: " + aa.getNama() + ", Ket: " + aa.getTelepon());
        }
    }
}
