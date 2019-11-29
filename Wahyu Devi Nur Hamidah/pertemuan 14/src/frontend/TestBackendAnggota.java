package frontend;

/**
 *
 * @author Wahyu devi
 */
import backend.Anggota;
public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota agt1 = new Anggota("Wahyu", "Malang", "123");
        Anggota agt2 = new Anggota("Devi", "Bojonegoro", "456");
        Anggota agt3 = new Anggota("Nur", "Malang", "789");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamat("Jawa Timur");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota k : new Anggota().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota a : new Anggota().search("Timur")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }

}
