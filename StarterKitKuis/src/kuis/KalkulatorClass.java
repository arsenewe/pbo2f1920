/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.ArrayList;

/**
 *
 * @author septianenggarsukmana
 */
public class KalkulatorClass {
    ArrayList<Record> listKalkulator;
    
    public KalkulatorClass(){
        listKalkulator = new ArrayList<>();
<<<<<<< HEAD
    }
    public void isiData(String angka1,String angka2,String operator,String hasil){
        Record kalkulator=new Record(angka1, angka2, operator, hasil);
=======
<<<<<<< HEAD
    }
    
    public void isiData(String angka1, String angka2, String operator, String hasil) {
        Record kalkulator = new Record(angka1, angka2, operator, hasil);
        listKalkulator.add(kalkulator);
    }

    public ArrayList<Record> getData() {
        return listKalkulator;
=======
        
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
    }
    
    public void isiData(String angka1, String angka2, String operator, String hasil){
        Record kalkulator = new Record(angka1, angka2, operator, hasil);
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
        listKalkulator.add(kalkulator);
    }
    public ArrayList<Record> getData(){
        return listKalkulator;
    }
}
