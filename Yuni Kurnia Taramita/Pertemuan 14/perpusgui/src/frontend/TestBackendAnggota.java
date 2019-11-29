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
public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota ang1 = new Anggota("Yuni","Bojonegoro","08122233344");
        Anggota ang2 = new Anggota("Dirga","Malang","085556778777");
        Anggota ang3 = new Anggota("Alif","Medan","085324555333");
        
        ang1.save();
        ang2.save();
        ang3.save();
        
        ang2.setAlamat("Surabaya");
        ang2.save();
	
	ang3.delete();
        
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama : "+a.getNama()+", Alamat : "+a.getAlamat()+", Telepon: "+a.getTelepon());
        }
        
        for(Anggota a : new Anggota().search("Malang")){
            System.out.println("Nama : "+a.getNama()+", Alamat : "+a.getAlamat()+", Telepon: "+a.getTelepon());
        }
    }
}
