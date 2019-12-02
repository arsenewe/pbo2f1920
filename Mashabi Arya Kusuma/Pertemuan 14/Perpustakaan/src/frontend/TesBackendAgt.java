/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.*;
/**
 *
 * @author User
 */
public class TesBackendAgt {
    public static void main(String[] args) {
        Anggota agt1 = new Anggota("Budi", "Kota Surabaya", "08723517891");
        Anggota agt2 = new Anggota("Andy", "Jakarta", "0854567890");
        Anggota agt3 = new Anggota("Aldo", "Kota Malang", "08345678932");
        
        agt1.save();
        agt2.save();
        agt3.save();
        
        agt2.setAlamat("Kota Bandung");
        agt2.save();
        
        agt3.delete();
        
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama: "+ a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
        
        for (Anggota a : new Anggota().search("Surabaya")){
            System.out.println("Nama: "+ a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
    }
   
}