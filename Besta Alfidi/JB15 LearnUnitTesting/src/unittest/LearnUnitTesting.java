/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author Besta
 */
public class LearnUnitTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MessageProcessor mp = new MessageProcessor();
        mp.setSender("Besta");
        mp.setRecipient("Alfidi");
        mp.setMessage("Whats up bro?");
        mp.showMassage();
    }  
}
