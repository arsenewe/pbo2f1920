/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittesting;

import org.junit.Test;
import org.junit.Assert;
import unittest.MessageProcessor;

/**
 *
 * @author user
 */
public class MessageProcessorText {
    MessageProcessor mp;
    public MessageProcessorText() {
        mp = new MessageProcessor();
        mp.setSender("Ronaldo");
        mp.setRecipient("Rafael");
        mp.setMessage("Whats up bro?");
    }
    @Test
    public void testShowMessage(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo."
                + "\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mp.messageFormat());
    }
    

}
