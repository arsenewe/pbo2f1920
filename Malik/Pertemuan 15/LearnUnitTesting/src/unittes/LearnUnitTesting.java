/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittes;


public class LearnUnitTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MessageProcessor mp = new MessageProcessor();
        mp.setSender("Ronaldo");
        mp.setRecipient("Rafael");
        mp.setMessage("Whats up bro?");
        mp.showMessage();
    }

}
