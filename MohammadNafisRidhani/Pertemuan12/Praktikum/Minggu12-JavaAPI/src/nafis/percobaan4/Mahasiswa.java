package nafis.percobaan4;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    
    public Mahasiswa(String Nim, String Nama, String Alamat) {
        this.nim = Nim;
        this.nama = Nama;
        this.alamat = Alamat;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
