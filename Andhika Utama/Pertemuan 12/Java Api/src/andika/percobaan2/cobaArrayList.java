/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andika.percobaan2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class cobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("Jerman");
        System.out.println(mListCountry);
        System.out.format("List index 0 =%s\n", mListCountry.get(0));
        System.out.format("List index 2 =%s\n", mListCountry.get(2));
    }
}
