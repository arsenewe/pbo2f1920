/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;


public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota ang1 = new Anggota("Aliza Rizqi","Malang","081450299948");
        Anggota ang2 = new Anggota("Rizqi Aliza","Sukun","081251332123");
        Anggota ang3 = new Anggota("Fitriana","Mulyorejo","08231231231");
        
        ang1.save();
        ang2.save();
        ang3.save();
        
        ang2.setAlamat("Gadang");
        ang2.save();
        
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama : "+a.getNama()+", Alamat : "+a.getAlamat()+", Telepon: "+a.getTelepon());
        }
        
        for(Anggota a : new Anggota().search("Lampung")){
            System.out.println("Nama : "+a.getNama()+", Alamat : "+a.getAlamat()+", Telepon: "+a.getTelepon());
        }
    }
}
