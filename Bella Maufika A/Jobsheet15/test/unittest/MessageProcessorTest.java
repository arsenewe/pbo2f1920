/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unittes.MessageProcessor;

/**
 *
 * @author bella
 */
public class MessageProcessorTest {

    MessageProcessor mp;

    public MessageProcessorTest() {
        mp = new MessageProcessor();
        mp.setSender("Ronaldo");
        mp.setRecipient("Rafael");
        mp.setMessage("Whats up bro?");
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
    @Test
    public void testShowMessage() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mp.messageFormat());
    }
}
