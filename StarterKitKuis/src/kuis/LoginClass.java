package kuis;
/**
 *
 * @author septianenggarsukmana
 */
public class LoginClass {
    private String nama, telepon, password;

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
        return "Halo, " + getNama() + ", dengan No Telp : " + getTelepon();
    }
}