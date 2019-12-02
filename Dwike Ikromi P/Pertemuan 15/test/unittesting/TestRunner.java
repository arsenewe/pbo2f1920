/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittesting;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;
import unittest.database.AnggotaTest;
import unittest.database.KategoriTest;
/**
 *
 * @author user
 */
public class TestRunner {
   


    public static void main(String[]args){
        Result mResult = new JUnitCore().runClasses(MessageProcessorText.class);
        showMessageResult(mResult, MessageProcessorText.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(KategoriTest.class);
        showMessageResult(mResult, KategoriTest.class.getSimpleName());
    
        mResult = new JUnitCore().runClasses(AnggotaTest.class);
        showMessageResult(mResult, AnggotaTest.class.getSimpleName());
    }

    private static void showMessageResult(Result mResult, String className){
        if (mResult.wasSuccessful()) {
            System.out.format("The result test from %s : %s\n", className, mResult.wasSuccessful());
        } else{
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);    
            }
        }
    }

}