/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dwike.Percobaan3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class DemoHasMap {
    public static void main(String[] args) {
        HashMap hMap = new HashMap();
        hMap.put("1", "Biskuit");
        hMap.put("2", "Shampoo");
        hMap.put("3", "Soap");
        System.out.println(hMap);
        
        Collection mColec = hMap.values();
        Iterator mIterator = mColec.iterator();
        while(mIterator.hasNext()){
            System.out.println(mIterator.next());
        }
        
        System.out.format("HasMap Item total : %d\n\n",hMap.size());
        
        Object mO = hMap.remove("1");
        System.out.format("%s remove from HasMap\n",mO);
        System.out.format("HasMap item total : %d\n",hMap.size());
        System.out.println(hMap);
        
        hMap.clear();
        System.out.format("HashMap item total : %d\n",hMap.size());
    }
}
