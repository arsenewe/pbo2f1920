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
    
    public LoginClass(){
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setTelepon(String telepon){
        this.telepon = telepon;
    }
    public String getTelepon(){
        return telepon;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public String info(){
        return "Halo, "+getNama()+" No. Telepon "+getTelepon()+"";
    }
}
