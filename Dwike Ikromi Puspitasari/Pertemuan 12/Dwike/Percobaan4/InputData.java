/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dwike.Percobaan4;

import java.util.ArrayList;

public class InputData {
    
        ArrayList <Mahasiswa> ListMahasiswa;
    
    public InputData(){
        ListMahasiswa = new ArrayList();
    }
    public void isiData(String nim, String nama, String alamat){
        Mahasiswa mhs = new Mahasiswa (nim, nama, alamat);
        ListMahasiswa.add(mhs);
    }
    public ArrayList <Mahasiswa> getData(){
        return ListMahasiswa;
    }
}
