/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Malik.percobaan3;

/**
 *
 * @author WINDOWS 10
 */
import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap hMapItem=new HashMap();
        hMapItem.put("1","Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        System.out.format("HashMap Item Tolal : %d\n\n",hMapItem.size());
        
        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from Hashmap \n",mObject);
        System.out.format("Hashmap Item Tolal : %d\n",hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("Hashmap Item Tolal : %d\n",hMapItem.size());
        
    }
}
