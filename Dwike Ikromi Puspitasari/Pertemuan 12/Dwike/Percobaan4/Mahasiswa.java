/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dwike.Percobaan4;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String nim, nama, alamat;
    
    public Mahasiswa(String nim,String nama, String alamat){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    
}
