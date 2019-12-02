/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author hp
 */
public class MessageProcessor {
    private String message, sender, recipient;
    
    public String getMessage() { 
        return message;
    }     
    
    public String getRecipient() {
        return recipient;
    }
    
    public String getSender() {
        return sender;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    
    public String messageFormat(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s",
                this.recipient, this.sender, this.message);
        return message;
    }
    
    public void showMessage(){
        System.out.println(messageFormat());
    }
 
} 
 
   

