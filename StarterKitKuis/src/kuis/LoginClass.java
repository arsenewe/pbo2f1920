package kuis;
/**
 *
 * @author septianenggarsukmana
 */
public class LoginClass {
<<<<<<< HEAD
    private String nama, telepon, password;
=======
<<<<<<< HEAD
    private String nama,telepon,password;
=======
    private String nama, telepon, password;
<<<<<<< HEAD
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789

    public LoginClass() {
    }
    
    
<<<<<<< HEAD
    
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
=======
    
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
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
    
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
    
    public LoginClass(String nama,String telepon,String password){
        this.nama=nama;
        this.telepon=telepon;
        this.password=password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public String getTelepon() {
        return telepon;
    }
    
    public String info(){
        return "Halo, "+getNama()+". No Telp: "+getTelepon();
    }
}
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
