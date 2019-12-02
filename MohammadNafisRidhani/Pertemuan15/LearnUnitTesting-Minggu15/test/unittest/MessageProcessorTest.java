/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MSI GAMING
 */
public class MessageProcessorTest {
    MessageProcessor mprocessor;
    
    public MessageProcessorTest() {
        mprocessor = new MessageProcessor();
        mprocessor.setSender("Ronaldo");
        mprocessor.setRecipient("Rafael");
        mprocessor.setMessage("Whats up bro?");
    }
    
    @Test
    public void testShowMessage() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mprocessor.messageFormat());
    }
}
