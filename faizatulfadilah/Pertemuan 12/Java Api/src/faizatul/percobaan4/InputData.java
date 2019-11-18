package faizatul.percobaan4;
import java.util.ArrayList;

public class InputData {
    ArrayList<Mahasiswa> ListMahasiswa;
    
    public InputData() {
        ListMahasiswa = new ArrayList();
    }
    public void isiData (String Nim, String Nama, String Alamat) {
        Mahasiswa mhs = new Mahasiswa (Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa> getData() {
        return ListMahasiswa;
    }
}
