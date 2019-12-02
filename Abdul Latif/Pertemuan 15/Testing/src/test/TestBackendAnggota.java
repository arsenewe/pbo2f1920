/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;



public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota a1 = new Anggota("Abdul", "Malang", "111");
        Anggota a2 = new Anggota("Ahmad", "Surabaya", "222");
        Anggota a3 = new Anggota("Muhammad", "Jember", "333");
        

        a1.save();
        a2.save();
        a3.save();
        

        a2.setAlamat("Jawa Timur");
        a2.save();
        
        //test delete
        a3.delete();
        
        //tes select all
        for(Anggota k : new Anggota().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota a : new Anggota().search("Timur")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}
