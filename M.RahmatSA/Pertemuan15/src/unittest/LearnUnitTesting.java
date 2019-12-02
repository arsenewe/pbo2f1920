/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author RuminazVlntine
 */
public class LearnUnitTesting {
    public static void main(String[] args) {
        MessageProcessor mProcessor = new MessageProcessor();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("Whats up bro?");
        mProcessor.showMessage();
    }
}
