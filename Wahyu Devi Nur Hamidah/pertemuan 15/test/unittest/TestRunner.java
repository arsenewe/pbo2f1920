package unittest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.AnggotaTest;
import unittest.database.KategoriTest;

public class TestRunner {
    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest.class);
        showMessageResult(mResult, MessageProcessorTest.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(AnggotaTest.class);
        showMessageResult(mResult, AnggotaTest.class.getSimpleName());
    }
    public static void showMessageResult(Result mResult, String className){
        if(mResult.wasSuccessful()){
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        }else{
            for (Failure failure : mResult.getFailures()){
                System.out.println(failure);
            }
        }
    }
}