package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.anggota.AnggotaTest;
import unittest.database.KategoriTest;

public class TestRunner {
    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest.class);
        showMessageResult(mResult, MessageProcessorTest.class.getSimpleName());
        System.out.println("-----------------------------------------------------");
        mResult = new JUnitCore().runClasses(KategoriTest.class);
        showMessageResult(mResult, KategoriTest.class.getSimpleName());
        System.out.println("-----------------------------------------------------");
        mResult = new JUnitCore().runClasses(AnggotaTest.class);
        showMessageResult(mResult, AnggotaTest.class.getSimpleName());
    }
    
    private static void showMessageResult(Result mresult, String className) {
        if(mresult.wasSuccessful()) {
            System.out.format("The Result Test From %s : %s\n", className, mresult.wasSuccessful());
        }else {
            for(Failure failure : mresult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
