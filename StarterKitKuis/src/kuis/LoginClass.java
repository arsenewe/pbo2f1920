package kuis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author septianenggarsukmana
 */
public class LoginClass {
    private String nama, telepon, password;
<<<<<<< HEAD

    public LoginClass() {
    }
    
    
    
    public LoginClass(String nama, String telepon, String password){
        this.nama = nama;
        this.telepon = telepon;
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public String info() {
        return "Halo, " + this.getNama() + ", dengan No Telp : " + this.getTelepon();
=======
    
    public LoginClass(String nama, String telepon, String password){
        this.nama = nama;
        this.telepon = telepon;
        this.password = password;
    }

    LoginClass() {
        
    }

    public String getNama() {   
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String info(){
        return "Halo, " + getNama() + ", No Telp : " + getTelepon();
        
        
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
    }
}
