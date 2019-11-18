/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Besta.percobaan4;

/**
 *
 * @author Besta
 */
public class Mahasiswa {
    private String Nim;
    private String Nama;
    private String Alamat;
    
    public Mahasiswa(String Nim, String Nama, String Alamat){
        this.Alamat=Alamat;
        this.Nama=Nama;
        this.Nim=Nim;
    }
    public String getNama(){
        return Nama;
    }
    public String getNim(){
        return Nim;
    }
    public String getAlamat(){
        return Alamat;
    }
    
}
