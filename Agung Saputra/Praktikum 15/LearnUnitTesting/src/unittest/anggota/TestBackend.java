/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

/**
 *
 * @author USER
 */
public class TestBackend {

    public static void main(String[] args) {
        Anggota agt1 = new Anggota("agung", "tulungagung", "5969639553");
        Anggota agt2 = new Anggota("nilam", "tulungagung", "2739791639");
        Anggota agt3 = new Anggota("bella", "blitar", "27636636163");

        agt1.save();
        agt2.save();
        agt3.save();

        agt2.setAlamat("kota malang");
        agt2.save();

        agt3.delete();

        for (Anggota k : new Anggota().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", telp: " + k.getTelepon() + ", alamat: " + k.getAlamat());
        }

        for (Anggota k : new Anggota().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", telp: " + k.getTelepon() + ", alamat: " + k.getAlamat());
        }
    }

}
