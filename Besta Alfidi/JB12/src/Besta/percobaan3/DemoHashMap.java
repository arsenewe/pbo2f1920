/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Besta.percobaan3;

/**
 *
 * @author Besta
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javafx.print.Collation;
public class DemoHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1","Biskuit");
        hMapItem.put("2","Shampoo");
        hMapItem.put("3","Soap");
        System.out.println(hMapItem);
        
        Collection mCollation = hMapItem.values();
        Iterator mIterator = mCollation.iterator();
        while(mIterator.hasNext()){
            System.out.println(mIterator.next());
        }
        
        System.out.format("HashMap Item Total : %d\n\n", hMapItem.size());
        
        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from HashMap\n",mObject);
        System.out.format("HashMap Item Total : %d\n\n", hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HashMap Item Total : %d\n\n", hMapItem.size());
    }
    
}
