/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashabi.percobaan4;
import java.util.ArrayList;
/**
 *
 * @author kasbi
 */
public class InputData {
    ArrayList<Mahasiswa> ListMahasisiwa;
    
    public InputData(){
        ListMahasisiwa = new ArrayList();
    }
    public void isiData (String Nim, String Nama, String Alamat){
        Mahasiswa mhs=new Mahasiswa (Nim, Nama, Alamat);
        ListMahasisiwa.add(mhs);
    }
    public ArrayList<Mahasiswa> getData(){
        return ListMahasisiwa;
    }
}
