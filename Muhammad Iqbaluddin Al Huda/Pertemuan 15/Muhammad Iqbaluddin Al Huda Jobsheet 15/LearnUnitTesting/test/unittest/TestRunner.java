/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.KategoriTest;

/**
 *
 * @author IQBAL
 */
public class TestRunner {
    
    public static void main(String[] args){
        Result mr = new JUnitCore().runClasses(MessageProcessorTest.class);
        showMessageResult(mr, MessageProcessorTest.class.getSimpleName());
        
        mr = new JUnitCore().runClasses(KategoriTest.class);
        showMessageResult(mr, KategoriTest.class.getSimpleName());
    }
    
    private static void showMessageResult(Result mr, String className) {
        if (mr.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", className, mr.wasSuccessful());
        } else {
            for (Failure failure : mr.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
