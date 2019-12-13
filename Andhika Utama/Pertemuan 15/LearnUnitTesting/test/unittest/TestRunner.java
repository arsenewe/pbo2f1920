/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;
import unittest.database.KategoriTest;
//import unittest.da;


/**
 *
 * @author ASUS
 */
public class TestRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Result mr = new JUnitCore().runClasses(MessageProcessorTest.class);
        showMessageResult(mr, MessageProcessorTest.class.getSimpleName());
        
        mr = new JUnitCore().runClasses(KategoriTest.class);
        showMessageResult(mr, KategoriTest.class.getSimpleName());
        
    }
    private static void showMessageResult(Result mr, String className){
        if(mr.wasSuccessful()){
            System.out.format("The Result Test from %s : %s\n",
                    className, mr.wasSuccessful());
        }else {
            for (Failure failure : mr.getFailures()){
                System.out.println(failure);
            }
        }
    } 
}