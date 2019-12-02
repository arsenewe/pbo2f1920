/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author A S U S
 */
public class TestRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest.class);
        showMessageResult(mResult, MessageProcessorTest.class.getSimpleName());
    }
    
    private static void showMessageResult(Result mResult, String className){
        if(mResult.wasSuccessful()){
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        }
        else{
            for(Failure failure : mResult.getFailures()){
                System.out.println(failure);
            }
        }
    }
}
