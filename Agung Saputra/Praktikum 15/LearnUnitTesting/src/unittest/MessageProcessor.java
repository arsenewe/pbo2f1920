/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author USER
 */
public class MessageProcessor {
    private String message, sender, recepient;

    public String messageFormat(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s",
                this.recepient, this.sender, this.message);
        return message;
    }
    
    public void showMessage(){
        System.out.println(messageFormat());
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecepient() {
        return recepient;
    }

    public void setRecepient(String recepient) {
        this.recepient = recepient;
    }
    
    
}
