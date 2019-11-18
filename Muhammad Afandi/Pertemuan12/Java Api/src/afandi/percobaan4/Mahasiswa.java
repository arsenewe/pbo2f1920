package afandi.percobaan4;

/**
 *
 * @author Windows
 */
public class Mahasiswa {
    private String Nim;
    private String Nama;
    private String Alamat;
    
    public Mahasiswa(String Nim, String Nama, String Alamat){
        this.Nim=Nim;
        this.Nama=Nama;
        this.Alamat=Alamat;
    }
    public String getNim(){
        return Nim;
    }
    public String getNama(){
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
}
