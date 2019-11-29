/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashabi.percobaan2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author kasbi
 */
public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        System.out.println(mListCountry);
        System.out.format("List index 0 = %S\n", mListCountry.get(0));
        System.out.format("List index 2 = %S\n", mListCountry.get(2));
        }
 }

