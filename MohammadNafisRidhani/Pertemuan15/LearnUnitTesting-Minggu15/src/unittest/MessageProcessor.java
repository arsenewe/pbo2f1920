package unittest;

public class MessageProcessor {
    private String message, recipient, sender;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }
    
    public String messageFormat() {
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s",
                                        this.recipient, this.sender, this.message);
        return message;
    }
    
    public void showMessage() {
        System.out.println(messageFormat());
    }
}
