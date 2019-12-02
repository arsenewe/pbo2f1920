/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MessageProcessorTest {
    MessageProcessor mProcessor ;
    public MessageProcessorTest() {
        mProcessor = new MessageProcessor();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecepient("Rafael");
        mProcessor.setMessage("What up bro?");
    }
    

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testShowMessage(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : What up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormat());
    }
}
