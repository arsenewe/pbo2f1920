/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bella.percobaan3;

/**
 *
 * @author bella
 */
import java.util.HashMap;
public class DemoHashMap {
    public static void main(String[] args){
      HashMap hMapItem = new HashMap();  
      hMapItem.put("1","Biskuit");
      hMapItem.put("2","Shampo");
      hMapItem.put("3","Soap");
      System.out.println(hMapItem);
      System.out.format("HashMap Item Tolal : %d\n\n", hMapItem.size());
      
      Object m0bject = hMapItem.remove("1");
      System.out.format("%s remove from Hashmap\n",m0bject);
      System.out.format("HashMap Item Tolal : %d\n", hMapItem.size());
      System.out.println(hMapItem);
      
      hMapItem.clear();
      System.out.format("HashMap Item Tolal : %d\n", hMapItem.size());
      
      
    }
    
}
