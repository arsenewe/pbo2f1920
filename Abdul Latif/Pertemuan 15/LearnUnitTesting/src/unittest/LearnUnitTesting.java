/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author A S U S
 */
public class LearnUnitTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MessageProcessor mProcessor = new MessageProcessor();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("Whats up bro?");
        mProcessor.showMessage();
    }
    
}
