/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Besta.percobaan1;

/**
 *
 * @author Besta
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class DemoHashSet {
    public static void main(String[] args){ 
        Set mSetCity = new HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Bayuwangi");
        mSetCity.add("Jogjakarta");
        mSetCity.add("Batu");
//        set.add("Malang"); //eror
        
        System.out.println(mSetCity);
        Iterator<String>mIterator = mSetCity.iterator();
        
        while (mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        }
    }
}
