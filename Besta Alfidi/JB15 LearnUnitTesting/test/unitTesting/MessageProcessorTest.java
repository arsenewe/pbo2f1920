/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitTesting;

import org.junit.Assert;
import org.junit.Test;
import unittest.MessageProcessor;

/**
 *
 * @author Besta
 */
public class MessageProcessorTest {
    MessageProcessor mp;
    public MessageProcessorTest(){
        mp = new MessageProcessor();
        mp.setSender("Besta");
        mp.setRecipient("Alfidi");
        mp.setMessage("Whats up bro?");
    }
    @Test
    public void testShowMessage(){
        String expectedResult = "Hai Alfidi, you have message from Besta."
                + "\nThe message as follow : Whats up bro?";
        Assert.assertEquals(expectedResult, mp.messageFormat());
    }
}
